package io;
/**
 *字符输出流，高级流
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream  fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);   //一定要注意，不能用默认的，需要传入字符的编码参数（标准字符集）
//        OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8);     //不支持直接传，需要抛异常
        String line = "n您发范家发你asdf";
        osw.write(line);

        osw.write("sjjdkjfkakfk ,这个是追加的");

        System.out.println("写出完毕");
        osw.close();



    }
}
