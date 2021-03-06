package com.github.kevin.baselib.bean;

public class Person {
    private String name;
    private String pw;

    public Person() {

    }

    public Person(String name, String pw) {
        this.name = name;
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "Person[" + "name = " + name + "，pw = " + pw + "]";
    }
}
