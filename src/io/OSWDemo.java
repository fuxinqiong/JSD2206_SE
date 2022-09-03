package io;

/**
 *字符输出流，高级流
 * java IO将流按照读写数据的单位划分为字节与字符流
 * java.io.InputStream和OutputStream是所有字节流的超类，是抽象类。
 * java.io.Reader和Writer则是所有字符流的超类，是抽象类。
 * 字节流与字符流的超类互相不存在继承关系，是平级的。
 *
 * Reader中定义了几个read方法，规定所有字符流都必须具备的读取字符的方法
 * Writer中定义了几个write方法，规定了所有字符流都必须具备的写出字符的方法
 *
 *
 * 转换流
 * java.io.InputStreamReader和OutputStreamWriter
 * 实际开发中当我们进行流连接对文本数据读写时，这几乎是一套必不可少的高级流。但是在
 * 流连接中我们不会直接操作这两个流。
 *
 * 转换流意义:
 * 转换流本质上是一对字符流，但是他们是唯一连接在字节流上的字符流。在流连接中起到"转换器"
 * 的作用。负责衔接字符与字节流。
 * 而字符流由于读写都是字符，字节流读写都是字节，因此转换流在字符与字节中间负责转换。
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
