import java.util.Scanner;
class ZeroMatrix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter dimensions m and n");
		m=sc.nextInt();
		n=sc.nextInt();
		int matrix[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j]==0){
					matrix=setToZero(matrix, i, j);
				}
			}
		}
		System.out.println(m+","+n);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	static int[][] setToZero(int matrix[][], int m, int n){
		System.out.println(matrix[m].length+"dcd");
		for(int j=0;j<matrix[m].length;j++){
			System.out.println(matrix[m][j]+" row me ");
			matrix[m][j]=0;
		}
		for(int i=0;i<matrix.length;i++){
			System.out.println(matrix[i][n]+" column me ");
			matrix[i][n]=0;
		}
	return matrix;
	}
}