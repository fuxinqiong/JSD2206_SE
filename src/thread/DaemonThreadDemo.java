package thread;

/**
 * 守护线程
 *
 *
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread("rose"){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName()+":let me go!");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };


        Thread jack = new Thread("jack") {
            public void run(){
                while (true){
                    System.out.println(getName()+"you jump ,i jump!");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        rose.start();
        //注意，设置守护线程这件事必须在线程启动前进行，否则会抛出异常
        jack.setDaemon(true);
        jack.start();   //守护线程
        System.out.println(Thread.currentThread());

        while (true);

    }
}
