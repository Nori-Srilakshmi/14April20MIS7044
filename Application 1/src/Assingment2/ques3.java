package Assingment2;
import java.util.Scanner;
public class ques3 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter which Table :");
		int n= sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x "+i+" = "+(n*i));
		}
	}
}
		
//Time complexity of multiples is O(n)
// here n= 10
//time complexity is O(10) 
	


