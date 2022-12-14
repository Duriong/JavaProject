package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int gugudan=1;
		System.out.print("구구단 중에서 출력하고자 하는 단을 입력하세요 : ");
		int dan = scan.nextInt();
		scan.close();
		
		while(gugudan<=9) {
			System.out.println(dan+"*"+gugudan+"="+gugudan*dan);
			gugudan++;
		}
	}
}
