package br.com.marvel;

import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {
	
	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(2);
		hashSet.add(4);
		hashSet.add(9);
		hashSet.add(2);
		hashSet.add(1);
		
		hashSet.remove(1);
		System.out.println(hashSet.contains(1));
		System.out.println(hashSet.size());
		System.out.println (hashSet.isEmpty());
		
		System.out.println();
		
		for (Integer integer : hashSet) {
			System.out.println(integer);
			
			
		}
	}

}
