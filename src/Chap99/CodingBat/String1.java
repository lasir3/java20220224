package Chap99.CodingBat;

public class String1 {
	
	public String firstTwo(String str) {
		  if(str.length() <= 1){
		    return str;
		  }
		  return str.substring(0,2);
		}
	
	public String nTwice(String str, int n) {

		  return str.substring(0, n) + str.substring(str.length()-n);
		}
	
	public String middleThree(String str) {
		  
		  return str.substring((str.length()/2) - 1, ((str.length()/2) + 2));
		}
	
	public boolean hasBad(String str) {
		  // String check = "bad";
		  // if(str.length() <= 2){
		  //   return false;
		  // }
		  // if(str.substring(0,2).equals(check) || str.substring(1,3).equals(check)){
		  //   return true;
		  // }
		  // return false;
		  
		  int i = str.indexOf("bad");
		  return (i == 0) || (i == 1);
		}
	
	public boolean frontAgain(String str) {
		if (str.length() < 2) {
			return false;
		}

		String end = str.substring(str.length() - 2);
		int i = str.indexOf(end);
		return i == 0;
	}
	
	public String seeColor(String str) {
		  if(str.indexOf("red") == 0){
		    return "red";
		  }
		  if(str.indexOf("blue") == 0){
		    return "blue";
		  }
		  return "";
		}

	
	
}
