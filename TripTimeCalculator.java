//Cyrus McCormick
//PP 2.7 Page 94
//Write a program that prompts for and reads integervalues for speed and distance traveled, 
//then prints the timerequired for the trip as a floating point result.

import java.util.Scanner;

public class TripTimeCalculator {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   
   //Prompt the user for their input
   System.out.print(" Enter the speed (in miles per hour): ");
   int speed = scanner.nextInt();
   
   System.out.print(" Distance traveled (in miles): ");
   int distance = scanner.nextInt();
   
   //Calculate the time that was required for the trip
   double time = (double) distance / speed;
   
   //Print the results here
   System.out.printf("The time required for the trip is %.2f hours%n", time);
   
   //Close the scanner
   scanner.close();
   
  }
}
   

