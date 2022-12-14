package ch11;

public interface OperateCar {
	void start();//매개변수 없음
	void stop();
	void setSpeed(int speed);//매개변수 있음
	void turn(int degree);
}
