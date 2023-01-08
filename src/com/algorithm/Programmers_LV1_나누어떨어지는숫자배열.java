package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Programmers_LV1_����������¼��ڹ迭 {
	/*
	 * Array�� �� element �� divisor�� ������ �������� ���� ��������(sort)���� ������ �迭�� ��ȯ�ϴ� �Լ�
	 * solution�� �ۼ� divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ ���� ���� 1. arr ��
	 * �ڿ����� ���� �迭 2. ���� i,j�� ���� i != j �̸� arr[i] != arr[j]�Դϴ� 3. divisor�� �ڿ��� 4.
	 * array�� ���� 1 �̻��� �迭
	 */

	public int[] solutionReturnArray(int[] arr) {

		int divisor = 5; // �ڿ��� 5

		int[] element = new int[arr.length]; // �迭�� ���� ����

		int elementSize = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				element[elementSize] = arr[i];
				elementSize++;
			}
		}
		if (elementSize == 0) {
			element[0] = -1;
		}

		return element;
	}

	public List<Integer> solutionReturnList(int[] arr) {

		int divisor = 5; // �ڿ��� 5

		List<Integer> element = new ArrayList<>(); // �迭�� ���� ����

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				element.add(arr[i]);
			}
		}
		if (element.size() == 0) {
			element.add(-1);
		}

		return element;
	}

	public List<Integer> solutionReturnList(List<Integer> list) {

		int divisor = 5; // �ڿ��� 5

		List<Integer> element = new ArrayList<>(); // �迭�� ���� ����

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % divisor == 0) {
				element.add(list.get(i));
			}
		}
		if (element.size() == 0) {
			element.add(-1);
		}

		return element;
	}

	public static void main(String[] args) {

		Programmers_LV1_����������¼��ڹ迭 result = new Programmers_LV1_����������¼��ڹ迭();
		
		String str = "1,2,3,4";
		String[] strArray = str.split(",");
		List<String> strList = Arrays.asList(strArray); //array �ϰ� arrayList ������ �˱�
		 
		
		int[] arr = { 5, 9, 7, 10 };
		List arr2 = new ArrayList<Integer>();
		arr2.add(5);
		arr2.add(9);
		arr2.add(7);
		arr2.add(10);
		System.out.println(result.solutionReturnArray(arr));
		System.out.println(result.solutionReturnList(arr2));
		System.out.println(result.solutionReturnList(arr));
	}

}
