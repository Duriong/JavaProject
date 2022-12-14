package ch09;

public class ScholarUse {

	public static void main(String[] args) {
		Scholar s1 = new Scholar();//객체생성
		s1.setName("김철수");
		s1.setNum("2203");
		s1.setMajor("컴공");
		s1.setYear(1);
		s1.setCategory("1종");
		s1.setMoney(2500000);
		s1.print();
		
		Scholar s2 = new Scholar();//객체생성
		s2.setName("김철수");
		s2.setNum("2203");
		s2.setMajor("컴공");
		s2.setYear(1);
		s2.print2();
	}
}
