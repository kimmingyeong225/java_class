package basic.ch04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 1;
		int end = 10;
		int sum = 0;
		
		while(true) {
			if(start == 11) {
				//flag = false; 
				return;
			}
			
			sum = sum + start;
			
			System.out.println("sum("+start+"):" + sum);
			start++; // 증감 연산자 1씩 증가 
		
			
			}
		
		}
		
	}


