package com.masterjavaonline.core.singleton;
/**
 * 
 */

/**
 * @author Sakshi-Bala
 *
 */
public class SingletonLazyInstilization {

	// private static calss instance
	private static SingletonLazyInstilization singletonClass1 = null;

	// private constructure
	private SingletonLazyInstilization() {
		System.out.println("Singleton Class Lazy Instalization");
	}

	// returnning class instance by using getInstance() method
	public static SingletonLazyInstilization getInstance() {
		if (singletonClass1 == null) {
			singletonClass1 = new SingletonLazyInstilization();
		}
		return singletonClass1;
	}

	public static void main(String[] args) {

		// instantiating Singleton class with variable obj1
		SingletonLazyInstilization obj1 = SingletonLazyInstilization.getInstance();

		// instantiating Singleton class with variable obj2
		SingletonLazyInstilization obj2 = SingletonLazyInstilization.getInstance();

		// instantiating Singleton class with variable obj3
		SingletonLazyInstilization obj3 = SingletonLazyInstilization.getInstance();

	}

}
