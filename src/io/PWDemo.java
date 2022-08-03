package io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字符流
 * Java.io.BufferedWriter BufferedReader
 * 缓冲字符流是一对高级流，内部默认维护一个8k（8000）长度的char数组
 * 来保证读写效率
 *
 *
 * java.io.PrintWriter
 */
public class PWDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("pw1.txt");
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        int a;
        osw.write("我祈祷拥有你+\n");
        osw.write("c穿越活鲜鲜取拥抱你\n");
        osw.write("写出完毕");
        System.out.println("写出完毕!");
        osw.close();

        /** 向文件中写入字符    */
/*        PrintWriter pw = new PrintWriter("pw.txt");
        //向文件中写入字符流
        pw.println("我祈祷拥有你");
        pw.println("c穿越活鲜鲜取拥抱你");
        System.out.println("写出完毕!");
        pw.close();
//        OutputStreamWriter

 */


        
    }
}
