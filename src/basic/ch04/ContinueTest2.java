package basic.ch04;

public class ContinueTest2 {

	//코드의 시작점
	public static void main(String[] args) {
		//1부터 100까지 숫자 중에 3의 배수를 출력 하세요
		//1 ~ 100 --> 반복적인 패턴이 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요    배수 % (if (i % 3 == 0)
		//반복묵은 while을 사용해 주세요
		
		int i = 1;
		boolean flag = true;
		//풀이 2 : 특정 조선이 되었을 때 반복문을 멈추어라
		while(flag) {
			
			if(i % 3 == 0) {
				System.out.println("3의 배수 : " + i);
			}
			System.out.println("3의 배수 : " + i);
			
			//특정 조검ㄴ -> 멈추기
			if(i ==100) {
				flag = false;
				//i == 100
			}
			i++; //i == 101
		}
		
		
		
		//풀이 1
		/*int i = 1;
		while(i <= 100) {
			if(i % 3 == 0) {
				System.out.println("i의 값: " + i );	
			}
			
			i++;// 식 사용하기 (무한 반복 예방)
			
		}*/
		
	}// end of main

}// end of class
