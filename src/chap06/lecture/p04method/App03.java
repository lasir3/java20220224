package chap06.lecture.p04method;

public class App03 {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.execute("java");
		c1.execute("C#");
		
		c1.update("calculator");
		c1.update("windows");
		
		c1.add(3, 5);
		c1.add(10, 20);
		//c1.add(3.14, 1.0);
		c1.add('c', 'a');//자동 형변환 됨
		
	}
}
