import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sales tax rate: ");
        double taxRate = in.nextDouble(); 
        System.out.println("How many wood do you need: ");
        int numWood = in.nextInt();
        System.out.println("How many windows do you need: ");
        int numWindow = in.nextInt(); 

        Construction myConstruct = new Construction(8.0,11.0,taxRate);

        double totalCost = myConstruct.windowCost(numWindow) + myConstruct.lumberCost(numWood); 
        System.out.println("Total Cost: " + totalCost);

        double grandTotal = myConstruct.grandTotal(totalCost); 
        System.out.println("Grand Total: " + grandTotal);
    }
}
