///////////////////////////////////////
//Eric McMillan
//9-15-15
//Timer
//The goal of this program is to take inputs for the current time and the time of 
//dinner and calculate the time in between in hours and minutes

//import the scanner class so it can be used in the program
import java.util.Scanner;

public class Timer {
    // main method used for all programsin Java
    public static void main(String[] args) {
        //declare needed variables
        int currentTime, hours, dinnerTime, minutes, currentTimeMinutes, dinnerTimeMinutes;
        //declare instnace of scanner
        Scanner myScanner = new Scanner(System.in);
        
        //input times
        System.out.println("(Please enter all values as HHMM)");
        System.out.print("What is the current time? ");
        currentTime = myScanner.nextInt();
        
        System.out.print("What is the time of dinner? ");
        dinnerTime = myScanner.nextInt();
        
        //save values for use later
        currentTimeMinutes = currentTime;
        dinnerTimeMinutes = dinnerTime;
        
        //remove minutes portion of time
        currentTime = currentTime / 100;
        dinnerTime = dinnerTime / 100;
        
        //calculate hours
        hours = dinnerTime - currentTime;

        // get hours in right format (HHMM)
        currentTime = currentTime * 100;
        dinnerTime = dinnerTime * 100;
        
        //isolate minutes
        currentTimeMinutes = currentTimeMinutes - currentTime;
        currentTimeMinutes = 60 - currentTimeMinutes;
        dinnerTimeMinutes = dinnerTimeMinutes - dinnerTime;
        minutes = currentTimeMinutes + dinnerTimeMinutes;
        
        //ensure minutes isnt larger than 60
        if (minutes >= 60) {
            minutes = minutes - 60;
        }//end of if
        
        System.out.println("Dinner is in " + hours + " hours and " + minutes + " minutes.");
        
    }//end of main method
}// end of class

        