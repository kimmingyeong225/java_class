package basic.exercise;

public class Exercise5 {

	
	public static void main(String[] args) {
		
		//1단계 - 세로 반복에 횟수 (for - 횟수)
		
		//*			- 1 
		//**		- 2
		//***		- 3
		//****		- 4


		for(int i = 0; i<5; i++) { //5번
			
			System.out.print("*");
			System.out.println();
			System.out.print("**");
			System.out.println();
			System.out.print("***");
			System.out.println();
			System.out.print("****");
			System.out.println();
			System.out.print("*****");
			
			System.out.println("------------");
		}
			
			for(int j = 0; j<1; j++) { //1번 동작
				System.out.print("*"); //print()이다
			}
			System.out.println();
			
			for(int j = 0; j<2; j++) { //1번 동작
				System.out.print("*"); //print()이다
			}
			System.out.println();
			
			for(int j = 0; j<3; j++) { //1번 동작
				System.out.print("*"); //print()이다
			}
			System.out.println();
			
			for(int j = 0; j<4; j++) { //1번 동작
				System.out.print("*"); //print()이다
			}
			System.out.println();
			
			for(int j = 0; j<5; j++) { //1번 동작
				System.out.print("*"); //print()이다
			}
			System.out.println();
			System.out.println("---------");
			
			//3단계
			for(int i=0; i<5; i++) { //5번
				
				//inner for
				//첫번째 동작 j = 0, j <= 0 ---> 한번 동작 -> * -> 줄바꿈
				//두번째 동작 j = 0, j <= 1 ---> 0, 1 for 두번 동작 -> ** -> 줄바꿈
				//두번째 동작 j = 0, j <= 2 ---> 0, 1 for 두번 동작 -> ** -> 줄바꿈
				//두번째 동작 j = 0, j <= 3 ---> 0, 1, 2 for 세번 동작 -> *** -> 줄바꿈
				
				for(int j = 0; j<=i; j++) {
					System.out.print("*"); //print()이다
				}
				System.out.println();
				
	
		}
		
	}

}
