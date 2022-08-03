package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//文件输出流，用于从文件中读取字节数
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("fos.dat");
        int  d = fileInputStream.read();
        System.out.println(d);
//        byte b = fileInputStream.read();
/*        for (int i=0;i<4;i++){
            d = fileInputStream.read();
        }

 */

/*
        d = fileInputStream.read();
        System.out.println(d);

        d = fileInputStream.read();
        System.out.println(d);
        d = fileInputStream.read();
        System.out.println(d);
        d = fileInputStream.read();
        System.out.println(d);
        d = fileInputStream.read();
        System.out.println(d);

 */
        System.out.println("写出完毕!");


        fileInputStream.close();        //关闭流


    }
}
