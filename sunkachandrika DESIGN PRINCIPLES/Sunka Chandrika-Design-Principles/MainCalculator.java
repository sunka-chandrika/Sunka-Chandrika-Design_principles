import java.util.*;
public class MainCalculator{
	
	public static int addition(int a,int b){
		return(a+b);
	}
	public static int subtraction(int a,int b){
		return(a-b);
	}
	public static int multiplication(int a,int b){
		return(a*b);
	}
	public static int division(int a,int b){
		return a/b;
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in); 
		MainCalculator calculator_obj=new MainCalculator();
		int a=scan.nextInt();
		char operator=scan.next().charAt(0);
		int b=scan.nextInt();
		if(operator=='+'){
			System.out.print("Addition of "+a+" and "+b +" is ");
			System.out.println(calculator_obj.addition(a,b));
		}
		if(operator=='-'){
			System.out.print("Subtraction of "+a+" and "+b +" is ");
			System.out.println(calculator_obj.subtraction(a,b));
		}
		if(operator=='*'){
			System.out.print("Multiplication of "+a+" and "+b +" is ");
			System.out.println(calculator_obj.multiplication(a,b));
		}
		if(operator=='/'){
			System.out.print("Division of "+a+" and "+b +" is ");
			System.out.println(calculator_obj.division(a,b));
		}
	}
}