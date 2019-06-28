package com.masterjavaonline.core.singleton;

/**
 * @author Sakshi-Bala To break the Singleton property we can use Clonaeable
 *         interface so the will give you new object insted of same instance
 */
public class SingletonBreakByClone implements Cloneable {

    private static SingletonBreakByClone instance = new SingletonBreakByClone();

    public static SingletonBreakByClone getInstance() {
        return instance;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        SingletonBreakByClone obj = SingletonBreakByClone.getInstance();
        System.out.println(obj);
        System.out.println(obj.clone());
    }

}