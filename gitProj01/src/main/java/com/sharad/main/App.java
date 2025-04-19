package com.sharad.main;

public class App {
	
	public int sum( int a, int b) {
		return a+b;
	}
    public static void main( String[] args ) {
        App a= new App();
        System.out.println("Sum of two number : "+ a.sum(2, 4));
    }
}
