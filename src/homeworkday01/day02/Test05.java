//package homeworkday01.day02;
//
//public class Test05 {
//}
package homeworkday01.day02;
//将当前目录下的所有obj文件获取到，并进行反序列化后，输出每个用户的信息（），直接输出反序列化后的User对象即可

import io.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File dir = new File(".");   //新建一个文件对象，获取当前目录下的所有的文件
        File[] subs = dir.listFiles((f)->f.getName().endsWith(".obj")); //*找出当前文件目录下 的所有后缀为obj的文件

        for (int i=0;i<subs.length;i++){
//            System.out.println(subs[i]);
            File sub = subs[i];
            FileInputStream fis = new FileInputStream(sub);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();

            if (obj instanceof User){
                User user = (User) obj;
                System.out.println(user);
            }
            if (obj instanceof Person){
                Person person = (Person) obj;
                System.out.println(person);
            }

        }



/*
        for (int i=0;i<subs.length;i++){
            File sub = subs[i];
//            FileInputStream fis = new FileInputStream(sub);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            User user = (User) obj;
//            File file1 = (File) obj;
            System.out.println(user);
//            System.out.println(file1);
            ois.close();


        }

 */







//            File file1 = (File) obj;
//            System.out.println(file1);



    }
}
