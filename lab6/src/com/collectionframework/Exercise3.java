package com.collectionframework;

import java.util.HashMap;
import java.util.Iterator;

	public class Exercise3 {
		public static HashMap method(int[] array) {
		    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 
		    for (int n: array) {
		      map.put( n, n*n);
		    }
		    return map;
		  }
		 
		  public static void main(String[] args) {
		    int array[] = new int[]{1,3,5,7,9};
		    HashMap<Integer, Integer> map = method(array);
		 
		    Iterator<Integer> it = map.keySet().iterator();
		    while(it.hasNext()){
		    Integer key = it.next();
		      System.out.println(key + " : " + map.get(key));
		    }
		  }
	

}


