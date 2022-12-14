package ch16;

public class BankPlayer extends Thread {
	int num;
	MyBank myBank;
	
	public BankPlayer(int num, MyBank myBank) {
		this.num = num;
		this.myBank = myBank;
	}
	
	@Override
	public void run() {
		switch (num) {//type이 무엇이냐에 따라서 MyBank의 메소드가 다르게 호출
		case 1: myBank.accountA(); break;
		case 2: myBank.accountB(); break;
		case 3: myBank.accountC(); break;
		}
	}

}
