package br.com.marvel;

import java.util.HashMap;
import java.util.Map;

public class TesteHash {
	
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("Segunda-Feira", 100);
		hashMap.put("Terça-Feira", 50);
		hashMap.put("Quarta-Feira", 25);

		System.out.println(hashMap.containsKey("Segunda-Feira"));
		hashMap.containsValue(100);
		
		hashMap.replace("Segunda-Feira", 100,500);
		System.out.println(hashMap.values());
		
		
		
	}

}
