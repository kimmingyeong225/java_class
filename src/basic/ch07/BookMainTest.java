package basic.ch07;

public class BookMainTest {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.bookID = 2025641;
		book1.bookTitle = "소설";
		book1.bookName = "인간실격";
		book1.bookAuthor = "다자이 오사무";
		System.out.println("----------------");
		
		book1.showInfo(); //화면 출력
		//1개만 따로 빼오기 (3가지 방법)
		System.out.println(book1.bookName);
	 	String name = book1.bookName;	
	 	System.out.println("name : " + name);
			
			
		}
	
	
	}


