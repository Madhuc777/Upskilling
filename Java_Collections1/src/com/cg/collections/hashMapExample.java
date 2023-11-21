package com.cg.collections;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Object,Object> map=new HashMap<>();
		map.put(3, "a");
		map.put(5, "g");
		map.put(2, "b");
		map.put(1, "l");
		map.put(2, "b");
		Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  }

}
