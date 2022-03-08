package Chap99.CodingBat.Test;

public class catdogTest {
	public static void main(String[] args) {
//		catDog("catxxdogxxxdog") → false
		System.out.println(catDog("catxxdogxxxdog"));
	}
	public static boolean catDog(String str) {

		  int catcnt = 0;
		  int dogcnt = 0;

		  for(int i = 0; i < str.length() - 2; i++) {
		    if (str.substring(i, i+3).equals("cat")){
		      catcnt++;
		    } else if (str.substring(i, i+3).equals("dog")){
		      dogcnt++;
		    } 
		    if (catcnt == dogcnt){
		      return true; // catcnt와 dogcnt가 true가 되는순간 true를 리턴하고 catDog 메소드가 종료됨
		    }
		  }
		  return false;
		}
}
