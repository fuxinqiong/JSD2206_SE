package reflect;

import java.util.Scanner;

public class ReflectDemo2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        //new Person
        Person p  = new Person();
        System.out.println(p);


        //再通过反射机制 重新new 一个Person
//        Class cls = Class.forName("reflect.Person");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类全名：");
        /**
         * java.util.Date
         * java.util.ArrayLIst
         * java.util.HashMap
         * reflect.Person
         * reflect.Student
         */
        String classname = scanner.nextLine();

        Class cls = Class.forName(classname);   //利用公开的无参构造进行
        Object obj = cls.newInstance();
        System.out.println(obj);




    }
}
