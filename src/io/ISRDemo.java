package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用转换流读取文本数据，字符流
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis  =new FileInputStream(
                "./src/io/ISRDemo.java"
        );
        InputStreamReader isr = new InputStreamReader(fis);

        /**
         *读出指定文件的字符内容
         */
        int d ;
        while ((d = isr.read()) != -1){
            char c = (char) d;
            System.out.print(c);
        }

        isr.close();



    }
}
