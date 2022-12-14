package ch05;

public class ArrayPoint {

	public static void main(String[] args) {
		String[] name = {"홍길동","이몽룡","성춘향","강감찬","이순신"};
		int[] kor= {100,80,70,60,90}; //5명분의 국어점수
		int[] eng= {80,90,95,85,75};
		int[] mat= {99,89,79,69,77};
		int[] tot= {0,0,0,0,0}; //총점 0으로 초기화		
		double[] avg=new double[5];
		double tot_avg = 0; //평균 0으로 초기화
		for(int i=0; i<5; i++) {
			tot[i]=kor[i]+eng[i]+mat[i]; //인덱스 번호가 0인 홍길동의 총점 구하기 for문이라 반복됨
			avg[i]=tot[i]/3.0; //인덱스 번호가 0인 홍길동의 평균 구하기
			tot_avg=tot_avg+avg[i]; //전체학생에 대한 평균값 누적 처리
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"
		+tot[i]+"\t"+String.format("%4.1f",avg[i]));
		}
		System.out.println("학급평균 : "+String.format("%5.1f", tot_avg/5));
	}
}
