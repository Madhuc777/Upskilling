package com.cg.stream;
interface Display
{
	void print1();

default void print2() {
	System.out.println("default method");
}
 static void print3(int age) {
	System.out.println(age);
}
}
public class Java8Interface implements Display{
	
	@Override
	public void print1() {
		// TODO Auto-generated method stub
		System.out.println("abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java8Interface inter =new Java8Interface();
		
		inter.print1();
		inter.print2();
		Display.print3(20);
	}

	

}
