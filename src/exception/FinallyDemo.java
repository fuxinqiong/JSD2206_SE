package exception;

/**
 * Finally 处理异常
 *
 * finally 是异常处理机制的最后一块，它只能跟在try之后或者最后一个catch或者最后一个catch之后
 * finally 可以可以保证只要程序只要执行到try语句中，无论是否出现异常，finally都必定执行
 * 通常我们使用finally取完成资源释放这类操作，比如IO中的关闭流操作 *
 */
public class FinallyDemo {
    public static void main(String[] args) {
/*        try{

        }catch (){

        }finally {

        }*/
        System.out.println("程序开始了");
        try {
            String str = "null";    //为null 或 ”null“
//            String str = null;
            System.out.println(str.length());
            return;     //返回方法，return 之后的代码正常情况下一般不执行；

        }catch (Exception e){
            System.out.println("报错了");
        }finally {
            System.out.println("finally中的代码执行了");
        }
        System.out.println("程序结束了");

    }
}
