package Chap99.CodingBat;

public class String2 {
	public String doubleChar(String str) {
		  String result = "";
		  for (int i = 0; i < str.length(); i++){
		    result = result + str.charAt(i) + str.charAt(i);
		  }
		  return result;
		}

	public int countHi(String str) {
		  int count = 0;
		  for (int i = 0; i < str.length() - 1; i++){
		    if((str.substring(i, i+2)).equals("hi")){
		      count++;
		    }
		  }
		  return count;
		}

	public boolean catDog(String str) {

		  int catcnt = 0;
		  int dogcnt = 0;

		  for(int i = 0; i < str.length() - 2; i++) {
		    if (str.substring(i, i+3).equals("cat")){
		      catcnt++;
		    } else if (str.substring(i, i+3).equals("dog")){
		      dogcnt++;
		    }
		  }
		  return catcnt == dogcnt;
		}
}
