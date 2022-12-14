package ch02;

public class MyVar {
	
	public static int sum(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		int c;
		
		c = sum(a, b);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("a + b = "+c);

	}

}
