package basic.ch04;

public class DataType1 {

	public static void main(String[] args) {
		
				
		// 데이터 타입에 종류 
				// 1. 기본 자료형 (primitive data type) 
				// 2. 참조 타입 (Reference type) 
				
				
				// 기본 자료형 
				// [정수형, 문자형(문자열x), 실수형, 논리형 ]  4가지로 구분 하자. 
				
				// 정수형 - 정수는 소수점 이하를 포함하지 않는 숫자를 의미 합니다. 
				// 1, 2 -5, 100 등은 모두 정수 입니다. 
				
				byte byteBox;     // 1바이트  -> 네모칸 한칸은 1bit --> 8bit --> 1byte;  
				short shortBox;   // 2바이트  -> 16bit -> 2byte 
				int intBox;       // 4바이트  -> 32bit 
				long longBox;     // 8바이트  -> 64bit 
				
				
				// 위 상자들은 정수값을 담을 수 있는 상자인데 크기가 정해져 있다. 
				byteBox = -128;
				byteBox = 127; //
				
				shortBox = -32768; 
				shortBox = 32767;
				
				// 약+- 21억까지 사용 가능 하다.  
				intBox = -2147483648;
				intBox = 2147483647;
				
				// 약 경까지 			
				longBox = -9223372036854775808L; //숫자 마지막에 L은 접미사라고 합니다.  
				longBox = 9223372036854775807L;  //int 값이 아니라 long 값이라고 표시 용도이다. 
				
				// L value = R value 
				// 보통 오른쪽에 기술 되는 수의 기본 단위는 4바이트 크기인 int 형으로 먼저 인지한다.
				// 정수형에 기본 연산 단위는 int형 이다. 
				
			
			
	}

}
