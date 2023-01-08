package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Programmers_LV1_나누어떨어지는숫자배열 {
	/*
	 * Array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순(sort)으로 정렬한 배열을 반환하는 함수
	 * solution을 작성 divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환 제한 사항 1. arr 는
	 * 자연수를 담은 배열 2. 정수 i,j에 대해 i != j 이면 arr[i] != arr[j]입니다 3. divisor는 자연수 4.
	 * array는 길이 1 이상인 배열
	 */

	public int[] solutionReturnArray(int[] arr) {

		int divisor = 5; // 자연수 5

		int[] element = new int[arr.length]; // 배열을 담을 공간

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

		int divisor = 5; // 자연수 5

		List<Integer> element = new ArrayList<>(); // 배열을 담을 공간

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

		int divisor = 5; // 자연수 5

		List<Integer> element = new ArrayList<>(); // 배열을 담을 공간

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

		Programmers_LV1_나누어떨어지는숫자배열 result = new Programmers_LV1_나누어떨어지는숫자배열();
		
		String str = "1,2,3,4";
		String[] strArray = str.split(",");
		List<String> strList = Arrays.asList(strArray); //array 하고 arrayList 차이점 알기
		 
		
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
