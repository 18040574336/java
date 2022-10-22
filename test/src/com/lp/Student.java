package com.lp;

public class Student  extends AbstractPerson implements IntA,IntB{
    @TestAnnotaion
    private Integer age;
    private String name ;

    private boolean aa;
    private Boolean isB;

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

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }


    public boolean isAa() {
        return aa;
    }

    public void setAa(boolean aa) {
        this.aa = aa;
    }

    public Boolean getB() {
        return isB;
    }

    public void setB(Boolean b) {
        isB = b;
    }


    public void say(){
        System.out.println(1234);
    }
}
