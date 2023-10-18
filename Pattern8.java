/*
	1 
	0 1 
	1 0 1 
	0 1 0 1 
	1 0 1 0 1 
  Here inputed row or column= 5  for this pattern.
  

*/
import java.util.Scanner;
class Pattern8{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int m,n;
	System.out.print("Enter Row:");
	m=sc.nextInt();
	for(int i=1;i<=m;i++){
		for(int j=1;j<=i;j++){
			int sum=i+j;
			if(sum%2 == 0){
				System.out.print(1+" ");
			}else{System.out.print(0+" ");}
		}
		System.out.println();
	    }
    	}

}
