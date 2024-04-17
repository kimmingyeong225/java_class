package basic.ch07;

public class Book {

	int bookID;
	String bookName;
	String bookAuthor;
	String bookTitle;
	
	// 메서드 설계 하기
		public void read() {
			System.out.println(bookName + "책을 읽습니다");
		}
		
		public void showInfo() {
			System.out.println("--------상태창-----------");
			System.out.println("책 코드: "  + bookID);
			System.out.println("책 분류 : "  + bookTitle);
			System.out.println("책 제목 : "  + bookName);
			System.out.println("책 저자 : "  + bookAuthor);
			
					
		}
		
}
