package ch13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTax {
	public static double valueOfsupply;//공금가액
	public static int vatRate = 10; //부가세율
	public static double getVat() {//부가세계산
		return valueOfsupply / vatRate;
	}
	public static double getTotal() {//부가세포함합계
		return valueOfsupply + getVat();
	}

	public static void main(String[] args) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		Scanner sc =  new Scanner(System.in);
		System.out.print("공급가액을 입력하세요");
		ValueAddedTax.valueOfsupply = Integer.parseInt(sc.nextLine());
		System.out.println("**********************************");
		try {
			System.out.println("공급가액 : " + decFormat.format((int)valueOfsupply) + "원");
			System.out.println("부가가치세율 : " + vatRate + "%");
			System.out.println("부가가치세 : " + decFormat.format((int)getVat() + "원"));
			System.out.println("합계 : " + decFormat.format((int)getTotal() + " 원"));
		} catch (Exception e) {
			System.out.println("**********************************");
			System.out.println("프로그램 실행 중에 문제가 발생했습니다.");
		}
		sc.close();
		System.out.println("프로그램 종료...");
	}
}
