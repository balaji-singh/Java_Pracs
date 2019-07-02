package com.masterjavaonline.core.singleton;

/*
* @author Sakshi-Bala
*
*/
// Java code to create singleton class by  
// Eager Initialization 
public class SingletonEagerClassStaticBlock {

    // public instance initialized when loading the class
    public static SingletonEagerClassStaticBlock instance;

    private SingletonEagerClassStaticBlock() {
        System.out.println("Singleton Class Eager Instalization with Static block");
    }

    static {
        // static block to initialize instance
        instance = new SingletonEagerClassStaticBlock();
    }

    public static void main(String[] args) {

        // instantiating Singleton class with variable obj1
        SingletonEagerClassStaticBlock obj1 = SingletonEagerClassStaticBlock.instance;

        // instantiating Singleton class with variable obj2
        SingletonEagerClassStaticBlock obj2 = SingletonEagerClassStaticBlock.instance;

        // instantiating Singleton class with variable obj3
        SingletonEagerClassStaticBlock obj3 = SingletonEagerClassStaticBlock.instance;

    }

}