package reflect;

/**
 * 自动实例化与当前类Test3在同一个包中被@AutoRunClass 标注的类，并将该对象输出到控制台上
 */
@AutoRunClass
public class Student {
    @AutoRunMethod(3)
    public void study(){
        System.out.println("学生:good good study,day day up!");
    }
    @AutoRunMethod(5)
    public void playGame(){
        System.out.println("学生:打游戏!");
    }
    public void sleepOnClass(){
        System.out.println("学生:上课睡觉!");
    }
}
