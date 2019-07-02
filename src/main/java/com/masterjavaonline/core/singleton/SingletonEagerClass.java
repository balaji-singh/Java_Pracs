package com.masterjavaonline.core.singleton;

/**
 * @author Sakshi-Bala Bill Paugh Suggestion
 *
 */

// Java code to create singleton class by
// Eager Initialization
public class SingletonEagerClass {
    // public instance initialized when loading the class
    public static SingletonEagerClass instance = new SingletonEagerClass();

    private SingletonEagerClass() {
        System.out.println("Singleton Class Eager Instalization");
    }

    public static void main(String[] args) {

        // instantiating Singleton class with variable obj1
        SingletonEagerClass obj1 = SingletonEagerClass.instance;

        // instantiating Singleton class with variable obj2
        SingletonEagerClass obj2 = SingletonEagerClass.instance;

        // instantiating Singleton class with variable obj3
        SingletonEagerClass obj3 = SingletonEagerClass.instance;

    }

}