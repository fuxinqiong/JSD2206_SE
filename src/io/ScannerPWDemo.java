package io;
/**
 * 简易记事本
 * exit 退出
 *
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ScannerPWDemo {
    public static void main(String[] args) throws IOException {
        //1.创建文件流（低级流，字节流）:向文件中写入字节数据
        FileOutputStream fos = new FileOutputStream("pwdemo3.txt",true);        //追加字符，不会修改原来的
        //2.创建转换流: 衔接字节与字符流，负责将写出的字符转换为字节
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //3.创建缓冲字符流：块写文本加速
        BufferedWriter bw = new BufferedWriter(osw);    //默认16kb
        //4.按行写出字符串，自动行刷新
        PrintWriter pw = new PrintWriter(bw,true); //true：自动行刷新，调用flush，这个参数可调用也可不调用

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要写入的文本内容：");


//
        while (true){
            String line = scanner.nextLine();
            if ("exit".equals(line)){
                break;
            }
            pw.println(line);
//            pw.flush(); //所有的输出流都有flush(); 方法



        }
        System.out.println("写出完毕");
        pw.close();



    }
}
