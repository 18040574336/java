package com.lp;


public class Stu<T> implements Person<String>{
    private String t;

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public Stu(String t) {
        this.t = t;
    }

    @Override
    public String show(String t) {
        return t;
    }


}
