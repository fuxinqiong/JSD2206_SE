package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Java反射机制
 * 是一个动态机制，它允许我们在程序【运行期间】子啊确定实例化
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 使用反射机制的第一步：获取要操作的类的对象，即：Class的实例
         *
         */

//       // 获取String的类对象
//        Class cls = String.class;
//        Class cls1 =Class.forName("java.lang.String");
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入一个类名：");
        String classname = scanner.nextLine();
        Class cls = Class.forName(classname);
        //通过类对象获取String的一切信息
        //查看类名
        String name = cls.getName();
        System.out.println(name);
        name = cls.getSimpleName();
        System.out.println(name);

        Package p = cls.getPackage();   //获取包名
        System.out.println("包名："+p);
        /**
         * Class 称为类对象
         */
        Method[] methods = cls.getMethods();    //获取String 的所有方法
        for (Method method:methods){
            System.out.println(method.getName());
        }


    }
}
