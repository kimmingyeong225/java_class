package basic.ch14;

public class ArrayTest1 {

	public static void main(String[] args) {
	
		// 배열이란?
		// 연관된 데이터르 모아서 통으로 관리하기 위한 데이터 타입!
		
		// 배열에 특징(중요)
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈지 크기를 지정해야 사용할 수 있다.
		
		// 배열 메모리 공간 만들기
		// 배열에 길이 -> 3
		// 인덱스에 길이 -> 2
		int[] numbers = new int[3];  //int []numbers -> 만 하면 배열 선언만 한거임 // new int[] --> 공간 선언
		int intBox[] = new int[5];
		
		// 값 넣기(초기화)
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;
		
		// numbers[3] = 1003; --> 인덱스의 길이를 벗어났음, 오류 발생
		// 사전기반지식 -> 모든 프로그래밍에 인덱스 번호에 시작은 0부터 시작한다.
		
		// 배열에 선언과 동시에 초기화
		int[] grades = new int[] {5,3,1} ;
		int[] grades2 = {5,3,1}; // new int[] 생략 가능하다.
 		
		// 문제1
		// 5개의 크기를 가지는 double 타입의 배열을 선언 하시오. (단, 배열에 이름은 마음대로 작성하세요)
		double intBox2[] = new double[5];
		
		
		// 문제2
		// 위에서 선언한 배열에 값에인덱스 0~2 까지 초기화 하세요. (값은 아무거나 상관없음)
		intBox2[0] = 10.0;
		intBox2[1] = 1.0;
		intBox2[2] = 7.3;
		
		//intBox2[4] = 0.0
		//intBox2[5]= 0.0
		
		// 문제3
		// String 타입에 배열을 선언, 배열에 크기는 3개, 선언과 동시에 초기화 하세요.
		
		String[] sT = new String[] {"a", "b", "c"};
		String[] sT2 =  {"a", "b", "c"};
		
		
		
		
	}//end of main

}//end of class
