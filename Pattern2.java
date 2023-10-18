/*
		******
		*    *
		*    *
		******
	here in this pattern row=4 and column=6



*/


import java.util.Scanner;
class Pattern2{
	public static void main(String[] args){
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Row:");
	a=sc.nextInt();
	System.out.print("\nEnter Column:");
	b=sc.nextInt();
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=b;j++){
			if(i==1 || j==1 || i==a || j==b){ System.out.print("*");}else{System.out.print(" ");}
			}
			System.out.println();
			}
		}
	}
			
