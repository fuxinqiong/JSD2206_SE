package io;
//提高每次读写的数据量，减少实际读写的次数，提高读写效率

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("sea.png");
        FileOutputStream outputStream = new FileOutputStream("sea3.png");

        byte[] data = new byte[1024*10];    //10kb
        int len = 0;

        long start  = System.currentTimeMillis();

        while ((len = inputStream.read(data)) != -1){       //len 为每次数组的长度
            outputStream.write(data);           //  快写操作,不常用，有缺陷，经常会比源文件大一点，误差在
            outputStream.write(data,0,len); // 常用
        }

        long end = System.currentTimeMillis();
        System.out.println("复制完毕，耗时："+(end-start)+"ms");




    }
}
