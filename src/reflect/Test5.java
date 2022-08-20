package reflect;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 自动调用 与Test5在同一个包中的那些被@AtuoRunClass标注的类中被@AutoRunMethod标注的方法的指定次
 */
public class Test5 {
    public static void main(String[] args) throws Exception {
        //1确定与Test2在同一个包中有多少个类?
        //定位Test2.class文件所在的目录(所在的包)
        File dir = new File(
                Test5.class.getResource(".").toURI()
        );
//        System.out.println(dir);
        //获取该目录中所有的.class文件
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File sub : subs){
            String fileName = sub.getName();
//            System.out.println(fileName);
            //根据.class文件名获取类名  例如:Person.class
            String className = fileName.substring(0,fileName.indexOf("."));

            //加载类对象
//            Class cls = Class.forName("reflect."+className);
            Class cls = Class.forName(
                    Test5.class.getPackage().getName()+"."+className
            );
//            System.out.println("实例化对象:"+cls.getSimpleName());
            if (cls.isAnnotationPresent(AutoRunClass.class)) {
                System.out.println("实例化对象被标注了:"+cls.getSimpleName());
                Object obj = cls.newInstance();
                System.out.println(obj);
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    if (
                                    method.getParameterCount() == 0//判断是否无参
                                    &&
                                    method.getModifiers() == Modifier.PUBLIC//判断是否为公开方法
                                    &&
//                                    method.getName().contains("s")
//                                    &&
                                    method.isAnnotationPresent(AutoRunMethod.class) //判断方法是否被标注
                    ) {
//                        if (method.isAnnotationPresent(AutoRunMethod.class)){
//                        }


                        AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);//获取标注对象
                        int d = arm.value();    //获取标注的参数
                        System.out.println("参数:"+d);

                        for (int i = 0; i < d; i++) {
                            method.invoke(obj);
                        }

                    }
                }


            }
        }
    }
}
