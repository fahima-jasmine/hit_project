package basic;
import java.util.Scanner;
import java.text.NumberFormat; 
public class Salary {
	public static void main (String[] args) 
	{  double currentSalary; 
	double raise=0;
	double newSalary;  
	String rating; 
	Scanner scan = new Scanner(System.in); 
	System.out.print ("Enter the current salary: "); 
	currentSalary = scan.nextDouble(); 
	System.out.print ("Enter the performance rating (Excellent, Good, or Poor): "); 
	rating = scan.nextLine();  
	newSalary = currentSalary + raise;  
	NumberFormat money = NumberFormat.getCurrencyInstance(); 
	System.out.println(); 
	System.out.println("Current Salary: " + money.format(currentSalary)); 
	System.out.println("Amount of your raise: " + money.format(raise));
	System.out.println("Your new salary: " + money.format(newSalary)); 
	System.out.println();
	scan.close();
	}
}
