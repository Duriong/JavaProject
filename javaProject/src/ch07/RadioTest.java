package ch07;

public class RadioTest {

	public static void main(String[] args) {
		
		Radio myRadio = new Radio();
		
		myRadio.name = "브리츠";
		myRadio.onOff = true;
		myRadio.channel = 89.1;
		myRadio.volume = 12;
		myRadio.print();
		
		Radio myRadio2 = new Radio();
		
		myRadio2.name = "아이리버";
		myRadio2.onOff = false;
		myRadio2.channel = 95.1;
		myRadio2.volume = 9;
		myRadio2.print();
	}
}
