package ch16;

public class MyBank {
		//홍길동
		public synchronized void accountA() {
			for(int i=1; i<=5; i++) {
				System.out.println("홍길동님의 통장잔고는 "+i*10+"만원입니다.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//for
		}
		
		//사임당
		public synchronized void accountB() {
			for(int i=2; i<=6; i++) {
				System.out.println("사임당님의 통장잔고는 "+i*10+"만원입니다.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//for
		}
		
		//이몽룡
		public synchronized void accountC() {
			for(int i=3; i<=7; i++) {
				System.out.println("이몽룡님의 통장잔고는 "+i*10+"만원입니다.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//for
		}
}
