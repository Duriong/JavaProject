package ch09;
//부모클래스
public class Employee {
	private int num;//사원번호
	public String name;//이름
	String address;//주소
	String email;//이메일주소
	protected int salary;//연봉
	private String rrn;//주민번호
	

	//getter,setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	
	//기본생성자
	public Employee() {
	}
	
	//매개변수가 있는 생성자
	public void input (int num, String name, String address, 
			String email, int salary, String rrn) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;
		this.rrn = rrn;
	}
	
	//개발자를 위한 디버깅용 메소드
	
	
	
	
}
