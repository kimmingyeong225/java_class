package basic.ex13;

public class LottoGame {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
	//	int gameNumber3 = LottoNumberMaker.makeNumber();
	//	int gameNumber4 = LottoNumberMaker.makeNumber();
	//	int gameNumber5 = LottoNumberMaker.makeNumber();
	//	int gameNumber6 = LottoNumberMaker.makeNumber();
		
		System.out.println(gameNumber1 + "\t");
		System.out.println(gameNumber2 + "\t");
	//	System.out.println(gameNumber3 + "\t");
	//	System.out.println(gameNumber4 + "\t");
	//	System.out.println(gameNumber5 + "\t");
	//	System.out.println(gameNumber6 + "\t");

		// 오름차순으로 정렬해보기
		// 만약 1상자 2상자보다 크다면 어떤 행동을 하라
		// 단 변수에 값을 담고 출력 하세요.
		
		// 예상 1box = 5, 2box = 3
		int tempBox = 0;
		if(gameNumber1 > gameNumber2) {
			// 0    =   3  --> temp ==3
			tempBox = gameNumber1;
			
			gameNumber1 = gameNumber2;
			
			gameNumber2 = tempBox;
	
			
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		// 정렬 --> 3, 5
		
		

}// end of main

}
