package thread;

/**\
 * 有效的缩小同步范围，提高并发效率
 * 同步块：
 *
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Shop shop1 = new Shop();
        Thread t1 = new Thread("范传奇"){  //线程名字
            public void run(){
                shop.buy();
            }

        };

        Thread t2 = new Thread("王克晶"){
            public void run(){
                shop.buy();
            }

        };

        //不同店买衣服不排队
        Thread t3 = new Thread("不同店"){
            public void run(){
                shop1.buy();
            }

        };

        t1.start();
        t2.start();
        t3.start();

    }
}

class Shop{
    public  void buy(){
//        public synchronized void buy(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+" 1挑选衣服....");
            Thread.sleep(5000);

            /**
                同步块使用时，必须在syncchronized() 中指定同步监视对象，该对象必须满足两点：
                1.必须是引用类型的实例
                2.多个线程看到的必须是同一个对象
             */
            synchronized (this) {
//            synchronized () { //
//            synchronized ("") { //n
//            synchronized (new Object()) { //new一定产生新对象，因此一定不能作为同步监视器使用！
//            synchronized (t) {        //这里的t指代的是当前的线程，不同线程t表示的不同线程，因此不可以

                System.out.println(t.getName() + " 2试衣服...");
                Thread.sleep(5000);
            }
            System.out.println(t.getName()+" 3结账...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
