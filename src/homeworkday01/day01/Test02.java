package homeworkday01.day01;

import java.io.File;
import java.io.FileFilter;

public class Test02 {
    public static void main(String[] args) {
//        列出当前目录中所有名字包含s的子项
        File file = new File("./");

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains("s");
            }
        };
        File[] files = file.listFiles(filter);
        for (int i=0;i< files.length;i++){
//            File subs = files.
            System.out.println(files[i].getName());
        }





    }
}
