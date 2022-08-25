package socket01;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {

    private Socket socket;

    public Client() {
        try {
            System.out.println("正在连接服务器端...");
            /**
             * 端口被占用时
             * cmd ->
             * netstat -ano 查看所有被占用的端口号的进程
             * netstat -aon|findstr "8080"  找出对应端口的占用程序
             * 杀掉该进程 pid
             *
             * 或者直接仅任务管理器中杀掉Java对应进程
             */
            socket = new Socket("localhost",8088);
            System.out.println("与服务端连接!!!!!!!!!!!!!!!!!!11");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            //流连接
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);

            Scanner scanner = new Scanner(System.in);
            System.out.println("请发送信息：");
            while (true) {
                String line = scanner.nextLine();
                if ("exit".equals(line)){
                    break;
                }

//                pw.println("你好服务端!");
                pw.println(line);
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

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
