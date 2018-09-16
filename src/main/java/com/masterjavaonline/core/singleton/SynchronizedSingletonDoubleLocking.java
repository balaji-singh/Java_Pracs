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
	private static SynchronizedSingletonDoubleLocking singletonClass1 = null;

	// private constructure
	private SynchronizedSingletonDoubleLocking() {

	}

	// returnning class instance by using getInstance() method
	// synchronized method to control simultaneous access
	// Pros:Lazy initialization is possible.It is also thread safe.Performance
	// reduced because of synchronized keyword is overcome.
	// Cons:First time, it can affect performance.As cons. of double check locking
	// method is bearable so it can be used for high performance multi-threaded
	// applications.

	public static SynchronizedSingletonDoubleLocking getInstance() {
		if (singletonClass1 == null) {
			// synchronized block to remove overhead
			synchronized (SynchronizedSingletonDoubleLocking.class) {
				// if instance is null, initialize
				if (singletonClass1 == null) {
					singletonClass1 = new SynchronizedSingletonDoubleLocking();
				}
			}
		}
		return singletonClass1;
	}

	/**
	 * 
	 */
	public void printMsg() {

		System.out.println("Synchronized Singleton Double Locking ");
	}

}
