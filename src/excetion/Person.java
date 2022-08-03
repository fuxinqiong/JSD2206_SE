package excetion;

/**
 * 异常的抛出
 * 使用throw 关键字 可以在一个方法中主动对外抛出一个异常给方法调用者
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age<0 || age>100){
//            主动实例化一个异常并使用throw关键字将其抛出到setAge()方法外，由调用该方法的地方处理
//            throw new RuntimeException("年龄不合法");
//            //通常我们使用
//            throw new Exception("年龄不合法");

            throw new IllegalAgeException("年龄不合法");     //自定义异常
        }
        this.age = age;
    }
}
