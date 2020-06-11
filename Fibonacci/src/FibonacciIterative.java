
public class FibonacciIterative 
{
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
    	
    	startTime = System.nanoTime();
        System.out.print(number1);

        for(int i=1;i<total;++i)
        {
          
          sum = number1 + number2;
          System.out.print(" " + number2);
          number1 = number2;
          number2= sum;
        }
        endTime = System.nanoTime();
        System.out.println();
        System.out.println("Starting time in nanoseconds: " + startTime);
        System.out.println("Ending time in nanoseconds: " + endTime);
        runtime = System.nanoTime();
        runtime = (endTime - startTime);
        System.out.println("Total runtime in nanoseconds: " + runtime);
        
        return runtime;


    }
}
