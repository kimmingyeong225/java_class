package basic.ch09;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Game game1 = new Game();

		System.out.println("GAME Start");
		System.out.println("1. 전사(Warrior)");
		System.out.println("2. 마법사(Wizard)");
		System.out.println("3. 궁수(Archer)");
		System.out.println("직업의 번호를 입력하세요");
		int num = scan.nextInt();

		if (num == 1) {
			System.out.println("전사가 선택되었습니다");
			// game.

		} else if (num == 2) {
			System.out.println("마법사가 선택되었습니다");
		} else {
			System.out.println("궁수가 선택되었습니다");
		}

		Warrior warrior1 = new Warrior();
		Wizard wizard1 = new Wizard();
		Archer archer = new Archer();

	}
}
