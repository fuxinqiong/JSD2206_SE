package file;

import java.io.File;
import java.io.IOException;

public class DeletFileDemo {
    public static void main(String[] args) throws IOException {
        File f2 = new File("./delete1.txt");    //
        f2.createNewFile();   //创建文件， 在相对目录中 ./ 是可以不用写的
        System.out.println(f2.getName());
        if (f2.exists()){
            f2.delete();
            System.out.println("文件已删除");
        }else {
            System.out.println("当前目录下未找到该文件/或不存在  ");
        }

    }
}
