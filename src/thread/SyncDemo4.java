package thread;

/**
 * 互斥性
 * 当使用多个synchronized 锁定多个代码片段并且指定的同步监视器对象是同一个时，这些代码片段之间就是互斥的
 *
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Boo boo = new Boo();
        Thread t1 = new Thread(){
            public void run(){
                boo.methodA();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                boo.methodB();
            }
        };

        t1.start();
        t2.start();

    }
}

/*class Aoo{
    public void methodA(){
        System.out.println("正在执行A方法.....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}*/

class Boo{
    public synchronized void methodA(){
        System.out.println("正在执行A方法.....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void methodB(){
        System.out.println("正在执行B方法.....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}