package com.mysample.main;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import com.duck.Duck;
import com.duck.PhoneyDuck;

public class Main {

	public static void main(String[] args) {
//		String s = "ceddaabdffffee";
//		char[] chararr = s.toCharArray();
//		TreeMap<Character, Integer> mytreemap= new TreeMap();
//		
//		for(int i=0; i<chararr.length;i++) {
//			if(!mytreemap.containsKey(chararr[i])){
//				mytreemap.put(chararr[i], 1);
//			}else {
//				int count = mytreemap.get(chararr[i])+1;
//				mytreemap.put(chararr[i], count);
//			}
//		}
		
//		System.out.println(mytreemap);
//		apple apple = new apple();
//		Math.min(1, 4);
		
//		String a = String.format("%,6.1f",42.000);
//		System.out.println(a);
		
		Duck duck = new PhoneyDuck();
		duck.performFly();
		duck.performQuack();
	}
	
}
