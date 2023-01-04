package com.studyJava.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김은경", 90);
		map.put("김영환", 80);
		map.put("송예원", 70);
		map.put("김은경", 60);
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("\t 김은경 : " + map.get("김은경")); //이름 (키) 값으로 점수(값) 을 검색
		System.out.println();
		
		
	}
}
