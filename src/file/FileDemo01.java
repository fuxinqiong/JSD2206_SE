package file;

import java.io.File;

/**
 * java.io.file
 * 访问其表示的文件或目录的属性
 */
public class FileDemo01 {
    public static void main(String[] args) {
        //绝对路劲的优点是清晰明了，但是缺点是写死了，跨平台性不好
        File file = new File("./demo.txt");     //新建一个file对象，赋值为一个demo.txt 文件
        String filename = file.getName();   //获取文件名字
        System.out.println(filename);
        long len = file.length();           //文件大小,单位字节
        System.out.println(len);

        boolean cw = file.canRead();        //是否可写
        System.out.println(cw);
        boolean cr = file.canRead();        //是否可读
        System.out.println(cr);
        boolean ce = file.canExecute();     //是否可执行
        System.out.println(ce);


    }
}
