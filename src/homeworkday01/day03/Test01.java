package homeworkday01.day03;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Test01 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos =new FileOutputStream("testpw.txt");
            OutputStreamWriter osw =new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("你好，我喜欢你!");
            System.out.println("写出完毕");




        }catch (Exception e ){
            System.out.println("出错了!");

        }
    }
}
