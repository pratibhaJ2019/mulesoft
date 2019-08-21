package dataweave;

public class MyUtils {
	public static String rightPad(String str, int n) {
		
		while(str.length()<n) 
			str = str + " ";
		
		return str;
	}
	
	public static void main(String[] args) {
		System.out.print(rightPad("ciao", 10));
	}
}
