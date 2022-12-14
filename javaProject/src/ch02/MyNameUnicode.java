package ch02;

public class MyNameUnicode {

	public static void main(String[] args) {
		char first = '\uD669'; //황
		char second = '\uC120'; //선
		char third = '\uC601'; //영
		
		System.out.println("" + first + " " + second + " " + third);
		System.out.println("char형(\'\\uD669\') : " + first);
		System.out.println("char형(\'\\uC120\') : " + second);
		System.out.println("char형(\'\\uC601\') : " + third);
		
	}

}
