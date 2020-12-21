package com.lti;

public class Calc {
	public static int  add(int a, int b) {
		return a+b;
	}
	public static int  sub(int a, int b) {
		return a-b;
	}
	public static void main(String args[]) {
		System.out.println("Add "+add(10,20));
		System.out.println("Sub "+sub(20,10));
	}

}
