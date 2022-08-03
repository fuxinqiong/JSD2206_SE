package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中写入数据
 *
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        //向fos.txt 中写入字符串
//        FileOutputStream fileOutputStream = new FileOutputStream("fos.txt");        //创建文件流时，覆盖源文件内容
        FileOutputStream fileOutputStream = new FileOutputStream("fos.txt",true);        //创建文件流时，不覆盖源文件内容，在之前基础上进行追加新增加的代码
        String line = "爱你孤身\n";

        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(data);

        line = "akjmkml,mfllmfl此时流不覆盖，会在流开始的时候，继续输入\n";
        data = line.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(data);
        System.out.println("写出完毕!");
        fileOutputStream.close();




    }
}
