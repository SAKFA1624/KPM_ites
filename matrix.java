import java.util.*;
class matrix {
	public static void main(String[] args) {
		// rows and column value deceleration 
		int m,n,m1,n1,choice;
		// scanner input for rows and columns
		System.out.println("Enter the no.of rows Matrix-A: ");
		Scanner s = new Scanner(System.in);
		m = s.nextInt();
		System.out.println("Enter the no.of coloumns Matrix-A: ");
		n = s.nextInt();
		System.out.println("Enter the no.of rows Matrix-B: ");
		m1 = s.nextInt();
		System.out.println("Enter the no.of coloumns Matrix-B: ");
		n1 = s.nextInt();
		// matrix initialization
		int mat_a[][] = new int[m][n];
		int mat_b[][] = new int[m1][n1];
		// getting values for the elements in the matrix
		System.out.println("Enter the no.of Elements in the matrix A :");
		for (int row=0; row<m; row++) {
			for (int colm=0; colm<n; colm++) {
				mat_a[row][colm] = s.nextInt();
				//System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Enter the no.of Elements in the matrix B :");
		for (int row=0; row<m1; row++) {
			for (int colm=0; colm<n1; colm++) {
				mat_b[row][colm] = s.nextInt();
				//System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		//switch what to do
		System.out.println("Enter the choice to do with the matrices :\n"
				+ "						1. Add\r\n"
				+ "						2. Subtract\r\n"
				+ "						3. Multiply\r\n"
				+ "						4. Inverse\r\n"
				+ "						5. Transpose");
		choice = s.nextInt();
		int row1 = m;
		int column1 = n;
		switch(choice) {
		case 1 :
			if (m==m1){
				int[][] sum = new int[row1][column1];

				for (int r = 0; r < row1; r++) {
					for (int c = 0; c < column1; c++) {
						sum[r][c] = mat_a[r][c] + mat_b[r][c];
					}
				}
				System.out.println("The Resultant matrix is :");
				for (int r=0; r<row1; r++) {
					for (int c=0; c<column1; c++) {
						System.out.print(sum[r][c] + " ");
					}
					System.out.println();
				}
				
			}
			else {
				System.out.println("Sorry But I didn't know that much of programming knowledge.");
			}
			break;
		case 2 :
			if (m==m1){
				int[][] diff = new int[row1][column1];

				for (int r = 0; r < row1; r++) {
					for (int c = 0; c < column1; c++) {
						diff[r][c] = mat_a[r][c] - mat_b[r][c];
					}
				}
				System.out.println("The Resultant matrix is :");
				for (int r=0; r<row1; r++) {
					for (int c=0; c<column1; c++) {
						System.out.print(diff[r][c] + " ");
					}
					System.out.println();
				}
			}
			else {
				System.out.println("Soon,by update the code.");
			}
			break;
		case 3 :
			if (m==m1){
				int[][] mult = new int[row1][column1];

				for (int r = 0; r < row1; r++) {
					for (int c = 0; c < column1; c++) {
						mult[r][c] = mat_a[r][c] - mat_b[r][c];
					}
				}
				System.out.println("The Resultant matrix is :");
				for (int r=0; r<row1; r++) {
					for (int c=0; c<column1; c++) {
						System.out.print(mult[r][c] + " ");
					}
					System.out.println();
				}
			}
			else {
				System.out.println("Soon,by update the code");
			}
			break;
		case 4 :
			System.out.println("Pretty Soon, this will be updated");
			break;
		case 5 :
			System.out.println("Still in developing progress");
			break;
		default :
			System.out.println("Sorry the entered choice is out of range, please refer the table: \n" + "1.Add\n" + "2.Subtract\n" + "3.Multiply\n" + "4.Inverse\n" + "5.Transpose\n");
		}
		// printing the existing matrices
		System.out.println(String.format("The Matrix A is %d x %d :", m,n));
		for (int row=0; row<m; row++) {
			for (int colm=0; colm<n; colm++) {
				System.out.print(mat_a[row][colm] + " ");
			}
			System.out.println();
		}
		System.out.println(String.format("The Matrix B is %d x %d :", m1,n1));
		for (int row=0; row<m1; row++) {
			for (int colm=0; colm<n1; colm++) {
				System.out.print(mat_b[row][colm] + " ");
			}
			System.out.println();
		}
		s.close();
	}
}
