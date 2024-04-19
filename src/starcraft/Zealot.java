package starcraft;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		power = 4;
		hp = 70;
	}

	// getter
	public String gerName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 질럿이 저글링을 공격합니다.

	public void attackZargling(Zergling z) {

		System.out.println(this.name + "이" + z.getName() + "을 공격합니다");
		z.beAttacked(this.power);

	}

	// 질럿이 마린을 공격합니다.
	public void attackMarine(Marine m) {
		System.out.println(this.name + "이" + m.getName() + "을 공격합니다");
		m.beAttacked(this.power);
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
