package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 自行完成流连接 的创建
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * 向文件中写入文本数据，在字节流上连接其他的流，需要按顺序连接  字节->>字符流 ->>块写 ->> 换行写出字符串，自动刷新->>
         */
        //1.创建文件流（低级流，字节流）:向文件中写入字节数据
        FileOutputStream fos = new FileOutputStream("pwdemo2.txt",true);    //追加模式
        //2.创建转换流: 衔接字节与字符流，负责将写出的字符转换为字节
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //3.创建缓冲字符流：块写文本加速
        BufferedWriter bw = new BufferedWriter(osw);    //默认16kb
        //4.按行写出字符串，自动行刷新
        PrintWriter pw = new PrintWriter(bw);

        pw.println("aisdnfnnalJFK马蒂马路上地方");
        pw.println("dkalflklfakf卡夫卡离开");
//        while ()
        pw.close();
        System.out.println("写出完毕");

    }
}
