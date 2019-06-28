package com.masterjavaonline.core.overrloading_overriding;

public class Parent {

    public void print(Object obj) {

        System.out.println(obj.toString());
    }

    public void print(String s) {

        System.out.println(s);
    }

    // public void print(StringBuffer sb) {
    // System.out.println(sb.toString());
    // }

    public void print(int i) {
        System.out.println(i);
    }

    // public void print(Integer i) {
    // System.out.println(i);
    // }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.print(new Object());
        p.print("obj");
        p.print(null);
        p.print(10);

    }
}