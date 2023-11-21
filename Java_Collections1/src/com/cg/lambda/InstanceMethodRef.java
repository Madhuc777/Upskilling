package com.cg.lambda;
interface Printable{
	void print();
}
public class InstanceMethodRef {

	public  void printSomething()
	{
		System.out.println("this is an example of instance method reference");
	}
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceMethodRef ref=new InstanceMethodRef();
		Printable printable=ref::printSomething;

		printable.print();
	}

}
