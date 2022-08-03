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
            throw new RuntimeException(e);
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

                //通过刚刚接收连接的
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String line ;
                while((line= br.readLine())!=null){
                    System.out.println("客户端说：" + line);

            }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("一个客户端连接了!");

    }

    public static void main(String[] args) {
        System.out.println("建立服务器");
        Server server = new Server();
        server.start();
    }
}
