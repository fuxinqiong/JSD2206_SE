package file;

import java.io.File;

/***
 * 获取一个目录中的所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前目录下的子项
        File dir = new File(".");
        if (dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println();
            for (int i=0;i< subs.length;i++){

                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }



    }
}
