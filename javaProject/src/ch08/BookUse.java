package ch08;

public class BookUse {

	public static void main(String[] args) {
		Book b = new Book("Java", "홍길동", "영진", 2019, 35000, 5);
		b.print();
		
		Book b2=new Book();
		b2.print();
	}

}
