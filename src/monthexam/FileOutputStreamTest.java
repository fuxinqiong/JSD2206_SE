package monthexam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("fos.tex");
        fos.write(5);
    }
}
