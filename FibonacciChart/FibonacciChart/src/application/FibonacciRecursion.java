package application;

/**
 * 
 */

/**
 * @author NickS
 *
 */
public class FibonacciRecursion 
{
	// Define variables
    private int total = 15;
    static long startTime;
    static long endTime;
    static long runtime;

    public long Recursion(int length) 
    {
    	// Error checking
    	if (length < 1) 
    	{
    		System.out.println("Error. Specify a length greater than 0.");
    		System.exit(0);
    		return runtime;
    	}
    	else
    	{
        	total = length;
        	
        	System.out.println("Recursive method:");
        	
        	// Get start time in nanoseconds
        	startTime = System.nanoTime();
            
        	for(int i = 0; i < total; i++)
        	{
        		// Print fibonacci values to console
    			System.out.print(fibonacciRecursion(i) +" ");
    		}
        	// Get end time in nanoseconds
            endTime = System.nanoTime();
            System.out.println();
            //System.out.println("Starting time in nanoseconds: " + startTime);
            //System.out.println("Ending time in nanoseconds: " + endTime);
            
            // Calculate total run time
            runtime = System.nanoTime();
            runtime = (endTime - startTime);
            
            // Output runtime
            System.out.println("Total runtime in nanoseconds: " + runtime);
            System.out.println();
            
            return runtime;
    	}



    }
	
    // Recursive method to calculate fibonacci values. Recursion happens in the return statement.
    public static int fibonacciRecursion(int n) 
    {
    	// Check to see if the algorithm is on the first or second value in the series. Use hard-coded values in this case
    	if(n == 0)
    	{
    		return 0;
    	}
    	else if(n == 1 || n == 2)
    	{
    		return 1;
    	}
    	
    	// Recursively call method again
    	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
}

