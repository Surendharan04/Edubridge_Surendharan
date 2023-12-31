package com.elevatorprogram;

import java.util.Scanner;

public class Elevator {
    int currentFloor = 1;

    private void floorUp(int floorSelection) {
        System.out.print("Going up..");
        for (int i = currentFloor+1; i <= floorSelection; i++) {
            System.out.print(i + "..");
            currentFloor = floorSelection; // Update the current floor
        }
    }

    private void floorDown(int floorSelection) {
        System.out.print("Going down..");
        for (int i = currentFloor-1; i >= floorSelection; i--) {
            System.out.print(i + "..");
            currentFloor = floorSelection; // Update the current floor
        }
    }

    // Method for floor selection
    public void selectFloor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the floor that you'd like to go to ==> ");
        int floorSelection = sc.nextInt();

        if (floorSelection >= 1 && floorSelection <= 10) {
            if (floorSelection > currentFloor) {
                floorUp(floorSelection);	//Increase the floor	
            } else if (floorSelection < currentFloor) {
                floorDown(floorSelection);	//Decrease the floor
            }
            System.out.println("Ding! \n");
        } else {
            // Error if the user enters an invalid floor
            System.err.println("Invalid floor entry");
        }
    }

    // Method for fire alarm
    public void fireAlarm() {
        System.out.println("Danger! You must exit the building now \n");
        currentFloor = 1;
    }
}
