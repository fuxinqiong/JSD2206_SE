package homeworkday01.day03;

import java.io.*;
import java.nio.charset.StandardCharsets;

//完成一个转码工具
public class Test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("note.txt");
        InputStreamReader isr = new InputStreamReader(fis, "GBK"); //字符集需要指定

        BufferedReader br = new BufferedReader(isr);

        /**
         * BufferedReader
         */

        //按行输出字符串
        String line = br.readLine();    //读取第一行，遇换行符/n，停止
        System.out.println(line);

//        FileOutputStream fos = new FileOutputStream();
//        FileInputStream fis = new FileInputStream();
        FileOutputStream fos = new FileOutputStream("note_utf.txt",true);
        //2.创建转换流: 衔接字节与字符流，负责将写出的字符转换为字节
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //3.创建缓冲字符流：块写文本加速
        BufferedWriter bw = new BufferedWriter(osw);    //默认16kb
        //4.按行写出字符串，自动行刷新
        PrintWriter pw = new PrintWriter(bw);

    }
}
