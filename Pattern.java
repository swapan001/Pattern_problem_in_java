/*

		*
		**
		***
	where command line input(CLI)=3

*/

class Pattern{
 public static void main(String[] args){
	if(args.length<0){
		System.out.println(" underflow");
		}
	else{
		int n;
		n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
}
