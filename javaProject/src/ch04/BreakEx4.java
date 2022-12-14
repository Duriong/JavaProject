package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		int n=1;
		while(true) {//무한반복
			System.out.println(n++ + " Hello World");
			if(n>7) break;//반복문을 종료시킴
		}
		System.out.println("n값이 8이며 while문 빠져나옴");
	}
}
