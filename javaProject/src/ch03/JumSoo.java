package ch03;

import java.util.Scanner;

public class JumSoo {

	public static void main(String[] args) {
		//변수선언
		String name;
		int Java, DB, HTML, JSP, tot;
		double avg;
		
		
		//입력객체생성
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("Java : ");
		Java = scan.nextInt();
		System.out.print("DB : ");
		DB = scan.nextInt();
		System.out.print("HTML : ");
		HTML = scan.nextInt();
		System.out.print("JSP : ");
		JSP = scan.nextInt();
		scan.close();
		
		
		//계산
		tot = Java + DB + HTML + JSP;
		avg = tot / 4.0;
		
		
		//결과
        System.out.println("=====================================================");
        System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
        System.out.println("-----------------------------------------------------");
        System.out.println(name+"\t"+Java+"\t"+DB+"\t"+HTML+"\t"+JSP+"\t"+tot+"\t"+avg);
        System.out.println("=====================================================");

	}

}
