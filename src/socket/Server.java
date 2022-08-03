package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {

    private ServerSocket serverSocket;
    public Server (){
        System.out.println("正在启动服务器...");

        try {
            serverSocket = new ServerSocket(8080);
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
        System.out.println("服务器启动完成");
    }
    public void start(){
//        System.out.println("等待客户端连接....");
        try {
            System.out.println("等待客户端连接...");
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了");
                //启动一个线程负责处理客户端交互
                ClientHandler handler = new ClientHandler(socket);    //需要处理的任务，
                Thread t = new Thread(handler);         //任务接入线程中
                t.start();

                //通过刚刚接收连接的

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("一个客户端连接了!");

    }

    private class ClientHandler implements Runnable{
        //调用外部类的变量时，通过构造器传参
        private Socket socket;
        private String host;    //记录当前对应客户端的地址
//        host  =
        public ClientHandler(Socket socket){
            this.socket = socket;
            host = socket.getInetAddress().getHostAddress();
        }
        public void run(){
            try {
                InputStream in = socket.getInputStream();       //调用外部类的时候
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String line ;
                while((line= br.readLine())!=null){
                    System.out.println(host+ "客户端说：" + line);

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
    public static void main(String[] args) {
        System.out.println("建立服务器");
        Server server = new Server();
        server.start();

    }

}
