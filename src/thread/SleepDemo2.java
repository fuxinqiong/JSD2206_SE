package thread;

/**
 *  当一个线程调用sleep方法处于睡眠阻塞的过程中，若该线程的interrupt 方法 被调用，则会打断其睡眠阻塞状态
 *  此时sleep方法会抛出中断异常：InterruptedException
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread("linyongjian"){
            public void run(){
                System.out.println(getName()+"睡一会儿");
                try {
                    sleep(100000000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread huang = new Thread(){
            public void run(){
                System.out.println(getName()+"打断线程");
                try {
                    sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                lin.interrupt();
            }

        };

        lin.start();
        huang.start();

    }
}
