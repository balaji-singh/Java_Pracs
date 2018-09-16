package com.masterjavaonline.core.singleton;
/**
 * 
 */

/**
 * @author Sakshi-Bala
 *
 */
public class SynchronizedSingleton {

	// private static calss instance
	private static SynchronizedSingleton singletonClass1 = null;

	// private constructure
	private SynchronizedSingleton() {

	}

	// returnning class instance by using getInstance() method
	// synchronized method to control simultaneous access
	// Pros:Lazy initialization is possible.It is also thread safe.
	// Cons:getInstance() method is synchronized so it causes slow performance as
	// multiple threads can’t access it simultaneously.

	synchronized public static SynchronizedSingleton getInstance() {
		if (singletonClass1 == null) {
			singletonClass1 = new SynchronizedSingleton();
		}
		return singletonClass1;
	}

	/**
	 * 
	 */
	public void printMsg() {

		System.out.println("Synchronized Singleton Class");
	}

}
