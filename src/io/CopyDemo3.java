package io;

import java.io.*;

/**
 * 高级流
 *
 *
 *
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("demo.txt");      //复制源文件
        BufferedInputStream bufferedInputStream =new BufferedInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream("democopy03.txt");     //复制后文件

//        缓冲流可以加速传输效率
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        int d;
        long start = System.currentTimeMillis();
        while ((d=bufferedInputStream.read())!= -1){
            bufferedOutputStream.write(d);
        }
        long end = System.currentTimeMillis();

        System.out.println("复制完毕! 耗时: "+(end-start)+"ms");

        //只需关闭高级流
        bufferedInputStream.close();        //close中调用默认调用了flush方法
        bufferedOutputStream.close();




    }
}
