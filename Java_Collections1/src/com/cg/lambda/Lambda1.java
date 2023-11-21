package com.cg.lambda;

 interface Drawable{
	 void draw();
	
}
public class Lambda1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=10;
		Drawable d1=()->{
	
			
				System.out.println("Drawing "+width);  
				
		};
		
		d1.draw();  
	}}



