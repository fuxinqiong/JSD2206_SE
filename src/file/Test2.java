package file;

import java.io.File;
import java.io.FileFilter;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("./src/file");
        if (file.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String name = file.getName();
                    System.out.println("正在过滤"+name);
                    return name.contains("d");  //包含“d”的
                }
            };



        File[]  files = file.listFiles(filter);
//        files.
        for (int i=0;i<files.length;i++){
            System.out.println(files[i].getName());
        }


        }

    }
}
