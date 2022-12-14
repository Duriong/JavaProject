package ch10;

class Pa3{
	int num = 10; //사번
	String name = "홍길동"; //이름
	public void print() {
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
	}
}

class Ch3 extends Pa3{
	String email = "hong@gmail.com";//이메일
	String phone = "010-1234-5678";//전화번호
	@Override
	public void print() {
		super.print();
		System.out.println("이메일 : " +email);
		System.out.println("전화 : " +phone);
	}
}


public class Poly3 {
	public static void main(String[] args) {
		String address = "서울 강남구 역삼동";
		Pa3 p = new Ch3();//다형성
		p.print();
		System.out.println("주소 : "+address);
	}
}
