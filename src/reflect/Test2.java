package reflect;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //获取当前类的目录
        File dir = new File(
                Test2.class.getResource(".").toURI()
        );
//        System.out.println(dir);

        File[] files = dir.listFiles(f->f.getName().endsWith("class"));

        Map<String,String> map = new HashMap<>();
        for (File file:files){
//            System.out.println(file.getName());
            String fileName = file.getName();
//            String[] split = file.getName().split(".",1);
            String className = fileName.substring(0,fileName.indexOf("."));

//            System.out.println(className);
//            System.out.println(Arrays.stream(split).toArray());
//            String subs[] = file.getName().toString();
//            map.put(split[0],split[1]);
            Class cls = Class.forName(
                    Test2.class.getPackage().getName()+"."+className
            );
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
//        map.get()
//        map.entrySet();

    }
}
