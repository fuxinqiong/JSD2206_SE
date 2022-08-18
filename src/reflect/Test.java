package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {


        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

//        String[] methodNames =invoke(obj);
//        String methodName = ;
//        //获取所有的公开方法
        Method[] methods = cls.getDeclaredMethods();
        for (Method method:methods) {
            int count = method.getParameterCount(); //获取方法的参数个数、
            int modify =method.getModifiers();  //获取方法的访问权限的对应的值

            if (count == 0 && modify == Modifier.PUBLIC) {      //
                System.out.println("自动调用："+method.getName()+"()");
                method.setAccessible(true);
                method.invoke(obj);
            }
        }
    }
}
