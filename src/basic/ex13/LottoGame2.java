package basic.ex13;

public class LottoGame2 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
		
		// 전체 1~6 까지 나온 결과값을 오름 차순으로 정렬
		//단 ,중복 값 제외
		
		//수식을 작성해주세요
		//만약 if --> 반복문 사용 금지 if문 6개로 구성해주세요
		
		//그 앞의 수보다 증가하게 되잖아
		
		int tempBox = 0;
		// 5, 1, 9, 7, 2, 3
		
		if(gameNumber1 > gameNumber2) {
			tempBox = gameNumber2;
			gameNumber1 = gameNumber1;
			gameNumber2 = tempBox;
		}
		if(gameNumber2 > gameNumber3) {
			tempBox = gameNumber3;
			gameNumber2 = gameNumber2;
			gameNumber3 = tempBox;
		}
		if(gameNumber3 > gameNumber4) {
			tempBox = gameNumber4;
			gameNumber3 = gameNumber3;
			gameNumber4 = tempBox;
		}
		if(gameNumber4 > gameNumber5) {
			tempBox = gameNumber5;
			gameNumber4 = gameNumber4;
			gameNumber5 = tempBox;
		}
		if(gameNumber5 > gameNumber6) {
			tempBox = gameNumber6;
			gameNumber5 = gameNumber5;
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
