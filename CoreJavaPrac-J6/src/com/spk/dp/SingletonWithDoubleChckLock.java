package com.spk.dp;

public class SingletonWithDoubleChckLock {
	
	private volatile static SingletonWithDoubleChckLock _instance;
	
	private SingletonWithDoubleChckLock() { 
		// Preventing object instantiation from outside
	}
	
	// FIRST WAY
	//creates multiple instance if two thread access this method simultaneously
	public static SingletonWithDoubleChckLock getInstance() {
		if (_instance == null) {
			_instance = new SingletonWithDoubleChckLock();
		}return _instance;
	}
	
	//SECOND WAY
	//Full block is synchronized so expensive
	public static synchronized SingletonWithDoubleChckLock getInstanceTS() {
		if (_instance == null) {
			_instance = new SingletonWithDoubleChckLock();
		}return _instance;
	}
	
	//THIRD WAY
	//Best as only 1 line is synchronized
	public static SingletonWithDoubleChckLock getInstanceDC() {
		if (_instance == null) {
			synchronized (SingletonWithDoubleChckLock.class) {
				if (_instance == null) {
					_instance = new SingletonWithDoubleChckLock();
				}
			}
		}
		return _instance;
	}


}
