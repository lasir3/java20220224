package chap07.book.s070300;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}
