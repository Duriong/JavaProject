package ch02;

import java.util.Scanner;

//직사각형의 가로, 세로값으로 넓이를 구하는 프로그램 작성

public class RectangleTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		double x = scan.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		double y = scan.nextDouble();
		
		System.out.print("직사각형의 넓이는 " + x * y + "입니다.");
		scan.close();
		
	}

}
