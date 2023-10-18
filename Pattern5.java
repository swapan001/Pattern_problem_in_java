/*
	1
	12
	123
	1234
	12345
	where input=5
*/
import java.util.Scanner;
class Pattern5{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m;
	System.out.print("Enter Row:");
	m=sc.nextInt();
	
	for(int i=1;i<=m;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+" ");
			}
		System.out.println();
		}
	}
}

