package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;  //套接字
//    private String ip;
//    String ip = "localhost";
    public Client(){
        try {
            System.out.println("正在连接服务器...");
            socket = new Socket("localhost",8088);
            System.out.println("与服务端建立连接!");
        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }

    public void start(){
//        Socket socket =s
        //客户端向服务端发送数据，则需要使用socket 获取输出流
        try {
            OutputStream out = socket.getOutputStream();  //通过网络输出流发送字节
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);   //转换流
            BufferedWriter bw = new BufferedWriter(osw);    //缓冲流
            PrintWriter pw = new PrintWriter(bw,true);  //换行输出流，自动行刷新
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你要发送的信息：");
            while (true){
                String line = scanner.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                pw.println(line);
//                if ()
//                System.out.println(line);
                System.out.println("信息发送中....");

            }


            //简写
//            PrintWriter pw1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

//            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("程序开始了");
        Client client = new Client();
        client.start();
        System.out.println("运行完毕");

    }






}
