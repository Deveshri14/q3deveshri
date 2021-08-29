package exam;

import java.util.Scanner;

public class Exam2 {

		  public static void main(String[] args) {
		  
		  	int oldSalaryPerMonth;
		  	int hike;
		  
		  	Scanner in = new Scanner(System.in);
		  	
		  	System.out.println("Enter your old salary per month:");
		  	oldSalaryPerMonth = in.nextInt();
		  	
		  	System.out.println("Enter your hike percentage:");
		  	hike = in.nextInt();
		  	
		  	int presentSalaryPerMonth = oldSalaryPerMonth + (oldSalaryPerMonth * hike/100);
		  	
		  	
		  	System.out.println("After hike your present salary per month is: " + presentSalaryPerMonth );
		  }
		}

