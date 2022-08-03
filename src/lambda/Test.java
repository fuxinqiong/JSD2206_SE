package lambda;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //获取当前项目目录下的名字中含有字母的所有子项
        File file =  new File("./");
        File[] files = file.listFiles();    //获取所有的当前目录下的文件
//        File[] files = file.listFiles(f->f.getName().contains("o"));  //获取所有的当前目录下包含”o“的文件目录
        for (int i=0;i<files.length;i++){
            System.out.println(files[i]);    //目录
            System.out.println(files[i].getName());    //目录名字

        }












    }
}
