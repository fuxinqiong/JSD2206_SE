package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person p = new Person("lisi", 22);
        System.out.println(p);

        Class cls = Class.forName("reflect.Person");
        Constructor c =  cls.getConstructor(String.class,int.class);
        Object obj = c.newInstance("wangwu",33);
        System.out.println(obj.toString());

    }
}
