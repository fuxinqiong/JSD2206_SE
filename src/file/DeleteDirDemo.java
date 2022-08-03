package file;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {
        //删除当前目录下的目录
        File dir = new File("demo");    //

        if (dir.exists()){
            dir.delete();   //多级目录下为空时可以删除
            System.out.println("已删除");
        }else {
            System.out.println("该目录不存在");
        }


    }
}
