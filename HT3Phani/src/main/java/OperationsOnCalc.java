import ht3.Calc;
import java.util.*;
public class OperationsOnCalc{
	public static void main(String args[])
	{
		Calc c = new Calc();
		int a,b,res=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("CALCULATOR APPLICATION");
		System.out.println("Options:");
		System.out.println("Type '+' for Addition");
		System.out.println("Type '-' for Subtraction");
		System.out.println("Type '*' for Multiplication");
		System.out.println("Type '/' for Division");
		System.out.println("Type 'p' for Power");
		System.out.println("Type 'x' for Exit");
		
		System.out.print("Enter your option:");
		char ch = sc.next().charAt(0);

		while(ch != 'x'){
			System.out.print("Number 1:");
			a = sc.nextInt();
			System.out.print("Number 2:");
			b = sc.nextInt();

			switch(ch){
				case '+':{
					res = c.add(a,b);
					break;
				}

				case '-':{
					res = c.sub(a,b);
					break;
				}

				case '*':{
					res = c.mul(a,b);
					break;
				}

				case '/':{
					res = c.div(a,b);
					break;
				}
				
				case 'p':{
					res=c.pow(a, b);
					break;
				}
			}
			System.out.println("Result is: " + res);
			System.out.println("Enter your option again:");
			ch = sc.next().charAt(0);
		}
		sc.close();

	}
}