package com.techlab.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("g", "h");
		map.put("Germany", "Berlin");
	    map.put("Norway", "Oslo");
	    map.put("Norway", "Washington DC");
	    System.out.println(map);
	    System.out.println("changing value of key: 'England'");
	    map.replace("England", "delhi");
	    System.out.println(map);
	    System.out.println("Value of a key: 'Germany' is: "+map.get("Germany"));
	    map.remove("Germany");
	    System.out.println("after removing key value pair of key:'Germany'");
	    System.out.println(map);
	}


}
