package basic.ch02;

public class Test1 {

	public static void main(String[] args) {
	
	//해결
		
		//상수 선언 - 원가, 할인율
		final double ORIGINAL_PRICE = 59.99;
		final double DISCOUNT_RATE = 0.3; //30% 할인
		
	// 할인된 가격 계산 하기(니비니스 로직)
		double discountedPrice = ORIGINAL_PRICE * (1 - DISCOUNT_RATE); //할인율을 계산하는 공식
		
	//형변환 --> 최종된 가격을 정수형을 형변환 처리
		int finalPrice = (int)discountedPrice;
		
	//결과 출력
		System.out.println("최종 가격 : " +  finalPrice);
		System.out.println("최종 가격(소수점 : " + discountedPrice);
		
		//String - 문자 int 숫자나 언어
		
	}

}
