package com.masterjavaonline.core.singleton;
/**
 * 
 */

/**
 * @author Sakshi-Bala Bill Paugh Suggestion
 *
 */
public class BillPughSingleton {

	// private constructure
	private BillPughSingleton() {

	}

	// Inner class to provide instance of class
	private static class BillPughSingletonInnerClass {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return BillPughSingletonInnerClass.INSTANCE;
	}

	/**         
	 * 
	 */
	public void printMsg() {

		System.out.println("Bill Pugh Singleton");
	}

}
