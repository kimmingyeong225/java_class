package basic.ex13;

public class LottoGame3 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		int tempBox = 0;

		// 반복의 횟수 - 6;
		for (int pass = 1; pass <= 6; pass++) {
			tempBox = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = tempBox;
		}
		if(gameNumber2 > gameNumber3) {
			tempBox = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = tempBox;
		}
		if(gameNumber3 > gameNumber4) {
			tempBox = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = tempBox;
		}
		if(gameNumber4 > gameNumber5) {
			tempBox = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = tempBox;
		}
		if(gameNumber5 > gameNumber6) {
			tempBox = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = tempBox;

		}

		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		System.out.println(gameNumber3);
		System.out.println(gameNumber4);
		System.out.println(gameNumber5);
		System.out.println(gameNumber6);

	}// end of main

}
