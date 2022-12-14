package ch04;

public class Matrix2 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) { //i와j가 같을 때만 찍는다
					System.out.printf("[%d,%d]", i,j);
				}else {//그게 아니면 빈칸으로 적는다 c는 단문자 라는 뜻
					System.out.printf("%5c" , ' ');//c는 단문자출력, 5칸씩 빈문자열로 처리
				}
			}//안쪽 for문
			System.out.println(); //행전체 옮길 때 alt위아래
		}//바깥쪽 for문
	}
}
