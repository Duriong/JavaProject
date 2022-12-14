package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		firstMehod();
	}//프로그램끝

	
	public static void firstMehod() {
		secondMethod();
	}

	
	public static void secondMethod() {
		System.out.println("secondMethod()");
		
	}
}
