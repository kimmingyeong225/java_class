package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {

	
	public static void main(String[] args) {
		// 자바를 사용하여 1부터 사용자가 입력한 숫자까지의 모든 짝수의 합을 계산하는 프로그램을 작성해보세요. 
		//이 프로그램은 사용자로부터 숫자 하나를 입력받고, 그 숫자까지의 짝수들만을 더한 결과를 콘솔에 출력합니다. 
		//이때, for 반복문을 단일로 사용하여 문제를 해결해야 합니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력 하세요 : ");
		int maxNumber = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 2; i<= maxNumber; i +=2) {
			sum = sum + i;
		}
		System.out.println("sum : " + sum);
	}

}
