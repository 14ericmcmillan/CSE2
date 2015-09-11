/////////////////////////////////////
//Eric McMillan
//lab 03
//Check
//The goal of this program is to get input from the user and use that 
//to perform basic computations

//import the scanner class so it can be used in the program
import java.util.Scanner;

public class Check {
    // main method used for all programsin Java
    public static void main(String[] args) {
        //declare instance of scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for orginal cost of check
        System.out.print("Enter the original cost of the check in he form xx.xx: ");
        //accept user input
        double checkCost = myScanner.nextDouble();
        
        //prompt user for tip percentage
        System.out.print("Enter the percentage op that you wish to pay as a whole number (in the form xx): ");
        //accept user input
        double tipPercent = myScanner.nextDouble();
        //convert percentage to a decimal
        tipPercent /= 100;
        
        //prompt user for number of people
        System.out.print("Enter the number of people who went out to dinner: ");
        //accept input
        int numPeople = myScanner.nextInt();
        
        //declare variables for output
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies; // store whole ammount and digits to the right of decimal point
        
        //calculate total cost and cost per person
        totalCost = checkCost * (1+tipPercent);
        costPerPerson = totalCost / numPeople;
        //get whole amount dropping decimal fraction
        dollars= (int)costPerPerson;
        //get dimes and pennies amount using the remainder function (modulus %)
        dimes = (int) (costPerPerson * 10) % 10;
        pennies = (int) (costPerPerson*100) % 10;
        
        //output results
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
    }//end of method
}//end of class