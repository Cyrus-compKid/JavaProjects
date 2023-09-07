//Cyrus McCormick
//PP 2. Page 94
//Here's a Java program that takes a value
//representing a number of seconds and prints the equivalent amount of time as a combination of hours, minutes, and seconds

import java.util.Scanner;

public class TimeConverter {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      //Prompt the user for their input
      System.out.print(" Enter the number of seconds: ");
      int totalSeconds = scanner.nextInt();
      
      //Calculate the hours, minutes and the remaining seconds
      int hours = totalSeconds / 3600;
      int remainingSeconds = totalSeconds % 3600;
      int minutes = remainingSeconds / 60;
      int seconds = remainingSeconds % 60;
   
      //Print the result here
      System.out.printf("%d seconds is equivalent to %d hours, %d minutes, and %d seconds%n" , totalSeconds, hours, minutes, seconds);
      
      //Close the scanner
      scanner.close();
    }
} 
     