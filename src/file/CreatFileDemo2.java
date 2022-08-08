package file;

import java.io.File;
import java.io.IOException;

public class CreatFileDemo2 {
    public static void main(String[] args) {
        File file = new File("test.test");
        boolean b = file.exists();

        System.out.println(b);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(b);

    }
}
