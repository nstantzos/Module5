package application;


public class FibonacciIterative 
{
	// Define variables
	private int number1 = 0;
    private int number2 = 1;
    private int sum;
    private int total = 15;
    static long startTime;
    static long endTime;
    static long runtime;

    public long Iteration(int length) 
    {
    	total = length;
    	
    	// Check fibonacci length, exit program if length is too short
    	if (length < 1) 
    	{
    		System.out.println("Error. Specify a length greater than 0.");
    		System.exit(0);
    		return runtime;
    	}
    	else
    	{
        	System.out.println("Iterative method:");
        	
        	// Get start time in nanoseconds
        	startTime = System.nanoTime();
        	
        	// Print initial fibonacci series value to console
            System.out.print(number1);

            for(int i=1;i<total;++i)
            {
              // Print fibonacci series values to console
              sum = number1 + number2;
              System.out.print(" " + number2);
              number1 = number2;
              number2= sum;
            }
            
            // Get end time in nanoseconds
            endTime = System.nanoTime();
            System.out.println();
            //System.out.println("Starting time in nanoseconds: " + startTime);
            //System.out.println("Ending time in nanoseconds: " + endTime);
            
            // Calculate total run time
            runtime = System.nanoTime();
            runtime = (endTime - startTime);
            System.out.println("Total runtime in nanoseconds: " + runtime);
            System.out.println();
            
            return runtime;	
    	}



    }
}
