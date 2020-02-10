package solid;
import java.lang.*;
import java.util.Scanner;
interface ICalculator {	
public double add();
public double sub();
public double mul();
public double div();
}
 class Calculator implements ICalculator{
	public double a;
	public double b;
    public double answer;

    public double add() 
	{
    	Scanner sc = new Scanner(System.in);
    	System.out.print("\nFirst Number: ");
        a = sc.nextDouble();
        System.out.print("\nSecond Number: ");
        b= sc.nextDouble();

		answer=a+b;
	    System.out.println("ICalculator - add " + a + " and " + b +"= " + answer);
	    return answer;
    }
    	 public double sub() {
    		 Scanner sc = new Scanner(System.in);
    	     System.out.print("\nFirst Number: ");
    	     a = sc.nextDouble();
    	     System.out.print("\nSecond Number: ");
    	     b= sc.nextDouble();
		     answer=a-b;
	         System.out.println("ICalculator - subtract " + a + " and " + b + "="+answer);
	         return answer;
			}

	public double mul() {
		Scanner sc = new Scanner(System.in);
    	System.out.print("\nFirst Number: ");
        a = sc.nextDouble();
        System.out.print("\nSecond Number: ");
        b= sc.nextDouble();
		answer=a*b;
	    System.out.println("ICalculator-multiply " + a + " and " + b + "=" +answer);
	    return answer;
	}
	public double div() {
		Scanner sc = new Scanner(System.in);
    	System.out.print("\nFirst Number: ");
        a = sc.nextDouble();
        System.out.print("\nSecond Number: ");
        b= sc.nextDouble();
		answer=a/b;
	    System.out.println("ICalculator-division " + a + " and " + b + "=" +answer);
	    return answer;
       
	}
     }
public class Task {
	public static void main(String[] args) {
	     Calculator cal = new Calculator();
	     Scanner kb = new Scanner(System.in);
	        System.out.println("\n1.Addition");
	        System.out.println("2.Subtraction");
	        System.out.println("3.Multiplication");
	        System.out.println("4.Division");
	        System.out.print("\nWhat would you like to do?:");
	        int choice = kb.nextInt();
	        if (choice == 1){
	            cal.add();
	        }
	        else if (choice == 2){
	            cal.sub();
	        }
	        else if (choice == 3){
	            cal.mul();
	        }
	        else if (choice == 4){
	        	try {
	            cal.div();
	        	}
	        	catch(ArithmeticException e)
	        	{
	        		System.out.println("no division");
	        }
}
}
}
