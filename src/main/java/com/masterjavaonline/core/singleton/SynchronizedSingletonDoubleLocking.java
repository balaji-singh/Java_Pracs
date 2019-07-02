package com.masterjavaonline.core.singleton;
/**
 * 
 */

/**
 * @author Sakshi-Bala
 *
 */
public class SynchronizedSingletonDoubleLocking {

	// private static calss instance
	private static SynchronizedSingletonDoubleLocking singletonClass = null;

	// private constructure
	private SynchronizedSingletonDoubleLocking() {

		System.out.println("Singleton Class Synchronized Dobuble Locking Instalization");
	}

	// returnning class instance by using getInstance() method
	// synchronized method to control simultaneous access
	// Pros:Lazy initialization is possible.It is also thread safe.Performance
	// reduced because of synchronized keyword is overcome.
	// Cons:First time, it can affect performance.As cons. of double check locking
	// method is bearable so it can be used for high performance multi-threaded
	// applications.

	public static SynchronizedSingletonDoubleLocking getInstance() {
		if (singletonClass == null) {
			// synchronized block to remove overhead
			synchronized (SynchronizedSingletonDoubleLocking.class) {
				// if instance is null, initialize
				if (singletonClass == null) {
					singletonClass = new SynchronizedSingletonDoubleLocking();
				}
			}
		}
		return singletonClass;
	}

	public static void main(String[] args) {

		// instantiating Singleton class with variable obj1
		SynchronizedSingletonDoubleLocking obj1 = SynchronizedSingletonDoubleLocking.getInstance();

		// instantiating Singleton class with variable obj2
		SynchronizedSingletonDoubleLocking obj2 = SynchronizedSingletonDoubleLocking.getInstance();

		// instantiating Singleton class with variable obj3
		SynchronizedSingletonDoubleLocking obj3 = SynchronizedSingletonDoubleLocking.getInstance();

	}

}
