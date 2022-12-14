package ch05;

//ArraySum.java에서 약식배열처리를 정석대로 바꾸기

public class ArraySum_Ex {

	public static void main(String[] args) {
		int[] num;
		int sum=0;
		num = new int[5];
		
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		for(int i=0; i<5; i++) {
			sum = sum+num[i];
		}
		System.out.println("합계 : " + sum);
	}
}
