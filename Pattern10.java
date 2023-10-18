/*
	    *****
	   *****
	  *****
	 *****
	*****
  Here input=5 for this pattern

*/
import java.util.Scanner;
class Pattern10{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m,n;
	System.out.print("Enter Row:");
	m=sc.nextInt();
	for(int i=1;i<=m;i++){
		for(int j=m-i;j>=1;j--){
			System.out.print(" ");
			}
		for(int j=1;j<=m;j++){
			System.out.print("*");
			}
		System.out.println();
		}
	}
}


