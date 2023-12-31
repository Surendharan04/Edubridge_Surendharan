package com.edu;

abstract class Bank{
abstract  float rateOfInterest();

void calCompound() {
	System.out.println("Compount Interest");
}
}

class HdfcBank extends Bank{
      float rateOfInterest(){
             return 6.3f;
      }
}

class SbiBank extends Bank{
      float rateOfInterest(){
             return 7.5f;
      }
}

class CitiBank extends Bank{
      float rateOfInterest(){
             return 8f;
      }
}

public class RateOfInterest{
        public static void main(String args[]){
        	Bank bob;
        	
        	/*HdfcBank hdfc = new HdfcBank();
        	SbiBank sbi = new SbiBank();
        	CitiBank citi = new CitiBank();*/
        	
        	bob = new HdfcBank();
        	System.out.println("Rate of Interest of HDFC: " + bob.rateOfInterest());
        	bob = new SbiBank();
        	System.out.println("Rate of Interest of SBI: " + bob.rateOfInterest());
        	bob = new CitiBank();
        	System.out.println("Rate of Interest of CITI: " + bob.rateOfInterest());
        }
}
