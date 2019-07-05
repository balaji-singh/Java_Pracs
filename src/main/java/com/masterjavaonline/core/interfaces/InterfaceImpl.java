package com.masterjavaonline.core.interfaces;

public class InterfaceImpl implements InterfaceA {

    public void method1() {

        System.out.println("Method 1");
    }

    public void method2() {

        System.out.println("Method 2");
    }

    public void method4() {

        System.out.println("Method 2");
    }

    public static void main(String[] args) {

        InterfaceA a = new InterfaceImpl();
        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.method4();
    }

}