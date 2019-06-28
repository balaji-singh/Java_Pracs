package com.masterjavaonline.core.singleton;
/**
 * 
 */

/**
 * @author Sakshi-Bala
 *
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SingletonLazyInstilization singletonClass = SingletonLazyInstilization.getInstance();
		singletonClass.printMsg();

		SynchronizedSingleton synchronizedSingletonClass1 = SynchronizedSingleton.getInstance();
		synchronizedSingletonClass1.printMsg();

		SynchronizedSingletonDoubleLocking synchronizedSingletonClass2 = SynchronizedSingletonDoubleLocking
				.getInstance();
		synchronizedSingletonClass2.printMsg();

		BillPughSingleton synchronizedSingletonClass3 = BillPughSingleton.getInstance();
		synchronizedSingletonClass3.printMsg();

	}

}
