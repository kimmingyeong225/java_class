package basic.ch04;

public class IfTest {

	// 코드의 시작점 (메인 함수) 
	public static void main(String[] args) {
		
	
		boolean flag = true; 
		
		if(flag) {
			// 수행 구문
			System.out.println("너 출력됨 ^^");
			flag = false; 
			
		} // end of if -> 블록에 범위를 기억 하자   
		// if 문 단독은 수행 될 수도 있고 안될 수도 있다. 
		
		System.out.println("코드가 여기까지 내려 옵니다. : " + flag);
		
	} // end of main 
	
} // end of class 