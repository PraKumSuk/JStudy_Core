package com.spk.stmts;

public class SwitchStatement {

	public static void main(String[] args) {
		switch (1) {
		case 1:
			System.out.println("Trader has selected Stock Trading option");
			break;
		case 2:
			System.out.println("Trader has selected Electronic Trading option");
			break;
		case 3:
			System.out.println("Trader has selected Algorithmic Trading option");
			break;
		case 4:
			System.out.println("Trader has selected Foreign exchange Trading option");
			break;
		case 5:
			System.out.println("Trader has selected commodity trading option");
			break;
		default:
			throw new IllegalArgumentException();
		}
	}
}
