/*

          1 
         2 2 
        3 3 3 
       4 4 4 4 
      5 5 5 5 5 
     6 6 6 6 6 6 
    7 7 7 7 7 7 7 
   8 8 8 8 8 8 8 8 
  9 9 9 9 9 9 9 9 9 
 Hint: input=9
*/
import java.util.Scanner;
class Pattern11{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m,n;
	System.out.print("Enter Row:");
	m=sc.nextInt();

	for(int i=1;i<=m;i++){
		for(int j=m-i;j>=1;j--){
			System.out.print(" ");
			}
		for(int j=1;j<=i;j++){
			System.out.print(i+" ");
			}
		System.out.println();
		}
	}
}

