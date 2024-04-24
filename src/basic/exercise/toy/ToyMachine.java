package basic.exercise.toy;

import java.util.Random;

// 클래스 - 인형뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟
// 요구 조건
// 배열을 활용해서 객체들을 담아 주세요
public class ToyMachine {
	
	
	
	private int productCount = 1;
	private final int MAX_PRODUCT = 10;
	Random rd = new Random();
	Product[] products;
	
	//배열 
	public Product[] getProducts() {
		return products;
	}
	// setter 메서드
	public void setProducts(Product[] products) {
		this.products = products;
	}
		
	
	
	
	// 상품 추가 기능 만들기 
	public void addProduct(Product product) {
		if(productCount < MAX_PRODUCT) {
			products[productCount] = product;
			productCount++;
		}
		products[0] = product;
	}
	
	
	// 상품 뽑기 
	public void pickProduct() {
		int a = rd.nextInt(10);
		 products[a].showInfo();
	}
	
	

	

}//end of class
