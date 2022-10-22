package service.testservice;

import java.util.Objects;

/**
 * @Author: liangpeng
 * @Date: 2021/7/20 23:57
 */
public class Student {

    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(age, student.age) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }


}
