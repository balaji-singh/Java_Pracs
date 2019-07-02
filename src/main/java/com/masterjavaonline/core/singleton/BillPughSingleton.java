package com.masterjavaonline.core.singleton;

/**
 * @author Sakshi-Bala Bill Paugh Suggestion
 *
 */
public class BillPughSingleton {

	// private constructure
	private BillPughSingleton() {

		System.out.println("Singleton Class Billpugh Instalization");

	}

	// Inner class to provide instance of class
	private static class BillPughSingletonInnerClass {

		private static final BillPughSingleton INSTANCE = new BillPughSingleton();

	}

	public static BillPughSingleton getInstance() {
		return BillPughSingletonInnerClass.INSTANCE;
	}

	public static void main(String[] args) {

		// instantiating Singleton class with variable obj1
		BillPughSingleton obj1 = BillPughSingleton.getInstance();

		// instantiating Singleton class with variable obj2
		BillPughSingleton obj2 = BillPughSingleton.getInstance();

		// instantiating Singleton class with variable obj3
		BillPughSingleton obj3 = BillPughSingleton.getInstance();

	}

}
