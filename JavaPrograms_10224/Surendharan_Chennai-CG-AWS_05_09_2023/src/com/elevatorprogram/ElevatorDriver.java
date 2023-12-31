package com.elevatorprogram;

import java.util.Scanner;

public class ElevatorDriver {    
    public static String choice() {
        Scanner sc = new Scanner(System.in);
        
        // Getting the choice of option from the user
        System.out.println("Options: (s)elect a floor, (f)ire alarm, (q)uit");
        System.out.print("Enter s, f, or q ==> ");
        String choice = sc.next().toLowerCase(); // Change the choice to lowercase
        return choice;
    }

    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        String choice = choice();
        
        while (!choice.equals("q")) { //Compare the choice till the choice is "q" to quit
            if (choice.equals("s")) {
                elevator.selectFloor();
            } else if (choice.equals("f")) {
                elevator.fireAlarm();
            } else {
                System.err.println("Invalid option");
            }
            
            choice = choice(); // Getting the next choice
        }
    }
}

