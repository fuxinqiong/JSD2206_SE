package monthexam;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWDemo2 {
    public static void main(String[] args) throws IOException {
        /* 向文件中按行写入*/
        FileOutputStream fos = new FileOutputStream("pw21.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("嘿嘿");
        pw.println("哈哈哈");
        pw.close();
    }
}
