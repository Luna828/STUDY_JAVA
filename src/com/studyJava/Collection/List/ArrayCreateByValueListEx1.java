package com.studyJava.Collection.List;

public class ArrayCreateByValueListEx1 {

	public static void main(String args[]) {
		
		//规过 1
		int[] scores = {80,90,100};
		
		System.out.println("scores[0] " + scores[0]);
		System.out.println("scores[1] " + scores[1]);
		System.out.println("scores[2] " + scores[2]);
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("average : " + sum / scores.length);
		
		//规过 2
		int[] scores2;
		scores2 = new int[] {80,90,100};
		
		int sum1 = 0;
		for(int j = 0; j < 3; j++) {
			sum1 += scores2[j];
		}
		System.out.println("醚钦 : " + sum1);
		
		//规过 3
		
		int sum2 = add(new int [] {80,90,100});
		System.out.println("醚钦 滴锅掳: " + sum2);
		
		
	}

	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		return sum;
	}
}
