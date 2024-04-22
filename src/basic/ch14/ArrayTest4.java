package basic.ch14;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 멤버 변수
		// int --> 0
		// char --> 0(저장되어 있는 값은 정수값)
		// String --> null
		// Book --> null

		String[] arrayStr = new String[26];

		arrayStr[0] = "A";
		arrayStr[1] = "B";
		arrayStr[2] = "C";
		arrayStr[3] = "D";
		arrayStr[3] = "E";
		arrayStr[25] = "Y";

		System.out.println(arrayStr[4]);

		// 배열 안에 요소의 개수를 출력 하시오
		// 값이 있다면 콘솔창에 출력
		// 반복문 활용

		int eCount = 0;

		for (int i = 0; i < arrayStr.length; i++) {
			if (arrayStr[i] != null) { // null 값이 있어서 0을 넣으면 오류가 생기는 걸까?...
				// 요소의 개수 저장
				eCount++;
				System.out.println(arrayStr[i]);

			}

		}
		System.out.println("요소의 개수는? " + eCount);

	}// end of main

}// end of class
