package ch04;

import java.util.Scanner;

public class BreakAVG {

	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("점수를 입력하세요 : ");
			int num = scan.nextInt();
			if(num < 0) {//-값을 입력해야 종료,ex)-1 {}생략가능
			break;
			}
			total += num;//total = total+num(누적된 값)
			count++;
		}
		System.out.println("평균은 " + total/count);
		scan.close();
	}

}
