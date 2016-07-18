package com.spk.sys;

public class SystemandRuntime {
	
	public static void main(String[] args) {
		
		System.out.println("JVM Bit size: " + System.getProperty("sun.arch.data.model"));
		
		System.out.println("JvM Bit size: " + System.getProperty("os.arch"));
		
		System.out.println(Runtime.getRuntime().freeMemory());
		
		System.out.println(Runtime.getRuntime().totalMemory());
	}

}
