package com.edu.exceptionhandling;

import java.util.Scanner;

class Bank1Exception extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Bank1Exception(String s){
          super(s);
	}
}

class Bank{
	float amt;
	
    public Bank(){
    	amt=1000;
    }
       
    public void depositAmount(float damt){
    	try{
    		if(damt<=0){
    			throw new Bank1Exception ("Deposit amout should greater than zero");
    		}
            else {
                amt=amt+damt;
                System.out.println("Amout after deposit "+ amt);
            }
        }
        catch(Bank1Exception e){
        	e.printStackTrace();
        }     
    }

    //withdraw
    public void  withdrawAmt(float wamt){
    	try{
    		if(wamt<=0 ){
    			throw new Bank1Exception ("Withdraw amout should greater than zero"); 
            }
    		else if(wamt>amt){
    			throw new Bank1Exception ("Insufficient Balance"); 
            }
            else {
            	amt -= wamt;
            	System.out.println("Please collect Rs." + wamt);
                System.out.println("After withdraw your bank balance is " + amt); 
            }
        }
        catch(Bank1Exception e){
        	e.printStackTrace();
        }
            //  return amt;
    }//withdrawAmt
}//class



public class CustomExceptionBank{
	public static void main(String args[]){
		Bank bob=new Bank();
        int ch=0;
        float uamt=0;
        
        Scanner sc = new Scanner(System.in);
        while(ch!=3) {
        	System.out.println("Enter your choice: ");
            System.out.print("1.Deposit ");
            System.out.print("2.Withdraw ");
            System.out.print("3.Exit ");
            ch = sc.nextInt();
              
            switch(ch){
            case 1: System.out.println("Enter amount to deposit");
            	uamt=sc.nextFloat();
                bob.depositAmount(uamt);
                break;
            case 2: System.out.println("Enter amount to withdraw");
            	uamt=sc.nextFloat();
                bob.withdrawAmt(uamt);
                break;
            case 3: System.out.println("Terminated");
                System.exit(0);
                default: System.out.println("Invalid option");
            }
        }    
    }
}


