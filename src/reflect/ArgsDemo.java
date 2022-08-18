package reflect;

public class ArgsDemo {
    public static void main(String[] args) {
        dosome("a");
        dosome("a","b","c","d","e");

        dosome01();

    }

    //可变长参其实传的是一个数组
    public static void dosome(String... arg){

    }
    public static void dosome01(Object... arg){

    }


    //可变长参，要求，必须是最后一个参数
    public static void dosome1(int a,String... arg){

    }

}
