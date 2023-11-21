package com.cg.stream;
import java.util.*;
import java.util.stream.Collectors;  
class Book{
	
	long id;
	String authorName;
	String desc;
	float price;
	public Book(long id, String authorName, String desc, float price) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.desc = desc;
		this.price = price;
	}
	
	
}
public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Book> books =new ArrayList<Book>();
		
		books.add(new Book(2613,"ramayana","true story",5000.04f));
		books.add(new Book(5727,"Mahabharatha","true story",800.04f));
		books.add(new Book(2143,"Bhagavadgitha","true story",2000.04f));
		
		List<Float> bookPrice=books.stream()
				.filter(p->p.price<5001)
				.map(p->p.price)
				.collect(Collectors.toList());
	
				System.out.println(bookPrice);
	}

}
