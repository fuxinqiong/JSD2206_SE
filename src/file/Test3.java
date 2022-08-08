package file;

import java.io.File;
import java.io.FileFilter;

public class Test3 {
    public static void main(String[] args) {
        //只要file表示的文件的名字是以"D"开始的则接受

        FileFilter filter = (File file) ->{
                String name = file.getName();
                return name.startsWith("D");    //以D开头的
        };

        File  dir = new File("./src/file");
        File[] subs = dir.listFiles(filter);
        for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i].getName());
        }
    }

}
