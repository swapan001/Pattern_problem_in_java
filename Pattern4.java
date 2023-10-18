/*
	    *
	   **
	  ***
	 ****
	where input = 4
*/
import java.util.Scanner;
class Pattern4{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m,n;
	System.out.print("Enter Row:");
	m=sc.nextInt();
	
	for(int i=1;i<=m;i++){
		for(int j=m-i; j>=1; j--){
			System.out.print(" ");
			}
		for(int j=1;j<=i;j++){
			System.out.print("*");
			}
		System.out.println();
		}
	
	}	
}
