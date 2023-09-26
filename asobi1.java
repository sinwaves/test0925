package Asobi;

import java.util.function.Function;

public class asobi1 {
	
	public static int twice(int x) { return x * 2; }

	public static int sub(int a, int b) { return a - b; }
	
	public static Integer len(String s) { return s.length(); }
	
	public static void main(String[] args) 
	{
		
		
			Function<String, Integer> func = asobi1::len;
			
			String ss = new java.util.Scanner(System.in).nextLine();
			int a = func.apply(ss);
			
			System.out.println("文字列" + ss + "は" + a + "文字です");
		
		
		
	}

}
