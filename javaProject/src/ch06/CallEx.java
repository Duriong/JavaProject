package ch06;

public class CallEx {

	public static void main(String[] args) {
		System.out.println("시작");
		int a =10;
		test(a); //a는 call by value형식으로 호출, 메소드호출

		test2(a);
		System.out.println("끝");
	}//프로그램 끝

	
	public static void test2(int a) {//a=10
		System.out.println(a);
	}
	
	
	public static void test(int b) { //b=10 변수이름이 다를 수 있음
		System.out.println("test method 호출");
		System.out.println(b);
	}

}
