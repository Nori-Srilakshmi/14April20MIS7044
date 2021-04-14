package Assingment2;
import java.util.Scanner;
public class ques2 {
public static int fibonacciRecursion(int n) {
	if(n<=1) {
		return n;
	}
return fibonacciRecursion(n-2)+fibonacciRecursion(n-1);
	}
	public static void main (String []args) {
		Scanner sc =new Scanner(System.in);
		int maxNumber = sc.nextInt();
		System.out.print("Fibonacci Series of" +maxNumber+"numbers:");
		for(int i=0;i<maxNumber;i++) {
			System.out.print(fibonacciRecursion(i)+" ");
		}
	}
	
	}
// Time complexity of Fibonacci series is O(2^n)
// here n= 4
//Time complexity is O(2^4)=O(32)













