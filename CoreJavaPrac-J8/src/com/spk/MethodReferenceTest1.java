package com.spk;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest1 {

	public static void main(String[] args) {

		List names = new ArrayList();		
		names.add("ddddd");
		names.add("bbbbb");
		names.forEach(System.out::println);
	}
}
