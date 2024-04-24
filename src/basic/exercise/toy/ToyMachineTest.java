package basic.exercise.toy;

import java.util.Random;
import java.util.Scanner;

public class ToyMachineTest {

	// 코드 테스트
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		boolean money = true;
		
		System.out.println("-----------------------------");
		System.out.println("인형뽑기");
		
		Product product1 = new Liondoll(); //업캐스팅
		Product product2 = new Teddybear(); //업캐스팅
		Product product3 = new Airpods(); //업캐스팅
		
		
		
		
		Product[] probucts = new Product[10];
		probucts[0] = product1;
		probucts[1] = product2;
		probucts[2] = product3;
		
	/*whi
			System.out.println("도전 횟수를 입력하세요(0 입력시 종료)");
			System.err.println("반드시 숫자만 입력해주세요");
			int chance = sc.nextInt();
			
			if (chance > 0) {
				System.out.println("상품 뽑기를 진행합니다");
				
				for(int i = 0; i< chance; i++) {
					int a = rd.nextInt(150);
					System.out.println("뽑는 중");
					
					System.out.println("");
					System.out.print("상품이 뽑혔습니다!(남은기회 : " + (chance - i - 1) + " ) ==> ");
					
			
			*/
					
			
	
		
		
	
		
		System.out.println("----------------------------------------");
		
		System.out.println("뽑혔습니다");
		
		//int answer = 0;
	
		for(int i = 0; i < probucts.length; i++) {
		//if(probucs[i] instanceof   )
		
			
		}
		
	}// end of main

}//end of class
