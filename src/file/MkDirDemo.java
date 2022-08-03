package file;

import java.io.File;
import java.io.IOException;

public class MkDirDemo {
    public static void main(String[] args) throws IOException {
        //


        //创建目录，，
//        File dir = new File("dirdemo");     //注意不能有后缀
//        File dir = new File("demo1mkdir");
        File dir = new File("./A/B/C/D/");

//        dir.createNewFile();
        if (dir.exists()){
            System.out.println("该目录已存在");
        }else {
//            dir.mkdir();        //调用创建单级目录方法
            dir.mkdirs();   /** 目录未创建成功 */  //多级目录
            System.out.println("该目录已创建");
        }
    }
}
