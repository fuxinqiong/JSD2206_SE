package file;

import java.io.File;

public class ListFilesDemo03 {
    public static void main(String[] args) {
        File file = new File("./");
        System.out.println(file.toString());
    }
}

