/*
	*
	**
	***
	****
	***
	**
	*
	   
where input=4
*/


import java.util.Scanner;
class Pattern3{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m;
	System.out.print("Enter Row:");
	m=sc.nextInt();

	
	for(int i=1;i<=m;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
			}
		System.out.println();
		}
		
	for(int i=m-1;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print("*");
			}
		System.out.println();
		}
		
	}
	
}
