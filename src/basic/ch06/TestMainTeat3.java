package basic.ch06;

import basic.ch05.Student;

public class TestMainTeat3 {

	public static void main(String[] args) {

		Test test1 = new Test();

		// 1. 인사말 출력하기
		greet("민경");

		// 2. 제곱 계산하기
		int square = square(5); //square --> 나의 정수를 입력받아 그 수의 제곱을 반환하는 함수
		System.out.println("5의 제곱근: " + square);

		// 3. 나이 확인
		System.out.println(checkAdult(16));

		// 4. 수의 부호 판별
		System.out.println(signOfNumber(0));
		
		//5. 최대값 찾기 함수 
		System.out.println(findMax(2, -28));
		

	}
 //1
	static void greet(String b) {
		System.out.println("안녕하세요" + b + "님!"); //출력 --> b는 지정 이름이 아니라서 임의로 아무거나
	
	

	}
//2
	static int square(int n1) { //n1 임의로 아무 숫자 지정
	int a = n1 * n1; //제곱이니까 ex) 5 * 5 
	return a;
	}
	
//3
	static boolean checkAdult(int a) {
		boolean e;
		if (a >= 18) {
			e = true;

		} else {
			e = false;

		}
		return e;
	}
	
	
//4  (static String --> 출력 signOfNumber --> 함수 이름 int --> 입력)
		//String --> 이건 항상 대문자!
	static String signOfNumber(int a) {
		String w; 
		if (a > 0) {
			w = "positive";

		} else if (a < 0) {
			w = "negative";
		} else {   //else --> 조건 없이 
			w = "zero";
		}
		{
			return w;
		}

	}
	
//5	
	static int findMax(int a, int b) {
		int w;
		if(a>b) {
			w=a;
			
		}else {
			w=b;
		}
		return w;
		
	}
}