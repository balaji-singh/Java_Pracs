package com.masterjavaonline.core.overrloading_overriding;

public class Child extends Parent {

    @Override
    public void print(String s) {
        super.print("Child:" + s);
    }

    public static void main(String[] args) {

        Parent p = new Child();
        p.print("Class");

        // ClassCastException
        // Child c = (Child) new Parent();
        // c.print("Child");

    }

}