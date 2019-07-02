package com.masterjavaonline.core.singleton;

/**
 * @author Sakshi-Bala
 *
 */
public class SynchronizedSingleton {

	// private static calss instance
	private static SynchronizedSingleton singletonClass = null;

	// private constructure
	private SynchronizedSingleton() {
		System.out.println("Singleton Class Synchronized Instalization");

	}

	// returnning class instance by using getInstance() method
	// synchronized method to control simultaneous access
	// Pros:Lazy initialization is possible.It is also thread safe.
	// Cons:getInstance() method is synchronized so it causes slow performance as
	// multiple threads can�t access it simultaneously.

	synchronized public static SynchronizedSingleton getInstance() {
		if (singletonClass == null) {
			singletonClass = new SynchronizedSingleton();
		}
		return singletonClass;
	}

	public static void main(String[] args) {

		// instantiating Singleton class with variable obj1
		SynchronizedSingleton obj1 = SynchronizedSingleton.getInstance();

		// instantiating Singleton class with variable obj2
		SynchronizedSingleton obj2 = SynchronizedSingleton.getInstance();

		// instantiating Singleton class with variable obj3
		SynchronizedSingleton obj3 = SynchronizedSingleton.getInstance();

	}
}
