package basic.exercise;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class PhoneBookManger {
	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// Scanner활용, 입력 받는 데이터 타입은 전부 String 으로 처리
		// 전화번호 저장은 100까지 한정.

		// 스캐너 사용
		// 배열 선언 100개
		// while()

		Scanner sc = new Scanner(System.in);
		PhoneBook[] manger = new PhoneBook[100];

		// manger[0] = new PhoneBook("가");
		// manger[1] = new PhoneBook("가");

		final String SAVE = "1"; // 저장
		final String SEARCH_ALL = "2"; // 조회
		final String REVISE = "3"; // 수정
		final String DELETE = "4"; // 삭제
		final String SEARCH = "5"; // 선택 조회
		final String END = "0"; // 종료
		boolean flag = true;

		while (flag) {
			System.out.println("** 전화번호부 **");
			System.out.println("1.저장 2.전체조회 3.수정 4.삭제 5.선택조회 0.프로그램 종료");
			String selected = sc.nextLine();

			if (selected.equals(SAVE)) {
				System.out.println(" >> 저장하기 <<");
				save(sc, manger);
				
			} else if (selected.equals(SEARCH_ALL)) {
				System.out.println(" >> 조회하기 <<");
				searchAll(manger);
				
			} else if (selected.equals(REVISE)) {
				System.out.println(" >> 수정하기 <<");
				revise(sc, manger);//
				
			} else if (selected.equals(DELETE)) {
				System.out.println(" >> 삭제하기 <<");
				deleteAll(manger);
				
			} else if (selected.equals(SEARCH)) {
				System.out.println(" >> 선택 조회 << ");
				search(sc, manger);//
				
			} else if (selected.equals(END)) {
				System.out.println(" >> 종료 << ");
				flag = false;
				
			} else {
				System.out.println("잘못된 입력입니다");
			}

		}

	}// end of main

	// 저장 0
	public static void save(Scanner sc, PhoneBook[] manger) {
		System.out.println("-----저장하기-----");
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("전화번호를 입력해주세요 : ");
		String number = sc.next();
		PhoneBook book = new PhoneBook(name, number);
		
		for (int i = 0; i < manger.length; i++) {
			manger[i] = book;
			break;
		}

	}

	// 조회 0
	public static void searchAll(PhoneBook[] manger) {
		System.out.println("-----조회하기-----");
		boolean isFind = false;
		for (int i = 0; i < manger.length; i++) {
			// 방어적 코드.
			if (manger[i] != null) {
				System.out.println(manger[i].getName() + "," + manger[i].getNumber());
				isFind = true;
			}

		}
	}

	// 수정
	public static void revise(Scanner sc, PhoneBook[] manger) {
		System.out.println("------전화번호 수정하기-------");
		for(int i = 0; i<manger.length; i++) {
			if(manger[i] != null) {
				System.out.println(manger[i].getNumber() + " , " + manger[i].getName());
			}
		}
		System.out.println("수정하겠습니까?(0번부터 시작");
		int dateNumber = sc.nextInt();
		for (int i = 0; i < manger.length; i++) {
			if (i == dateNumber) {
				System.out.println("이름을 입력하세요 : ");
				String name = sc.next();
				System.out.println("전화번호를 입력해주세요 : ");
				String number = sc.next();
				
				PhoneBook book = new PhoneBook(name, number);
				manger[i] = book;
				break;
				
				}
		}
	}
	// 삭제 0
	public static void deleteAll(PhoneBook[] manger) {
		System.out.println("-------- 전체 삭제하기-------");
		for (int i = 0; i < manger.length; i++) {
			manger[i] = null;

		}
	}

// 선택 조회
	public static void search(Scanner sc, PhoneBook[] manger) {
		System.out.println("------선택 조회 하기------");
		System.out.println(">>> 이름을 적어주세요 <<<");
		String phoneName = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < manger.length; i++)
			if (manger[i] != null) {
				if (manger[i].getName().equals(phoneName)) {
					System.out.println(manger[i].getName() + "," + manger[i].getNumber());
					isFind = true;
					break;
				}
			}

		// 만약 선택된 값이 없다면 해당 제목에 책은 존재하지 않습니다
		if (isFind == false) {
			System.out.println("존재하지 않습니다.");
		}

	}

}// end of class
