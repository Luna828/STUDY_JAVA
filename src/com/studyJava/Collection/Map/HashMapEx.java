package com.studyJava.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("������", 90);
		map.put("�迵ȯ", 80);
		map.put("�ۿ���", 70);
		map.put("������", 60);
		System.out.println("�� Entry �� : " + map.size());
		
		System.out.println("\t ������ : " + map.get("������")); //�̸� (Ű) ������ ����(��) �� �˻�
		System.out.println();
		
		
	}
}
