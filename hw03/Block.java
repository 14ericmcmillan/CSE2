/////////////////////////////////////
//Eric McMillan
//9-15-15
//Block
//The goal of this prgram is to take inputs for the dimensions of a block and output
//those dimensions along with the volume and surface area for the block

import java.util.Scanner;

public class Block {
    // main method used for all programsin Java
    public static void main(String[] args) {
        //declare instance of scanner
        Scanner myScanner = new Scanner(System.in);
        
        //declare needed variables
        double length, width, height, volume, surfaceArea;
        
        System.out.print("Enter the length of the block: ");
        length = myScanner.nextDouble();
        
        System.out.print("Enter the width of the block: ");
        width = myScanner.nextDouble();
        
        System.out.print("Enter the height of the block: ");
        height = myScanner.nextDouble();
        
        volume = length * width * height;
        surfaceArea = (2 * length * width) + (2 * width * height) + (2 * length * height);
        
        System.out.println("The volume of the block with the dimensions " + length + " x " + width + " x " + height + " is " + volume);
        System.out.println("The surface area of the block is " + surfaceArea);
        
        
        
        
    }// end main method
}// end class