
package chap05.lecture.string;

public class C06RegEx {
	// git.io/vx86V	
	public static void main(String[] args) {
		// regular expression
		// 정규식(정규표현식)
		// 문자열의 패턴을 표현한 문자
		
		// 한 문자
		System.out.println("a".matches("a"));
		System.out.println("b".matches("a"));
		System.out.println("aa".matches("a"));
		System.out.println("abc".matches("a"));
		
		// 여러문자 중 하나
		System.out.println("a".matches("[abc]"));
		System.out.println("b".matches("[abc]"));
		System.out.println("c".matches("[abc]"));
		System.out.println("d".matches("[abc]"));
		System.out.println("abc".matches("[abc][abc][abc]"));
		System.out.println("bbb".matches("[abc][abc][abc]"));
		
		
		
		
	}
}





