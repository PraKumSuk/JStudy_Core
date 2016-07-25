package com.spk;

public class MethodReferenceTest2 {

	//static method
	public static String toUpperStatic(String input){
		System.out.println("in static method converting to Upper Case now....");
		return input.toUpperCase();
	}

	public static void main(String[] args) {

		MethodReferenceI methRefI = MethodReferenceTest2::toUpperStatic;
		System.out.println("Output UPPER String is = "+methRefI.process("static_input"));
	}

}

//Defining Functional Interface
interface MethodReferenceI{
	String process(String input);
}
