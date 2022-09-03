package exception;
/**
    JAVA 异常处理机制
    JAVA中所有的异常的顶级超类为:Throwable
    而Throwable下面定义了两个子类型:Error和Exception
    Error:表示错误，不可挽回的。通常描述的都是系统错误
    Exception:表示异常，可在程序运行过程中被处理掉的。
    我们通常仅在异常处理机制中处理Exception

    异常处理机制中的：try-catch
    语法:
    try{
        可能出现异常的代码片段
    }catch(XXXException e){
        处理try中出现XXXException的代码
    }

 */
import java.nio.charset.StandardCharsets;

/***
 * Java 异常处理机制
 * java中 所有的异常的顶级超类为Throwable
 *
 * 语法：
 * try{
 *
 * }catch(Exception e){
 *
 * }catch(){
 *
 * }
 *
 */
public class TryCatchDemo1 {
    public static void main(String[] args) {
        System.out.println("程序开始了");
//    try {
//        String str = null;
//        System.out.println(str.getBytes(StandardCharsets.UTF_8));
//    }catch (Exception e){
//        e.printStackTrace();
//        System.out.println("程序正在执行...");
//    }

        try {
            System.out.println(11/0);

            String str = null;
            System.out.println();
            System.out.println(str.getBytes(StandardCharsets.UTF_8));

            //如果try语句中某句代码出现了异常，那么其后 的所有代码均不执行!!
            String str1 = "";
            System.out.println(str1.charAt(0));

        }catch (NullPointerException e){      //出现空指针异常
            e.printStackTrace();
            System.out.println("程序正在执行...,出现了空指针，并解决了该异常");
        }catch (StringIndexOutOfBoundsException e){   //出现数组下标越界异常
            System.out.println("出现字符串下标越界异常，并解决了");
            System.out.println();
//        }catch (NullPointerException|StringIndexOutOfBoundsException e){    //出现出现空指针异常 或者 数组下标越界异常
//            e.printStackTrace();
//            System.out.println("出现出现空指针异常 或者 数组下标越界异常");
        }catch (Exception e){     //出现异常，最大范围捕获异常，一般用来捕获未知异常，常用在最后
            e.printStackTrace();

        }

        System.out.println("程序结束了");

    }
}
