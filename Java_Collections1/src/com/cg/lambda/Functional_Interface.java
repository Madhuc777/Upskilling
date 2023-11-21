package com.cg.lambda;

interface Employer
{
	
	default void test() {
		System.out.println("testing");
	}
}
@FunctionalInterface  
interface Employee extends Employer
{
	   void message(String msg);
}


public  class Functional_Interface implements Employee{

	 public void message(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functional_Interface fie=new Functional_Interface();
		
		fie.message("its a functional interface");
		fie.test();
	}

}
