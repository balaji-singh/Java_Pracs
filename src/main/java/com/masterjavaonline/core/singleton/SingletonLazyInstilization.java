package com.masterjavaonline.core.singleton;
/**
 * 
 */

/**
 * @author Sakshi-Bala
 *
 */
public class SingletonLazyInstilization {

	//private static calss instance 
	private static SingletonLazyInstilization singletonClass1 = null;

	//private constructure 
	private SingletonLazyInstilization() {
		
	}
	
	//returnning class instance by using getInstance() method
	public static SingletonLazyInstilization getInstance() {
		if (singletonClass1 == null) {
			singletonClass1 = new SingletonLazyInstilization();
		}
		return singletonClass1;
	}

	/**
	 * 
	 */
	public void printMsg() {

		System.out.println("Singleton Class Lazy Instalization");
	}

}
