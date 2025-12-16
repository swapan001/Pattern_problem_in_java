/*

	Spiral Pattern
	
	n=3
	1   2   3
	8   9   4
	7   6   5
	
	n=4
	
	1 ->  2 ->  3 ->  4
			   !
	12 -> 13 -> 14    5
	 ^	     	   !
	11    16 <- 15    6
	 ^	           !
	10 <- 9  <- 8  <- 7
	
	
	see the printing flow of pattern like spiral
	
	1 -> 2 -> 3
		  !
	8 -> 9    4
	^	  !
	7 <- 6 <- 5
	

*/



class PatternSpiral{

	private static int [][] patternSpiral(int n){
	
		int top=0;
		int bottom=n-1;
		int left=0;
		int right=n-1;
		int  num=1;
		int matrix[][]=new int [n][n];
		
		while(num <= n*n){
			
			/* for left --> right */
			for(int i=left;i<=right;i++){
				matrix[top][i]=num++;
			}
			top++;
			
			/* for top --> bottom */
			
			for(int i=top;i <= bottom;i++){
				matrix[i][right]=num++;	
			}
			right--;
			
			/* for right --> left */
			
			if(top <= bottom){
				for(int i=right;i >= left;i--){
					matrix[bottom][i]=num++;
				}
				bottom--;
			}
			
			/* for bottom --> top */
			
			if(left <= right){
				for(int i=bottom;i >= top;i--){
					matrix[i][left]=num++;
				}
			}
			
			left++;
		}
		return matrix;
	
	}
	
	
	public static void main(String [] args){
	
		/* Declare a variable and initialize a value as 0 */
		int n=0;
		
		/* Taking the input from Command Line Argument */
		if(args != null){
			n=Integer.parseInt(args[0]); 
		}
		
		int matrix[][]=patternSpiral(n);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
