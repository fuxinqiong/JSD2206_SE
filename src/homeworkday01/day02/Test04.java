package homeworkday01.day02;

import java.io.*;

public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("a.txt")));
        oos.writeObject(new User("lisi","123456","02",18));
        oos.writeObject(new User("lisi02","123456","02",18));
        oos.writeObject(new User("zhangsan02","123456","02",19));
        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("a.txt")));
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        System.out.println(ois.readObject());
        ois.close();


    }
}
