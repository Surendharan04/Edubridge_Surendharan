package com.edu.exceptionhandling;

public class DemoException {

	public static void main(String[] args) {
		int c;
		int[] arr;
		arr = new int[3];
		
		try {
			arr[4] = 5;
			c = 5/0;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){	//We can give two or more exceptions in the same catch
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			//System.exit(0);	-> This will stop finally execution
			return;	//This will not stop finally execution
		}
		catch(Exception e) {	//SuperClass Exception should be in separate catch
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally");
		}

	}

}
