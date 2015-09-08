///////////////////////////////////////////////////////////
// Eric McMillan
// hw02
// Arithmetic
// The goal of this program is the ake he values for multiple items, calculate tax on them
// and out put the various cost and tax information in an orderly way

public class Arithmetic {
    // class Arithmetic
    public static void main (String[] args) {
        //input variables
        //pairs of socks
        int nSocks=3;
        //cost per pair of socks
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        //calculated values variables
        //cost of socks
        double totalCostSocks$;
        //cost of glasses
        double totalCostGlasses$;
        //cost of envelopes
        double totalCostEnvelopes$;
        //tax of socks
        double taxSocks$;
        //tax of glasses
        double taxGlasses$;
        //tax of envelopes
        double taxEnvelopes$;
        //total tax
        double totalSalesTax$;
        //total cost (before tax)
        double totalCost;
        //total cost (after tax)
        double totalCostTaxed;
        
        //inform about socks
        System.out.println("When buying socks");
        System.out.println("You are buying "+nSocks);
        System.out.println("They cost "+sockCost$+ " each");
        System.out.println();
        //inform about glasses
        System.out.println("When buying glasses");
        System.out.println("You are buying "+nGlasses);
        System.out.println("They cost "+glassCost$+ " each");
        System.out.println();
        //inform about envelopes
        System.out.println("When buying envelopes");
        System.out.println("You are buying "+nEnvelopes);
        System.out.println("They cost "+envelopeCost$+ " each");
        System.out.println();
        
        //calculate cost for socks
        totalCostSocks$= nSocks * sockCost$;
        //cut down the decimal
        totalCostSocks$= totalCostSocks$ * 100;
        totalCostSocks$= (int) totalCostSocks$ / 100.0;
        
        //calculate cost for glasses
        totalCostGlasses$= nGlasses * glassCost$;
        //cut down the decimal
        totalCostGlasses$= totalCostGlasses$ * 100;
        totalCostGlasses$= (int) totalCostGlasses$ / 100.0;
        
        //calculate cost for envelopes
        totalCostEnvelopes$= nEnvelopes * envelopeCost$;
        //cut down the decimal
        totalCostEnvelopes$= totalCostEnvelopes$ * 100;
        totalCostEnvelopes$= (int) totalCostEnvelopes$ / 100.0;
        
        //calculate tax on socks
        taxSocks$=totalCostSocks$*taxPercent;
        taxSocks$= taxSocks$ * 100;
        taxSocks$= (int) taxSocks$ / 100.0;
        
        //calculate tax on glasses
        taxGlasses$=totalCostGlasses$*taxPercent;
        taxGlasses$= taxGlasses$ * 100;
        taxGlasses$= (int) taxGlasses$ / 100.0;
        
        //calculate tax on envelopes
        taxEnvelopes$=totalCostEnvelopes$*taxPercent;
        taxEnvelopes$= taxEnvelopes$ * 100;
        taxEnvelopes$= (int) taxEnvelopes$ / 100.0;
        
        //calculate total sales tax
        totalSalesTax$= taxSocks$ + taxGlasses$ + taxEnvelopes$;
        //calculate total cost before tax
        totalCost= totalCostSocks$ + totalCostGlasses$ + totalCostEnvelopes$;
        //calculate total cost after tax
        totalCostTaxed= totalSalesTax$ + totalCost;
        
        // output tax and total information
        System.out.println("The tax of socks is "+ taxSocks$);
        System.out.println("The total cost of socks is "+ totalCostSocks$);
        System.out.println();
        System.out.println("The tax of glasses is "+ taxGlasses$);
        System.out.println("The total cost of glasses is "+ totalCostGlasses$); 
        System.out.println();
        System.out.println("The tax of envelopes is "+ taxEnvelopes$);
        System.out.println("The total cost of envelopes is "+ totalCostEnvelopes$);
        System.out.println();
        System.out.println("The total sales tax is "+ totalSalesTax$);
        System.out.println("The total cost before tax "+ totalCost);
        System.out.println("The total cost with tax "+ totalCostTaxed);
        
        
    }
    
    
}