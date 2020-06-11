/**
 * 
 */

/**
 * @author NickS
 *
 */
public class FibonacciRecursion 
{
	

    private int total = 15;
    static long startTime;
    static long endTime;
    static long runtime;

    public long Recursion(int length) 
    {
    	total = length;
    	
    	
    	
    	startTime = System.nanoTime();
        endTime = System.nanoTime();
        
    	for(int i = 0; i < total; i++)
    	{
			System.out.print(fibonacciRecursion(i) +" ");
		}
        System.out.println();
        System.out.println("Starting time in nanoseconds: " + startTime);
        System.out.println("Ending time in nanoseconds: " + endTime);
        runtime = System.nanoTime();
        runtime = (endTime - startTime);
        System.out.println("Total runtime in nanoseconds: " + runtime);
        
        return runtime;


    }
	
    public static int fibonacciRecursion(int n) 
    {
    	if(n == 0)
    	{
    		return 0;
    	}
    	else if(n == 1 || n == 2)
    	{
    		return 1;
    	}
    		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
    
	/*
	 * private Loan[] loanMetaData = new Loan[5];
	 * 
	 * public static void main(String[] args) { CreateLoan loan = new CreateLoan();
	 * 
	 * loan.getLoanData(); loan.displayData();
	 * 
	 * // This section was a test of the scanner object
	 * 
	 * Scanner myObj = new Scanner(System.in); System.out.println("Enter username");
	 * String userName = myObj.nextLine(); System.out.println("Username is: " +
	 * userName); myObj.close();
	 * 
	 * 
	 * }
	 * 
	 * public void displayData() {
	 * System.out.println("Loan information displayed below:");
	 * 
	 * //I wish Java had an equivalent to .NET's foreach loop... for(int i = 0; i <
	 * loanMetaData.length; i++) { //Print out loan data
	 * System.out.println(loanMetaData[i].toString()); } }
	 * 
	 * public static Character getLoanType() { Scanner input = new
	 * Scanner(System.in); Character loanType;
	 * 
	 * System.out.println("Enter a loan type 'P' for personal or 'B' for business");
	 * 
	 * loanType = input.next().toUpperCase().charAt(0);
	 * 
	 * if (!((loanType.equals('P')) || (loanType.equals('B')))) { System.out.
	 * println("Error: Invalid input. Please enter either 'P' for personal or 'B' for business"
	 * ); System.exit(0); //input.close(); return loanType; } else {
	 * ////input.close(); return loanType; }
	 * 
	 * }
	 * 
	 * public static String getLoanNumber() { Scanner input = new
	 * Scanner(System.in); String loanNumber;
	 * 
	 * // Prompts the user to enter their loan number
	 * System.out.println("Please input loan number:"); loanNumber = input.next();
	 * //input.close(); return loanNumber; }
	 * 
	 * public static String getLastName() { Scanner input = new Scanner(System.in);
	 * String lastName; System.out.println("Enter customer last name:"); lastName =
	 * input.next();
	 * 
	 * //input.close(); return lastName; }
	 * 
	 * public static double getLoanAmount() { Scanner input = new
	 * Scanner(System.in); double loanAmount;
	 * 
	 * // Prompt the user to enter the loan amount. Check for values less than zero
	 * and greater than 50,000
	 * 
	 * System.out.println("Enter desired loan amount:"); loanAmount =
	 * input.nextDouble();
	 * 
	 * if (loanAmount <= 0 || loanAmount > 50000) { System.out.
	 * println("Error: Invalid input. Please enter a loan amount greater than 0 and less than 50,000"
	 * ); System.exit(0); //input.close(); return loanAmount; } //input.close();
	 * return loanAmount; }
	 * 
	 * public static double getPrimeRate() { Scanner input = new Scanner(System.in);
	 * double primeRate;
	 * 
	 * // Prompt the user to enter the prime interest rate System.out.
	 * println("Please enter the prime interest rate as a percentage without the % sign (i.e. 5 for 5%): "
	 * ); primeRate = input.nextDouble();
	 * 
	 * if (primeRate <= 0 || primeRate >= 100) { System.out.
	 * println("Error: Invalid input. Please enter a prime rate greater than 0 and less than 100"
	 * ); System.exit(0); //input.close(); return primeRate; } else {
	 * //input.close(); return primeRate; } }
	 * 
	 * public static int getTerm() { Scanner input = new Scanner(System.in); int
	 * term;
	 * 
	 * // Prompt the user for the term length. Default to 1 year if nothing coherent
	 * is selected. System.out.
	 * println("Enter the loan term. Enter 1 for 1 year (short term), 3 for 3 year (medium term), "
	 * + "or 5 for 5 years (long term)"); term = input.nextInt();
	 * 
	 * if (term == 1 || term == 3 || term == 5) { //input.close(); return term; }
	 * else { term = 1; //input.close(); return term; } }
	 * 
	 * 
	 * public void getLoanData() { Character loanType; String loanNumber; String
	 * lastName; double loanAmount; double primeRate; int term;
	 * 
	 * for (int x = 0; x < loanMetaData.length; x++) {
	 * System.out.println("Enter loan details for customer " + (x + 1) + "...");
	 * 
	 * loanType = getLoanType(); loanNumber = getLoanNumber(); lastName =
	 * getLastName(); loanAmount = getLoanAmount(); primeRate = getPrimeRate(); term
	 * = getTerm();
	 * 
	 * System.out.println();
	 * 
	 * // Store data into the array of type loanMetaData if (loanType.equals('P')) {
	 * loanMetaData[x] = new PersonalLoan(loanNumber, lastName, loanAmount, term,
	 * primeRate); } else if (loanType.equals('B')) { loanMetaData[x] = new
	 * BusinessLoan(loanNumber, lastName, loanAmount, term, primeRate); } } }
	 */
}
