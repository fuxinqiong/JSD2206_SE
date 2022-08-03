package io;

import java.io.*;

/**
 * Java IO 输入与输出   Input 和 Output
 *
 * 文件流  低级流，将字节写入到文件中
 *
 * java.io.FileInputStream 和 FileOutputStream
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        File f =  new File("./");

        FileOutputStream fileOutputStream = new FileOutputStream("./fos.dat");       //文件所在目录一定要正确
        fileOutputStream.write(1);
        fileOutputStream.write(2);
        fileOutputStream.write(3);
        fileOutputStream.write(4);
        fileOutputStream.close();       //关闭io流
        System.out.println("输入完毕");
        FileInputStream fileInputStream = new FileInputStream("./fos.dat");
        int read = fileInputStream.read();
        read = fileInputStream.read();
        read = fileInputStream.read();
        read = fileInputStream.read();
        read = fileInputStream.read();
        System.out.println(read);










    }
}
