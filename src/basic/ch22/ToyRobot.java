package basic.ch22;

public class ToyRobot implements RemoteController, SoundEffect {

	int withd;
	int height;
	String color;
	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다");
		
	}
	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다");
		
	}
	@Override
	public void soundOn() {
		System.out.println("듀두두두두두 ~~~~");
		
	}
	
	// turnOn
	// turnOff
	
}
