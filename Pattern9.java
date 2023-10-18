/*

	*      *
	**    **
	***  *** 
	********
	********
	***  ***
	**    **
	*      *
  Here input=5 for this pattern


*/
import java.util.Scanner;
class Pattern9{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m,n;
	System.out.print("Enter Row:");
	m=sc.nextInt();
	//loop for upperHalf
	for(int i=1;i<=m;i++){
	//loop for 1st-UpperHalf
		for(int j=1;j<=i;j++){
			System.out.print("*");
			}
		//loop for Space--->
		for(int j=2*(m-i);j>=1;j--){
			System.out.print(" ");
			}
		for(int j=1;j<=i;j++){
			System.out.print("*");
			}
		System.out.println();
	}
	//loop for lowerHalf
	for(int i=m;i>=1;i--){
	//loop for 1st-UpperHalf
		for(int j=1;j<=i;j++){
			System.out.print("*");
			}
		//space-->
		for(int j=2*(m-i);j>=1;j--){
			System.out.print(" ");
			}
		for(int j=1;j<=i;j++){
			System.out.print("*");
			}
		System.out.println();
	}

    }
}


