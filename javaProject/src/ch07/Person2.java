package ch07;

public class Person2 {
	private String name;//이름
	private int age;//나이
	private String email;//이메일
	private String address;//주소
	
	//getter,setter 활용
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void print() {
		System.out.println("이름:"+name+",나이:"+age+",이메일:"+email+",주소:"+address);
	}
	
	
	
	
	
	
}
