package com.spk.dp;

public class Singleton {

	private Singleton(){ }

	private static final Singleton INSTANCE = new Singleton();

	public static Singleton getInstance(){
		return INSTANCE;
	}
	
	public void show(){
        System.out.println("Singleon using static initialization in Java");
    }
	
	public static void main(String[] args) {
		Singleton.getInstance().show();
		System.out.println(Singleton.getInstance().hashCode());
	}

}