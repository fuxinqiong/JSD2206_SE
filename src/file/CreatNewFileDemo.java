package file;

import java.io.File;
import java.io.IOException;

public class CreatNewFileDemo {
    public static void main(String[] args) throws IOException {

        File f1 = new File("./creat1.txt");
        if (!f1.exists()){
            System.out.println("文件不存在，已在当前目录下创建新文件");
//            f1.createNewFile();    //Alt + Enter
        }else {
            System.out.println("目录下该文件已存在");
        }



    }
}
