package ch12;

public class MemberOuter {
	//멤버변수
	private int num = 1; //MemberOuter의 멤버변수
	private String name = "홍길동";//이름
	private String email = "hong@gmail.com";//이메일
	
	
	class MemberInner {
		void print() {
			System.out.println("------------------------");
			System.out.println("고객번호 : " + num);
			System.out.println("이름 : " + name);
			System.out.println("이메일 : " + email);
			System.out.println("------------------------");
		}
	}//end Inner class
	
	public static void main(String[] args) {
		MemberOuter m = new MemberOuter();
		MemberOuter.MemberInner in = m.new MemberInner();
		in.print();
	}
}
