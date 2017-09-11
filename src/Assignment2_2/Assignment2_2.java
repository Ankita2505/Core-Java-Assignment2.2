package Assignment2_2;
/*
 * program to print the following pattern:
    a
  a b a
a b c b a
  a b a
    a
 */
import java.util.Scanner; //importing Scanner Class
public class Assignment2_2 
{
	public static void main(String[] args) //Start Of Main Class
	{
		// TODO Auto-generated method stub
		int i,j,n,k=0,m,mid,inc=0,lit =97,lit1=0;
		Scanner sc=new Scanner(System.in);//creating objects of scanner class
		System.out.println("Enter value for pattern to print (it must be odd)");//user input for printing Pattern
		n=sc.nextInt();
		sc.close();
	    mid=(n+2)/2;k=mid;
		for(i=0;i<=mid;i++)
		{		  
		   for(j=0;j<k;j++)
			   System.out.print(" ");
		   inc=0;
		   for(m=k;m<=mid;m++)
			   {
			   lit1=lit+inc;
			     System.out.print((char)lit1);//Type Casting INT to Char
			     inc++;			     
			   }
		   inc--;
		   for(m=mid;m<mid+(mid-k);m++)
		   {
		     System.out.print((char)--lit1);  //Type Casting INT to Char
		   }
		   System.out.println(" ");k--;
		} 
		k++;
		for(i=mid+1;i<n+2;i++)
		{  k++;
		   for(j=0;j<k;j++)
			   System.out.print(" ");
		   inc=0;
		   for(m=k;m<=mid;m++)
			   {
			   lit1=lit+inc;
			     System.out.print((char)lit1); //Type Casting INT to Char
			     inc++;			     
			   }
		   inc--;
		   for(m=mid;m<mid+(mid-k);m++)
		   {
		     System.out.print((char)--lit1);//Type Casting INT to Char
		   }
		   System.out.println(" ");;
		} 
	}// Close Of Main Class
}
