package com.cg.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class ArrayList1 {

	 String name;
	 int age;
	
	public ArrayList1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "ArrayList1 [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList1 list=new ArrayList1("ab", 22);
		ArrayList1 list1=new ArrayList1("gh", 54);
		
		Collection<ArrayList1> array=new ArrayList<>();
		array.add(list);
		array.add(list1);
		
		Iterator<ArrayList1> itr=array.iterator();
		
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
		}
	}

}
