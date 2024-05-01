package basic.ch22;

public class Turile implements RaceParticipant {

	private final int speed = 2;

	@Override
	public String getname() {
		return "깡총깡총거북이";
	}

	@Override
	public int getSpeed() {
		return speed;
	}
	
}
