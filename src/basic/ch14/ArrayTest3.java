package basic.ch14;

public class ArrayTest3 {

	public static void main(String[] args) {
	
		char[] alpahbets = new char[26];
		char ch1 = 'A';
		alpahbets[0] = ch1;

		char ch2= 'B';
		alpahbets[1] = ch2;

		char ch3= 'C';
		alpahbets[2] = ch3;
		
		char ch26 = 'z';
		alpahbets[25] = ch26;
		
		// 배열은 반복문과 함께 많이 사용된다.
		int forCount = 0;
		int eCount = 0;
		
		for(int i = 0; i <alpahbets.length; i++) { //alpahbets.length; --> 얼마큼일 때 헷갈릴 때 이렇게 쓸 수 있다.
			if(alpahbets[i] != 0) { //alpahbets[배열 값 i] 가 0이 아니라면 eCount++ 1개 생성한다 --> 요소 갯수
				eCount++;
			}
			//alpahbets[i];
			System.out.println(alpahbets[i]);
			forCount++;
		
		
		}
		System.out.println("for 동작 횟수 " + forCount);
		System.out.println("배열안에 요소의 개수는? " + eCount);
		
		

	}//end of main

}// end of class
