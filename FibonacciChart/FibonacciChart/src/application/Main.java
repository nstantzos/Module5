/*
 * Program created by Nick Stantzos on June 6, 2020.
 * This program will output Fibonacci values to the console obtained by two different approaches:
 * one using a recursive algorithm, the other using an iterative algorithm. A bar chart is also 
 * produced that compares the runtime of each method. The user can specify which algorithm to 
 * implement (or both) and specify how many values of the series they would like to see (up to 
 * a predetermined limit). This program uses JavaFX.
 * 
 * 
*/
package application;
	

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;


public class Main extends Application 
{
	// Define global run time variables
	public static long recursionRunTime = 0;
	public static long iterationRunTime = 0;
	
	
	@Override
	public void start(Stage primaryStage) 
	{
		// Load stage and set name
		primaryStage.setTitle("Algorithm Run Times in nanoseconds");

		// Create axes
	    CategoryAxis xAxis    = new CategoryAxis();
	    xAxis.setLabel("Algorithms");
	    NumberAxis yAxis = new NumberAxis();
	    yAxis.setLabel("Nanoseconds");

	    // Add axes to bar chart
	    BarChart barChart = new BarChart(xAxis, yAxis);

	    // Create Series object for data to be loaded into
	    XYChart.Series algorithmData = new XYChart.Series();

	    algorithmData.getData().add(new XYChart.Data("Recurison", recursionRunTime));
	    algorithmData.getData().add(new XYChart.Data("Iteration"  ,iterationRunTime));
	    //dataSeries1.getData().add(new XYChart.Data("Tablet"  , 23));

	    // Add data to chart
	    barChart.getData().add(algorithmData);
	    
	    // Organize children into vertical line
	    VBox verticalBox = new VBox(barChart);

	    // Add vertical box to scene
	    Scene scene = new Scene(verticalBox, 400, 200);

	    // Add scene to stage
	    primaryStage.setScene(scene);
	    primaryStage.setHeight(300);
	    primaryStage.setWidth(1200);

	    // Show stage
	    primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		// Call method to get user input and run algorithms
		AlgorithmDecider();

		System.out.println("Please see the bar chart for a graphical view of the results.");
		
	    // Open bar chart with results
		launch(args);
	}

	// Method to get user input and use it to decide which algorithm(s) to run
	private static void AlgorithmDecider() 
	{
		try 
		{
			// Prompt user for input
			System.out.println("Select the method of algorithm you want to run. Default runs both.");
			System.out.println("Type 'R' for recursive, 'I' for iterative, or any other key for default.");
			System.out.println("Note: selecting either recursive or iterative will not allow for any runtime "
					+ "comparisons between the two algorithms. The default option is the only way to produce "
					+ "these results.");
			
			// Create scanner to get input from user
			Scanner userInput = new Scanner(System.in);  // Create a Scanner object

			// Read in input
		    String consoleText = userInput.nextLine().toUpperCase();
			System.out.println("Enter the number of entries (fewer than 30) that you want in the fibonacci series:");
			Scanner fibonacciQuantity = new Scanner(System.in);
			
			// Store fibonacci series length
			int fibonacciQuantityInt = Integer.parseInt(fibonacciQuantity.nextLine());
			
			// Repeat back to user what they entered
		    System.out.println("User entered:\n" + consoleText +"\n" + fibonacciQuantityInt);  // Output user input
		    System.out.println();
		    
		    // Check to see if maximum fibonacci length was exceeded
		    if (fibonacciQuantityInt > 30) 
		    {
		    	System.out.println("Error. User requested too many fibonacci entries.");
		    	System.exit(0);
		    }
		    userInput.close();
		    fibonacciQuantity.close();
		    
		    // Switch statement to determine which algorithm to employ
		    switch(consoleText) 
		    {
		    case "R":
		    	// Do recursive method
		    	
		    	// Create new recursive object, call a method within that object
				FibonacciRecursion myRecursion = new FibonacciRecursion();
				recursionRunTime = myRecursion.Recursion(fibonacciQuantityInt);
		    	break;
		    	
		    case "I":
		    	// Do iterative method
		    	
		    	// Create new iterative obejct, call a method within that object
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
		}
		catch (Exception e) 
		{
			System.out.println("Error with input. Please enter a value for the number of entries you want "
					+ "displayed in the fibonacci series");
		}
	}
}






