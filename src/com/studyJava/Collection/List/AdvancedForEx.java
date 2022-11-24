package com.studyJava.Collection.List;

public class AdvancedForEx {
	public static void main(String args[]) {
		int[] scores = {20,30,40};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println(sum);
	}
}
