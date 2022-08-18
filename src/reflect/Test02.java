package reflect;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URISyntaxException;

public class Test02 {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //定位Test02文件所在的目录（所在的包）
        File dir = new File(
                Test02.class.getResource(".").toURI() //
        );
        System.out.println(dir);

        //获取该目录中 的所有的.class 文件
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        System.out.println(subs.length);

        for (File sub:subs){
            String fileName = sub.getName();
            System.out.println(fileName);
            String className = fileName.substring(0,fileName.indexOf("."));
//            Class cls1 = Class.forName("reflect"+className);
            Class cls = Class.forName(
                    Test02.class.getPackage().getName()+"."+className
            );
            System.out.println("实例化对象："+cls.getSimpleName());
            Object obj = cls.newInstance();
            Method[] methods = cls.getDeclaredMethods();
            for (Method method:methods){
                if (method.getParameterCount()==0
                        &&
                    method.getModifiers()== Modifier.PUBLIC
                        &&
                    method.getName().contains("s")
                ){
                System.out.println("自动调用："+method.getName()+"()");
                method.invoke(obj);
            }
            }

        }


    }
}
