package thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
//        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
//        t3.start();

        for (int i=0;i<1000;i++){
            System.out.println("这个一个线程外的循环");
        }
        for (int i=0;i<1000;i++){
            System.out.println("这是第二个线程外的循环");
        }
//        t3.start();
    }
}
class MyRunnable1 implements Runnable{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("线程一");
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("线程二");
        }
    }

}
