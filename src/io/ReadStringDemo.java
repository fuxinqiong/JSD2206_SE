package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("fos.txt");
        FileInputStream  fileInputStream = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fileInputStream.read(data);     //

        /*
        String提供的构造器
        String（byte[] data, Charset charset）
        将给定的字节数组data中所有的字节按照给定的字符集charset 转换为一个字符串
         */
        String line = new String(data, StandardCharsets.UTF_8);
        System.out.println(line);

        fileInputStream.close();    //关闭读写流
        //
        System.out.println("--------------------------------字符内容读取完毕-------------------------------------!");






    }
}
