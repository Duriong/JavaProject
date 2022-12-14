package ch05;
//학생들의 성적을 입력받아 합계와 평균을 구하는 프로그램 만들기

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		
		int numbers;
		int tot =0;
		double avg =0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성적처리할 학생수를 입력하세요 >> ");
		numbers = scan.nextInt();
		
		int[] score = new int[numbers];
		
		for(int i=0; i<score.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			score[i] = scan.nextInt();
			tot += score[i];
			avg = (double)tot/score.length;
		}
		
		System.out.println("총점은 " + tot + "점 입니다.");
		System.out.println("평균은 " + avg + "점 입니다.");
		scan.close();
	}
}
