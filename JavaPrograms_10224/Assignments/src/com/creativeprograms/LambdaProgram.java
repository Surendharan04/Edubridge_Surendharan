package com.creativeprograms;

import java.util.Scanner;
import java.util.stream.Collectors;	//Doselect won't allow importing of classes

/*String str="CAPGEMINI"->INPUT
C A P G E M I N I->OUTPUT

Using Lambda Expression*/

@FunctionalInterface
interface WhiteSpacedString{
	void whiteSpace(String s);
}

public class LambdaProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String string = sc.next();
		
		WhiteSpacedString wss = (String s) -> {
			char[] charr = s.toCharArray();
			for (int i = 0; i < charr.length; i++) {
				System.out.print(charr[i]);
				if (i < charr.length - 1) {
                    System.out.print(" ");
                }
			}
		};
		wss.whiteSpace(string);
		System.out.println("\nStream API:");
		
		//Stream API
		String streamstr = string.chars().mapToObj(c -> (char) c + " ").collect(Collectors.joining());
		System.out.println(streamstr.trim());
	}
}

/*Original Solution:(DoSelect)

@FunctionalInterface
interface StringSpace{
	String addSpace(String s);
}


public class InsertSpace {

	
    public static void main(String[] args) {
		 
	 StringSpace sp=(s1)->{
		 StringBuilder sb=new StringBuilder();
		
		 s1.chars()
		.mapToObj(c->(char)c+" ") //C 
		.forEach(sb::append);
		 return sb.toString().trim();
	 };
	 
	 System.out.println(sp.addSpace("CAPGEMINI"));
    	
   }

}*/
