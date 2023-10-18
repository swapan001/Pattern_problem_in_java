/*
	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15
	
Here input row,col=5  in this  pattern.
 
*/

import java.util.Scanner;
class Pattern7{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m,n;
	int num=1;
	System.out.print("Enter Row:");
	m=sc.nextInt();
	for(int i=1;i<=m;i++){
		for(int j=1;j<=i;j++){
			System.out.print(num+" ");
			num++;
			}
		System.out.println();
		}
	}
}
