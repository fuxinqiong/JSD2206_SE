package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
//        p.getAge(1000);
/*        try {
            *//**
             * 当我们调用一个含有throws声明异常抛出的方法时，编译器要求我们必须在调用该方法这里添加异常处理机制
             *//*
            p.setAge(1000);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }*/

        try {
            /**
             * 当我们调用一个含有throws声明异常抛出的方法时，编译器要求我们必须在调用该方法这里添加异常处理机制
             */
            p.setAge(1000);
        } catch (IllegalAgeException e) {       //年龄不合法异常
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
        System.out.println("年龄："+p.getAge()+"岁");

    }
}
