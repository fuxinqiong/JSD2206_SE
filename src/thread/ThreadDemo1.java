package thread;
/**
 * 多线程
 * 多线程可以并发执行多个代码片段.
 * 并发:多个线程宏观上是一起执行,微观上是走走停停的.
 *
 * 第一种创建线程的方式:
 * 1:继承Thread
 * 2:重写run方法
 */
public class ThreadDemo1 {

    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        Thread t3 = new MyThread3();
        t1.start();
        t2.start();
//        t3.start();

        for (int i=0;i<1000;i++){
            System.out.println("这个一个线程外的循环");
        }
        for (int i=0;i<1000;i++){
            System.out.println("这是第二个线程外的循环");
        }
        t3.start();
    }
}
class MyThread1 extends Thread{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("线程一");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("线程二");
        }
    }
}
class MyThread3 extends Thread{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("线程三");
        }
    }
}
