package com.edu;

@FunctionalInterface
interface Subtraction{
	int sub(int i, int j);
}

public class FunctionalInterfaceMain3 {
	public static void main(String[] args) {
		Subtraction sobj=(i, j)->{
			int ans;
			ans = i - j;
			return ans;
		};
		
		System.out.println("differene="+sobj.sub(4, 1));
      
		Subtraction s1 = (i, j)->(i - j);
		System.out.println("difference "+s1.sub(6, 2));
	}
}