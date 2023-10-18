/*
	12345
	1234
	123
	12
	1
	
  where input=5
  N.B: both logic is correct you can use the comments logic also



*/

import java.util.Scanner;
class Pattern6{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m,n;
	System.out.print("Enter Row:");
	m=sc.nextInt();
	
	
	for(int i=m;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print(j);
			}
		System.out.println();
		}
	
	/*
	
	for(int i=1;i<=m;i++){
		for(int j=1;j<=m-i+1;j++){
			System.out.print(j+" ");
			}
		System.out.println();
		}
	
	*/
	}
}
    
