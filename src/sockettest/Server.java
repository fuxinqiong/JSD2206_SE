package sockettest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * 聊天室服务端
 */
public class Server {
    /*
        运行在服务端的ServerSocket,主要作用两个:
        1:开启服务端口,客户端就是通过这个端口与服务端建立连接的.(ServerSocket构造方法)
        2:监听该端口,一旦一个客户端连接时,就会返回一个Socket实例与其通讯.(accept()方法的作用)
     */
    private ServerSocket serverSocket;

    //保存所有客户端的输出流用于广播消息
    private PrintWriter[] allOut = {};
    public Server(){
        try {
            System.out.println("正在启动服务端...");
            /*
                如果执行下面代码出现异常:
                java.net.BindException:address already in use
                原因是申请的8088端口已经被系统其它程序占用了.
             */
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){

        try {
            while(true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();//阻塞方法
                System.out.println("一个客户端连接了!");
                //启动一个线程负责处理该客户端交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 该线程任务负责与指定客户端进行交互
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//记录当前对应客户端的IP地址

        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取远端计算机IP地址(获取到了客户端的)
            host = socket.getInetAddress().getHostAddress();
        }

        public void run(){
            PrintWriter pw = null;
            try {
                //通过刚接受连接的socket,获取输入流来读取该客户端发送过来的消息read
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                //通过socket 获取输出流给客户端发送消息write
                OutputStream out = socket.getOutputStream(); //通过socket 的输出流
                OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);   //
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);  //仅赋值不定义类型。上面已定义
                synchronized (Server.this) {
                    //将该输出流存入到共享数组allOut 中、
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);     //数组扩容
                    allOut[allOut.length - 1] = pw;       //将当前pw存入一个数组最后一位中，
                }
                sendMessage(host+"上线了，当前上线人数："+allOut.length);

                String line;
                while((line = br.readLine())!=null) {
                    sendMessage(host+"说:" + line);
//                    pw.println(host +"服务端说："+ line);

                }
            } catch (IOException e) {
//                e.printStackTrace(); //
            }finally {
                //处理客户都断开连接后的操作
                //删除pw 引用 数组，将pw从数组allOut中删除，断开
                System.out.println(allOut.length);
                synchronized (Server.this){
                for (int i = 0; i < allOut.length; i++) {
                    if (allOut[i] == pw) {     //finally中的为最后的线程，
                        allOut[i] = allOut[allOut.length - 1];
                        allOut = Arrays.copyOf(allOut, allOut.length - 1);
                        break;
                    }
                }

                }
                System.out.println(allOut.length);
                sendMessage(host +"已断开连接!当前在线人数："+ allOut.length);

//                allOut = Arrays.copyOf()
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        private void sendMessage(String message){
            System.out.println(message);
//            pw.println(host +"服务端说："+ line);
            synchronized (Server.this){     //与缩容扩容互斥锁
                    for (int i = 0; i < allOut.length; i++) {
                        allOut[i].println(message);
                    }
                }
            }
    }

}
