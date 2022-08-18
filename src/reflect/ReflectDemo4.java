package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 使用反射机制调用方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person p = new Person();
        p.sayHello();


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类名：");
        String className = scanner.nextLine();
        System.out.println("请输入一个方法名：");
        String methodName = scanner.nextLine();

        //实例化一个Person对象
        Class cls = Class.forName(className);//"reflect.Person"
        Object obj = cls.newInstance();


        //获取要调用的方法
        Method method = cls.getMethod(methodName);//"sayHello"
        method.invoke(obj);


    }
}
