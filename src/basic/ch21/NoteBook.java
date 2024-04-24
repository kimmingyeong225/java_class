package basic.ch21;

public class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("노트북의 화면이 실행됩니다");
		
	}

	@Override
	public void typing() {
		System.out.println("노트북에 타자를 입력합니다");
		
	}
	
	//public abstract void typing();

	
}
