package basic.ch02;

public class RectangleAreaCalculator {

	public static void main(String[] args) {
		// 가로 길이, 세로 길이, 단 상수 사용
		// 아래에 식을 작성하시오.
		
		//사각형의 면적을 구하는 코드 WIDTH, HEIGHT
		
		final int width = 20;
		final int height = 40;
		
		int area = width * height;
		
		System.out.println("사각형의 면적 :" + area);
		
		//삼각형의 면적을 구하는 코드 (밑변 * 높이)/2
		
		final int width1 = 40;
		final int height1 = 20;
		
		int area1 = (width1 * height1) / 2;
		
		System.out.println("삼각형의 면적 :" + area1);
	 
		
	
	}

}
