////////////////////////////////////
//Eric McMillan
//labo2
//Cyclometer

//This program will take the time of a bicycle trip and the rotation count of the tires
//to output that information and the total distance

//
public class Cyclometer{
        //Main method
        public static void main (String[] args) {
            // input data
            int secsTrip1=480; //time of trip one
            int secsTrip2=3220; // time of trip two
            int countsTrip1=1561; //rotation count of trip one
            int countsTrip2=9037; //rotation count of trip two
            
            // constants and intermediate variables
            double wheelDiameter=27.0, // diameter of the wheel, used to calculate distance
            PI = 3.14159, //value of pi, used to calculate distance
            feetPerMile=5280, //value used to convert to miles
            inchesPerFoot=12, //value used to convert to miles
            secondsPerMinute=60; //value used to convert time of trips
            double distanceTrip1, distanceTrip2, totalDistance; // Variables for placing the final results of the distance calculations
            
            //output stored information
            System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
            System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
            
            //run calculations
            distanceTrip1=countsTrip1*wheelDiameter*PI; // calculates the distance in inches based on circumference of wheel
            distanceTrip1/=inchesPerFoot*feetPerMile; //converts distance to miles
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;// same operations as above but for trip2
            totalDistance=distanceTrip1+distanceTrip2;
            
            // Print out the output data
            System.out.println("Trip 1 was "+distanceTrip1+" miles");
            System.out.println("Trip 2 was "+distanceTrip2+" miles");
            System.out.println("The total distance was "+totalDistance+" miles");
            
            
            
        } // end of main method
} // end of class