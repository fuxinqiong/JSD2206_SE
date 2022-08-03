package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 *
 * 缓冲输出流的缓冲区问题
 */
public class BOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String line = "1231jkaj这是一段字符";

        byte[]  data  =  line.getBytes(StandardCharsets.UTF_8);
        bos.write(data);

        /*
        void flush()
        会将当前缓冲区已缓存的数据一次性写出
         */

        System.out.println("写出完毕");
        bos.close();










    }
}
