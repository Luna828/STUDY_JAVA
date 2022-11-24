package com.studyJava.Collection.List;

import java.util.Scanner;

public class Practice5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제3
		int[][] array1 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88},
		};
		
		System.out.println(array1.length);
		System.out.println(array1[2].length);
		System.out.println();
		
		//문제4
		int max = 0;
		int[] array2 = {1,5,3,8,2};
		
		for(int i = 0; i < array2.length; i++) {
			if(max < array2[i]) {
				max = array2[i];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println();

		//문제5
		int[][] array3 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88},
				{10,20,30},
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i = 0; i < array3.length; i++) {
			for(int k = 0; k < array3[i].length; k++) {
				sum += array3[i][k];
				count++;
				System.out.println(count);
				avg = (double) sum / count;
			}
		}
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		System.out.println();
		
		//문제6
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료)");
			System.out.println("---------------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}else if (selectNo == 2) {
				
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] > ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				
			}else if (selectNo == 3) {
				
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] > " + scores[i]);
				}
				
			}else if (selectNo == 4) {
				
				int max1 = 0;
				int sum1 = 0;
				double avg1 = 0;
				
				for(int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수 : " +max);
				System.out.println("평균 점수 : " + avg);
				
			}else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

	
	
}
