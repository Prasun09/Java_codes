package assignment6;
import java.util.Scanner;
public class amicable_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter first number ");
   int a=sc.nextInt();
   System.out.println("Enter second number ");
   int b=sc.nextInt();
   int suma=0;int sumb=0;
   for(int i=1;i<=a/2;i++)
	   if(a%i==0)
		   suma+=i;
   for(int j=1;j<=b/2;j++)
	   if(b%j==0)
		   sumb+=j;
   if(suma==b&&sumb==a)
	   System.out.println("Amicable number");
   else
	   System.out.println("Not a Amicable number");
	   
   
	}

}
