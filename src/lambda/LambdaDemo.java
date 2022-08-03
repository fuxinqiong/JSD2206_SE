package lambda;

//lambda 表达式可以面向函数式编程

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo {
    public static void main(String[] args) {

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().contains("t");
            }
        };

        //lambda 表达式
//        FileFilter filter1 = (File file)-> {        //参数类型可以省略 File
//        FileFilter filter1 = (file)-> {        //参数类型可以省略 File
        FileFilter filter1 = (File file) -> {     //

            return file.getName().contains("t");
        };

        //如果方法体中只有一句代码时，方法体的”{}“可以不写
        //如果这句代码中含有return关键字，那么忽略”{}“的同时也要一同忽略
        FileFilter filter2 = (file) -> file.getName().contains("t");     //一个参数
        FileFilter filter3 = (file) -> file.getName().contains("t");     //两个参数


        //如果参数中只有一个参数时，”（）“可以不写
        FileFilter filter4 = file -> file.getName().contains("t");     //

        File file = new File("./src/file");
        File[] subs = file.listFiles(new FileFilter() {     //
            @Override
            public boolean accept(File file) {
                return file.getName().contains("t");
            }
        });


        File[]  subs1 = file.listFiles(f-> f.getName().contains("t"));

    }



}
