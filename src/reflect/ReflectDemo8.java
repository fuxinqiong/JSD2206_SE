package reflect;

import java.lang.reflect.Method;

/**
 *
 */
public class ReflectDemo8 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class cls = Class.forName("reflect.Person");
        Object  obj = cls.newInstance();

        Method method = cls.getMethod("sayHello");

        if (method.isAnnotationPresent(AutoRunMethod.class)){
            AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
            int d = arm.value();
            System.out.println("参数:"+d);
        }

    }
}
