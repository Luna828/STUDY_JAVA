package com.algorithm;

public class Programmers_LV1_2016 {

	public static void main(String[] args) {
		// ���� : 2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� ���� �ϱ��?
		// ���� 1. �� �� a,b�� �Է� �޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���
		// ���� 2. ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� [SUN, MON, TUE, WED, THU, FRI, SAT] �Դϴ�
		// ���� 3. a = 5, b = 24 5�� 24���� ȭ���� �̹Ƿ� ���ڿ� "TUE" �� ��ȯ�ϼ���
		// ���� 4. 2016���� �����Դϴ�.
		// ���� 5. 2016�� a�� b���� ������ �ִ� ���Դϴ� (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� X)
		
		int a = 5; 
		int b = 24; 
		
		int[] totalDates = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] totalDays = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		
		int sumDate = 0; //a�� b�ϱ��� �� ��ĥ���� ���ϱ� ���� ������ ��
		
		for(int i = 0; i < a; i++) {
			sumDate += totalDates[i];
		}
		sumDate += 30-b; //30-24 = 6�� 
		
//		for(int i = 0; i < a-1; i++) { //a-1�� �ϴ� ���� : 31 (1��) , 29(2��), 31(3��), 30(4��) �迭�� 0���� ���� �����ϰ� �츮�� 1������ 4�������� date�� �� ������ 
//			sumDate += totalDates[i];
//		}
//		sumDate += b-1; // b 24���� ���Ѵ� ������ 1��1�Ϻ��� ���������Ƿ� -1�� ���ش� 
		
		String day = totalDays[sumDate % 7];
		
		System.out.println(day);
	}

}
