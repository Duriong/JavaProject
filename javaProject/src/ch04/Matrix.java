package ch04;
//행렬 처리 시 중첩for문이 유용하다
public class Matrix {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("[%d,%d]" ,i,j);
			}//안쪽 열
			System.out.println();
		}//바깥쪽 행
	}
}
