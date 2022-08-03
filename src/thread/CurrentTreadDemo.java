package thread;

public class CurrentTreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("主线程"+main);
        Thread thread = new Thread();
        System.out.println(thread);
        dosome();
    }

    public static void dosome(){
        Thread t = new Thread();
        System.out.println("运行的是dosome方法的线程是"+t);
    }
}
