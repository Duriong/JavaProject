package ch05;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = {"홍길동","강감찬"};
		int[] kor= {0,0}; 
		int[] eng= {0,0};
		int[] mat= {0,0};
		int[] tot= {0,0}; //총점 0으로 초기화		
		double[] avg=new double[2];
		double tot_avg = 0; //평균 0으로 초기화
		
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		
		for(int i=0; i<name.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 : ");
			mat[i] = scan.nextInt();
			
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i]/3.0;
			tot_avg = tot_avg+avg[i];
		}
		System.out.print("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"
		+tot[i]+"\t"+String.format("%4.1f",avg[i]));
		}
		
		System.out.println("==================================================");
		System.out.println("학급평균 : "+String.format("%.1f", tot_avg/2));
		scan.close();
		}

}
