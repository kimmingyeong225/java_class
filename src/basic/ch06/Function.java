package basic.ch06;

public class Function {

	public static void main(String[] args) {
		
		System.out.println("여기 메인 함수를 시작합니다.");
		int result1 = add(5, 10);
		System.out.println("result1 :" + result1);
	
		int result2 = add(90, 80);
		System.out.println("result2 :" + result2);
	}
	
		static int add(int n1, int n2){
		
		int result; // 변수 ->> 지역 변수
		result = n1 + n2;
		return result;
		
		
		
		
	}

}
