package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 重载的listFlies方法‘’
 * File[] listFiles(FileFliter fliter)
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        File file = new File("./src/file");
        if (file.isDirectory()){
            //使用匿名内部类创建一个文件过滤器
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String name = file.getName();
//                    return name.indexOf("t")>=0;  //包含t 字符串的
                    return name.contains("t");      //contains 包含内容区分大小写
                }
            };
            File[] subs = file.listFiles(filter);
            for (int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());



            }
        }


    }
}
