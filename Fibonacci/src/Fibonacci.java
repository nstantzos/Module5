/**
 * 
 */
import java.util.Scanner;
import java.io.*;
/**
 * @author NickS
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		long recursionRunTime = 0;
		long iterationRunTime = 0;
		
		System.out.println("Hello world!");
		System.out.println("Select the method of algorithm you want to run. Default runs both.");
		System.out.println("Type 'R' for recursive, 'I' for iterative, or any other key for default.");
		System.out.println("Note: selecting either recursive or iterative will not allow for any runtime "
				+ "comparisons between the two algorithms. The default option is the only way to produce "
				+ "these results.");
		Scanner userInput = new Scanner(System.in);  // Create a Scanner object

	    String consoleText = userInput.nextLine().toUpperCase();  // Read user input
		System.out.println("Enter the number of entries that you want in the fibonacci series:");
		Scanner fibonacciQuantity = new Scanner(System.in);
		int fibonacciQuantityInt = Integer.parseInt(fibonacciQuantity.nextLine());
		

	    System.out.println("User entered:\n" + consoleText +"\n" + fibonacciQuantityInt);  // Output user input
	    
	    userInput.close();
	    fibonacciQuantity.close();
	    
	    switch(consoleText) 
	    {
	    case "R":
			FibonacciRecursion myRecursion = new FibonacciRecursion();
			recursionRunTime = myRecursion.Recursion(fibonacciQuantityInt);
	    	break;
	    	
	    case "I":
	    	// Do iterative method
	    	FibonacciIterative myIteration = new FibonacciIterative();
	    	iterationRunTime = myIteration.Iteration(fibonacciQuantityInt);
	    	break;
	    	
	    default:
	    	// Do both methods and compare
	    	
	    	// Do iterative method
	    	FibonacciIterative bothIteration = new FibonacciIterative();
	    	iterationRunTime = bothIteration.Iteration(fibonacciQuantityInt);
	    	// Do recursive method
			FibonacciRecursion bothRecursion = new FibonacciRecursion();
			recursionRunTime = bothRecursion.Recursion(fibonacciQuantityInt);
	    	break;
	    }
	    	    
	    try 
	    {
		    PrintCsv(iterationRunTime, recursionRunTime);
	    }
	    catch(Exception e) 
	    {
	    	System.out.println("Exception: Error with output file");
	    }
	    
	    System.out.println("Exiting the program");

	}
	
	public static void PrintCsv(long iterationRuntime, long recursionRuntime) throws IOException
	{
	    BufferedWriter writer = new BufferedWriter(new FileWriter("RuntimeReport.csv"));
	    writer.write("");	     
	    writer.close();
		
	}

}
