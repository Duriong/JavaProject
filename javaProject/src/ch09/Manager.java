package ch09;
//자식클래스
public class Manager extends Employee {
	//기본생성자
	public Manager(String string, String name, String address, 
			String email, int salary, String rrn) {
	
	}

	public void print() {
		System.out.println("---------------------------------------------------");
		System.out.println("사원번호 : " +getNum());
		System.out.println("이름 : " +getName());
		System.out.println("주소 : " +address);
		System.out.println("이메일주소 : " +email);
		System.out.println("연봉 : " +salary);
		System.out.println("주민번호 : " +getRrn());
		System.out.println("---------------------------------------------------");
	}
}
