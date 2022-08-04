package io;
/**
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("sea.png");
        FileOutputStream f1 = new FileOutputStream("sea1.png");
        int d ;     //每次读取记录的字节内容
        long start = System.currentTimeMillis();
        while ((d= f.read()) != -1){   //若读取到了-1，则停止循环，停止写入，
            f1.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕! 耗时"+(end-start)+"ms");


        f.close();      //一定要关
        f1.close();     //一定要关



    }
}
