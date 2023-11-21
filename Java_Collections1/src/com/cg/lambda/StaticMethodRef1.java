package com.cg.lambda;
interface Sayable
{
	void say();
}
public class StaticMethodRef1 {
	
	public static void saySomething() {
		System.out.println("this is an example of static method referance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayable sayable=StaticMethodRef1::saySomething;
		
		sayable.say();
	}

}
