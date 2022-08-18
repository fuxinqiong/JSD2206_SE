package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");

        Object obj = cls.newInstance();

        Method[] methods = cls.getDeclaredMethods();    //调用本类的方法，不包含超类
        for (Method method:methods){
            System.out.println(method);
            if (method.getParameterCount()==0
            &&
            method.getModifiers()== Modifier.PUBLIC
            ){
                System.out.println("自动调用："+method.getName()+"()");
                method.invoke(obj);
            }
        }
    }
}
