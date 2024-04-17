package basic.ch09;

// 
import java.util.Scanner;

public class GoingToSchool2 {
	// 메인 함수
	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한 대로 실행에 흐름을 만들어 보자.
		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행에 흐름 만들기
		// 2번을 누르면 지하철 태우는 실행에 흐름을 만들어 보자
		
		
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(1);
		Student s1 = new Student("티모", 10000);
		System.out.println("내 이름은 티모");
		System.out.println("나는 현재 10000원을 가지고 있어");
		Student s2 = new Student("티모", 10000);
		System.out.println("------------");
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("오늘은 어떤 교통수단을 이용할까?");
		System.out.println("버스는 1번, 지하철은 2번");
		//System.out.println("지하철은 2번");
		int input = scanner.nextInt();
		System.out.println();
		System.out.println("나의 선택은 : " + input);
		if(input == 1) {
			System.out.println("오늘은 버스 타야지");
		}else if(input == 2) {
			System.out.println("오늘은 지하철 타야지");
		}else {
			System.out.println("둘 중에 골라줘...");
		}
		
		
		
		
		// 키보드의 값을 받아 주는 녀석
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 값을 입력하시오");
		int input = scanner.nextInt();
		System.out.println("입력 받은 값 : " + input);
		
		// 만약 
		if(input == 5 ) {
			System.out.println(" 5번을 눌렀네.....");
		} else {
			System.out.println(" 뭐 눌렀을까?");
		}
		*/

	}// end of main

}// end of class
