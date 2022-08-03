package homeworkday01.day01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {

        System.out.println("请输入一个文件名：");
        Scanner scanner =new Scanner(System.in);


        while (true){
            String name = scanner.nextLine();
            File file = new File(name);
            String fileName = file.getName();
//        System.out.println(name.equals(file.getName()));
            if(file.exists()&&name.equals(file.getName()) ){
                System.out.println("文件名已存在，请重新输入!");
//                String name = scanner.nextLine();
                continue;

//                System.out.println("111111");
            }else{
//                 if ()){\
//
//                }else {
                file.createNewFile();
                System.out.println("文件已创建");

//                }
            }
        break;
        }






    }
}
