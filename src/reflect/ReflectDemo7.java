package reflect;

/**
 * 判断注解是否被标注
 *
 */
public class ReflectDemo7 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class cls = Class.forName("reflect.ReflectDemo7");
        Class cls = Class.forName("reflect.Person");

        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        System.out.println(mark);
    }
}
