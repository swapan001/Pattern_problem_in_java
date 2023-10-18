/*
	    1
	   212
	  32123
	 4321234
	543212345
Here input=5 for this pattern
*/
import java.util.Scanner;
class Pattern12{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m,n;
	System.out.print("Enter Row:");
	m=sc.nextInt();
	
	for(int i=1;i<m;i++){
		for(int j=1;j<m-i;j++){
			System.out.print(" ");
			}
		for(int j=i;j>=1;j--){
			System.out.print(j);
			}
		for(int j=2;j<=i;j++){
			System.out.print(j);
			}
		System.out.println();
		}
	}
}

