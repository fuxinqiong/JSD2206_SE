package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字符输入流，读出文件内容
 *特点：
 *      1、快读文件数据加速
 *      2、按行读取字符串
 *
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
      //将当前源程序输出到控制台上
        FileInputStream fis = new FileInputStream("./src/io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8); //字符集需要指定

        BufferedReader br = new BufferedReader(isr);

        /**
         * BufferedReader
         */

        //按行输出字符串
        String line = br.readLine();    //读取第一行，遇换行符/n，停止
        System.out.println(line);

        //输出所有的line
        String line1 ;
        while ((line1 = br.readLine() )!=null){
            System.out.println(line1);
        }
//        br.lines();
//        System.out.println();
//        br.read();
        br.close();

    }
}
