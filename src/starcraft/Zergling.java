package starcraft;

public class Zergling {

	private String name;
	private int power;
	private int hp;

	public Zergling(String name) {
		this.name = name;
		power = 3;
		hp = 50;
	}

	// get, set

	// 저글링일 질럿을 공격합니다 attackZerlot
	public void attackZerlot(Zealot l) {
		System.out.println(this.name + "이" + l.gerName() + "을 공격합니다");
		l.beAttacked(this.power);
	}
	// 저글링이 마린을 공격합니다 attackMarine

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드 작성
		if (hp <= 0) {
			System.out.println(" [" + this.name + "] 이미 사망하였습니다");
			hp = 0;
			return;
		}

		hp -= power; // 복합 대입연산자 (피를 깍는다)

	}

	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}
}
