package com.algorithm;

public class Programmers_LV1_���ڼ��ڼ� {
	/*
	 * ���̰� n�̰�, "���ڼ��ڼ�..."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�,solution�� �ϼ��϶�
	 * ���� ��� n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� ��
	 * ���� ���� : n�� 10,000 ������ �ڿ��� // �ʿ���� �� (�ڿ������ �����ϸ�� ��)
	*/
	
	public String ���� (int n) { // ���� n�� 3�� ��, "���ڼ�" �� ������ ��
		String solution = ""; //��, �� �̶�� ���ڴ� String�̹Ƿ� �� ���ڿ��� �������
		
			for(int i = 0; i < n; i++) { 
				if(i % 2 == 0) { // 2�� ������ �� �������� 0�̸� ���� �ް�
					solution += "��";
				}else {
					solution += "��"; //2�� ������ �� �������� ����� "��"�� �޴´� 
				}
			}
		
		return solution;
	}

	public static void main(String[] args) {

		Programmers_LV1_���ڼ��ڼ� result = new Programmers_LV1_���ڼ��ڼ�();
		
		int num = 3;
		
		for(int i = 1; i <= num; i++) {
			System.out.println(result.����(i));
		}
	}

}
