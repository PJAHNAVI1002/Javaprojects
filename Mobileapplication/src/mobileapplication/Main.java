package mobileapplication;

import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
        // Create an instance of the Mobile class
        Mobile myPhone = new Mobile(6, "Samsung", "Android");
        
        // Set the initial battery percentage
        System.out.print("Enter the initial battery percentage: ");
        myPhone.charge();
   
        
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Take a picture");
            System.out.println("2. Record a video");
            System.out.println("3. Play games");
            System.out.println("4. Charge the phone");
            System.out.println("5. Check battery percentage");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    myPhone.takePicture();
                    break;
                case 2:
                    myPhone.recordVideo();
                    break;
                case 3:
                    myPhone.playGames();
                    break;
                case 4:
                    myPhone.charge();
                    break;
                case 5:
                    System.out.println("Current battery percentage: " + myPhone.getBatterypercentage() + "%");
                    break;
                case 6:
                    System.out.println("Exiting...");
                 // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
		
		
	}


