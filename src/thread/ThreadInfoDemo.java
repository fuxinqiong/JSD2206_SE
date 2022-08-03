package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name: "+name);

        long id = t.getId();
        System.out.println("id: "+id);

        int poriorty = t.getPriority();
        System.out.println("优先级："+poriorty);

        boolean isAlive = t.isAlive();
        boolean isInterrupt = t.isInterrupted();
        boolean isDaemon = t.isDaemon();
        System.out.println("isAlive："+isAlive);
        System.out.println("isInterrupt："+isInterrupt);
        System.out.println("isDaemon："+isDaemon);





    }
}
