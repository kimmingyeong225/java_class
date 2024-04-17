package basic.ch02;

public class TraingleAreaCalculator {

	public static void main(String[] args) {
		
		//삼각형 밑변 BASE, 단 상수로 선언
		final double BASE = 10.0;
		//삼각형 높이 HEIGHT, 단 상수로 선언
		final double HEIGHT = 5.0;
		//결과 값을 area 변수에 저장
		double area = ( BASE * HEIGHT) / 2;
		
		System.out.println("삼각형의 면적 : " + area);
		
		
	}// end of main

}// end of class
