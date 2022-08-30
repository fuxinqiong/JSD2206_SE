package monthexam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Pwtest {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("pwtest.txt","UTF-8");
        pw.println("97");

        pw.close();
    }
}
