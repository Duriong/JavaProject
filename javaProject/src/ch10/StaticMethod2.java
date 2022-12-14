package ch10;

public class StaticMethod2 {
	//멤버변수
	static int num =10;//사번
	static String name="홍길동";
	String email="hong@gmail.com";
	String hp="010-1234-5678";
	String addr="서울 강남구 역삼동";
	
	public static void printA() {
		
		System.out.println("사번 : " + num);
		System.out.println("이름 : " + name);
		StaticMethod2 m = new StaticMethod2();
		System.out.println("이메일 : " + m.email);
		System.out.println("전화 : " + m.hp);
		System.out.println("주소 : " + m.addr);
	}
	
	public void printB() {
		System.out.println("사번 : " + num);
		System.out.println("이름 : " + name);
		StaticMethod2 m = new StaticMethod2();
		System.out.println("이메일 : " + m.email);
		System.out.println("전화 : " + m.hp);
		System.out.println("주소 : " + m.addr);
	}
	
	
	public static void main(String[] args) {
		System.out.println("==== printA() ====");
		printA();
		
		StaticMethod2 m2 = new StaticMethod2();
		System.out.println();
		System.out.println("==== printB() ====");
		m2.printB();
	}
}