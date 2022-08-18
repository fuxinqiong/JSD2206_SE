package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls =Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        //调用一个参数方法
        Method m1 = cls.getMethod("say", String.class);//传入方法名，传入参数类对象
        m1.invoke(obj,"nihao"); //

        //调用两个参数方法
        Method m2 = cls.getMethod("say", String.class, int.class);  //传入方法名，传入参数类对象
        m2.invoke(obj,"bucuoo" , 10);
    }
}
