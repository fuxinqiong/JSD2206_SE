package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new MyThread01();
        t1.start();


        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("第二个线程跑起来了");
                }
                System.out.println("你好呀");
            }
        };
        Thread t2 = new Thread(r2);
        t2.start();

    }
}

class MyThread01  extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("这一个线程开始了");
        }

        System.out.println("你也好");
    }
}