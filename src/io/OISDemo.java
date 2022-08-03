package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化
 *
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //将person.obj 反序列化
        FileInputStream stream = new FileInputStream("person.obj");
        ObjectInputStream ois  = new ObjectInputStream(stream);

//        Object object = ois.readObject();   //读出多少对象内容用一个Object 对象 接收
//        Person person = (Person) object;        //、
        Person person = (Person) ois.readObject();
//        String string = person.getName();
        System.out.println(person);
//        System.out.println(string);
        ois.close();



    }

}
