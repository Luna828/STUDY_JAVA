package com.algorithm;

public class Programmers_LV1_수박수박수 {

	public static void main(String[] args) {
		/*
		 * 길이가 n이고, "수박수박수..."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,solution을 완성하라
		 * 예를 들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됨
		 * 제한 조건 : n은 10,000 이하인 자연수 // 필요없는 듯 (자연수라고만 생각하면될 듯)
		 * */
		
		int n = 3; // 만약 n이 3일 때, "수박수" 가 나오면 됨
		String solution = ""; //수, 박 이라는 글자는 String이므로 빈 문자열을 만들어줌
		
		for(int i = 0; i < n; i++) { 
			if(i % 2 == 0) { // 2로 나눴을 때 나머지가 0이면 수를 받고
				solution += "수";
			}else {
				solution += "박"; //2로 나눴을 때 나머지가 생기면 "박"을 받는다 
			}
		}
		System.out.println(solution);
		
	}

}
