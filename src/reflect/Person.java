package reflect;

@AutoRunClass
public class Person {
    private String name = "张三";
//    @AutoRunClass
    private int age = 18;

//    @AutoRunClass
    public Person(){}

    public Person( String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @AutoRunClass
    @AutoRunMethod(7)
    public void sayHello(){
        System.out.println(name+"说:hello!");
    }
    public void watchTV(){
        System.out.println(name+":正在看电视");
    }
    public void sing(){
        System.out.println(name+":正在唱歌");
    }
    public void playGame(){
        System.out.println(name+":正在打游戏");
    }

    public void say(String info){
        System.out.println(name+"说:"+info);
    }
    @AutoRunMethod(2)
    public void eat(){
        System.out.println("正在干饭!");
    }
    public void say(String info,int count){
        for(int i=1;i<=count;i++) {
            System.out.println(name + "第"+i+"次说:" + info);
        }
    }
    private void heihei(){
        System.out.println("这是一个私有方法!!!!!!");
    }
}
