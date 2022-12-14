package ch02;

public class Box {

	public static void main(String[] args) {
		double length, height, area, border;
		
		length = 10.0; //가로
		height = 5.0; //세로
		
		area = length * height; //넓이
		border = 2.0 * (length + height); //둘레
		
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + border);
	}

}
