package thread;

/**
 * 静态方法上使用syncchronized, 那么该方法一定具有同步效果（需要排队）
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Foo();
        Thread t1 = new Thread(){
            public void run(){
                f1.dosome();    //调用的是静态方法，同下
//                Foo.dosome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                f2.dosome();    //调用的是静态方法,同下
//                Foo.dosome();
            }
        };

        t1.start();
        t2.start();


    }
}

class Foo{
/*
    public synchronized static void dosome(){
//    public static void dosome(){
        Thread t = Thread.currentThread();

        System.out.println("正在执行dosome方法,...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("方法执行完毕");
    }
*/
    public static void dosome() {
//    public static void dosome(){
        synchronized (Foo.class) {
            Thread t = Thread.currentThread();

            System.out.println("正在执行dosome方法,...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("方法执行完毕");
        }
    }

}