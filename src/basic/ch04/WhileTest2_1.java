package basic.ch04;

public class WhileTest2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 5까지 덧셈 연산을 하라
		// 1 + 2 + 3 + 4 + 5

		int start = 1; // 시작값은 1
		int end = 5;// 5번
		int sum = 0;

		// 특정 조건식을 만들어 반복문을 멈추게 해야 한다.
		// start 값이 10일 때 종료 하라

//		while (true) {
//			if (start == 10) {
//				// 실행에 제어권을 반납한다.
//				flag = false;
//				return;
//			}
//
//		} // end of whie
		
		boolean flag = true;
		while(flag) {
			
			if(start == 10) {
				flag = false; 
			}
			
			sum = sum + start;
			
			System.out.println("sum("+start+"):" + sum);
			start++; // 증감 연산자 1씩 증가 
		}
		

	} // end of main

} // end of class
