package ru.rt.client;

public class MyFirstProgramm {

	public static void main(String[] args){
		/*  System.out.println("Hello, world!");
		  System.out.println(2+2);
		  System.out.println(2*2);
		  System.out.println(2/2);
		  System.out.println(2-2);
		  System.out.println(1.0/2);
		  System.out.println((2+2)*2);
		  System.out.println("2 "+"2");
		  System.out.println("2"+2);
		  System.out.println("2 + 2 ="+(2+2));*/
		  Square square= new Square();
		  square.a=1;
		  square.b=3;
		  Integer integer= setName(square.a, square.b);
		  System.out.println("integer = " + integer);

	}

	private static Integer setName(int a, int b){
		return a+b;
	}
}