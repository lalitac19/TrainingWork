package com.qa.Results;

/**
 * Hello world!
 *
 */
public class App 
{
	static int  physics, chemsity, biology, total, percentage; 
	
    public static void main( String[] args )
    {
        displayResults(54, 90, 102);
        displayAverage(78, 90, 130);
        System.out.println(Passed());
    }
    //exercise 1a
    public static int displayResults(int p, int c, int b) {
    	total = p + c + b; 
    	System.out.println( "Result for Biology exam: " + b + "/150");
    	System.out.println( "Result for Physics exam: " + p + "/150");
    	System.out.println( "Result for Chemistry exam: " + c + "/150");
    	System.out.println( "Result for total from all exams: " + total + "/450");
    	return total;
    }
    
    //exercise 1b
    public static int displayAverage(int p, int c, int b) {
    	percentage = ((p + c + b) * 100) /450;
    	System.out.println( "Percentage overall for all exams: " + percentage + "%");
    	return percentage; 
    }
    //exercise 2
    public static String Passed() {
    	if (percentage >= 60) {
    		return "WELL DONE YOU PASSED!";
    	} else {
    		return "Sorry, you failed";
    	}
    	
    }
}
