package com.edu.stringprograms;
import java.util.Scanner;

public class InitialsOfString {

    public static void main(String args[]){
        String s;
        int i;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a name: ");
        s=sc.nextLine();

        System.out.print("The initials of the name is ");
        for(i=0; i<s.length(); i++){
            if(i==0 && s.charAt(i)!=' '){
                System.out.print(s.charAt(i));
            }
            else if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                System.out.print("."+s.charAt(i+1));
            }
        }
    }
}
