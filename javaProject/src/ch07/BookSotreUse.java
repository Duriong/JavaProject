package ch07;

public class BookSotreUse {

	public static void main(String[] args) {
		BookStore bs = new BookStore();//객체생성
		bs.setBookName("Java");
		bs.setAuthor("김선생");
		bs.setPress("영진");
		bs.setYear(2022);
		bs.setAmount(10);
		bs.setPrice(30000);
		//출력
		bs.print();
	}

}
