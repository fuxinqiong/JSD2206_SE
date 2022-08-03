package homeworkday01.day02;

import java.io.*;

public class Test01 {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            File file = new File("test.txt");
            if (!file.exists()){
                System.out.println("文件不存在，已在当前目录下创建新文件");
            file.createNewFile();    //Alt + Enter
            }
//            else {
//                System.out.println("目录下该文件已存在");
//            }
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fileInputStream);

            FileOutputStream fileOutputStream = new FileOutputStream("test_cp.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
            int d= 0;
            if ((d=bis.read() )!= -1){
                bos.write(d);
            }
            long end = System.currentTimeMillis();
            System.out.println("复制完毕，耗时："+(end-start)+"ms");



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
