package ch14;

//Generic(일반화) 기법
public class Type3<T> {//자료형이 미정인 상태<아무문자> => <>제너릭 기호
	T t;//변수도 자료형 미정
	public void setT(T t) {//메소드도 자료형 미정
		this.t = t;
	}
	public T getT() {
		return t;
	}
	
	public static void main(String[] args) {
		//인스턴스를 생성할 때 자료형을 결정함.=>제너릭(일반화)이라 함.
		Type3<String> t = new Type3<String>();
		t.setT("Hello");
		System.out.println(t.getT());
		
		Type3<Integer> t2 = new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3 = new Type3<Double>();//생성자 매개변수 활용
		//t3.setT(100.1)
		t3.setT(100.1);
		System.out.println(t3.getT());
		
		//<>자료형을 주지 않고 일반적 방법으로 처리시는 실행은 되지만 경교처리됨
		//내부적으로 모두 Object로 처리하게되어 메모리 낭비가 심해짐
		Type3 t4 = new Type3();
		t4.setT(100.5);//Object 처리
		System.out.println(t4.getT());
	}
}
