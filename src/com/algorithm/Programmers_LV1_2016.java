package com.algorithm;

public class Programmers_LV1_2016 {

	public static void main(String[] args) {
		// 문제 : 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일 일까요?
		// 조건 1. 두 수 a,b를 입력 받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요
		// 조건 2. 요일의 이름은 일요일부터 토요일까지 [SUN, MON, TUE, WED, THU, FRI, SAT] 입니다
		// 조건 3. a = 5, b = 24 5월 24일은 화요일 이므로 문자열 "TUE" 를 반환하세요
		// 조건 4. 2016년은 윤년입니다.
		// 조건 5. 2016년 a월 b일은 실제로 있는 날입니다 (13월 26일이나 2월 45일같은 날짜는 주어지지 X)
		
		int a = 5; 
		int b = 24; 
		
		int[] totalDates = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] totalDays = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		
		int sumDate = 0; //a월 b일까지 총 며칠인지 구하기 위해 저장할 값
		
		for(int i = 0; i < a; i++) {
			sumDate += totalDates[i];
		}
		sumDate += 30-b; //30-24 = 6일 
		
//		for(int i = 0; i < a-1; i++) { //a-1을 하는 이유 : 31 (1월) , 29(2월), 31(3월), 30(4월) 배열은 0부터 세기 시작하고 우리는 1월부터 4월까지의 date를 다 세놓고 
//			sumDate += totalDates[i];
//		}
//		sumDate += b-1; // b 24일을 더한다 하지만 1월1일부터 시작했으므로 -1을 해준다 
		
		String day = totalDays[sumDate % 7];
		
		System.out.println(day);
	}

}
