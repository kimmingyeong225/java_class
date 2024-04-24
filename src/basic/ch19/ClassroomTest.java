package basic.ch19;

public class ClassroomTest {

	public static void main(String[] args) {
	
		Classroom classrommA = new Classroom("C4");
		Student student1 = new Student("홍길동" , 20);
		Student student2 = new Student("이순신" , 24);
		
		classrommA.addStudent(student1);
		classrommA.showStudents();
		
	}//end of main

}//end of class
