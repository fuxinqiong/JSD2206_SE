package file;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //在当前目录下新建100个文件，命名为test1.txt
//        File[] files = new File[100];

//      创建文件
        for (int i=0;i<10;i++){
//            String name = files[i].createNewFile();
            File file = new File("./test"+i+".txt");
            file.createNewFile();
        }
        System.out.println("创建完毕!");

        //删除文件
        for (int i=0;i<10;i++){
//            String name = files[i].createNewFile();
            File file = new File("test"+i+".txt");
            file.delete();
        }

        System.out.println("删除完毕!");


    }
}
