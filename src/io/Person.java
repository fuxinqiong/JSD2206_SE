package io;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Person implements Serializable {   //实现序列化接口
    public static final long serialVersionUID = 1L;
    private int age;
    private String name;
    private String address;
    private String gender;
    private String[] otherInfo;

    public Person() {

    }

    public Person(int age, String name, String address, String gender, String[] otherInfo) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && address.equals(person.address) && gender.equals(person.gender) && Arrays.equals(otherInfo, person.otherInfo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(age, name, address, gender);
        result = 31 * result + Arrays.hashCode(otherInfo);
        return result;
    }



}
