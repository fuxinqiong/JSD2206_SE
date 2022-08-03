package homeworkday01.day02;

import io.Person;

import java.io.*;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的用户名：");
        String l1 = scanner.nextLine();
        System.out.println("请输入你的密码：");
        String l2 = scanner.nextLine();


        User user = new User(l1,l2,"xiaohei",18);
        String a = user.name;
        File file = new File(a+".obj");
        if (!file.exists()){
            file.createNewFile();
            System.out.println("文件已创建");
        }else {
            System.out.println("文件已存在");
        }

/*        String name  = "zhangsan";
        String pwd =  "zhangs123456";
        String nick = "xiaosan";
        int age = 18;
        User zs = new User(name,pwd,nick,age);*/
        long start = System.currentTimeMillis();
        //写出Scanner 输出内容到文件
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos =new ObjectOutputStream(fos);
        oos.writeObject(user);
        System.out.println("文件写出完毕!");
        System.out.println("文件大小："+file.length()+"kb");
        long end = System.currentTimeMillis();
        System.out.println("保存文件耗时："+(end-start)+"ms");

        long start1 = System.currentTimeMillis();
        //反序列化（字符转换字节）读出文件
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        User user1 = (User) obj;
        System.out.println("反序列化读出完毕! 内容如下：");
        System.out.println(user1);
        long end1 = System.currentTimeMillis();
        System.out.println("反序列化完成，读取耗时："+(end1-start1)+"ms");

        System.out.println("总耗时："+(end1-start)+"ms");


        ois.close();    //关闭对象输入流
        System.out.println("对象输入流已关闭。");
        oos.close();    //关闭对象输出流
        System.out.println("对象输出流已关闭。");

    }

}
class User implements Serializable{
    String name;
    String pwd;
    String nick;
    int age;

    public User(String name, String pwd, String nick, int age) {
        this.name = name;
        this.pwd = pwd;
        this.nick = nick;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }


}