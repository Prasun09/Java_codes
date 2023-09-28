package assignment6;
import java.util.Scanner;
public class twisted_prime {
	public static boolean isPrime(int a) {
		boolean b=true;
		for(int i=2;i<a;i++) {
			if(a%i==0){
				b=false;break;
			}
		}
		return b;
	}
	public static int reverse(int a) {
		
		int sum=0;
		while(a!=0) {
			int r=a%10;
			sum=sum*10+r;
			a=a/10;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a number ");
	
		int a=sc.nextInt();
		int a1=reverse(a);
		if(isPrime(a)&&isPrime(a1)) 
			System.out.println("Twisted prime");
			else
				System.out.println("chup");
					
				
	
		}
		
		
	
}
