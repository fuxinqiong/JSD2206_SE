package monthexam;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("pwdemo.txt");
        pw.write("第一行内容不换行");
        pw.println("第二行换行了");
        pw.println("第三行换行啦");
        pw.close();
    }
}
