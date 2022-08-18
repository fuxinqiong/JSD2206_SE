package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");
        Object obj =cls.newInstance();

        Method method = cls.getDeclaredMethod("heihei");
        method.setAccessible(true);
        method.invoke(obj);
    }
}
