

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int numOfRows = sc.nextInt();
		numberPyramid(numOfRows);
        sc.close();
	}

    public static void numberPyramid(int numOfRows){
		int rowsCount = 1;
		for(int i=numOfRows;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rowsCount;j++) {
				System.out.print(rowsCount+" ");
			}
			System.out.println();
			rowsCount++;
		}
    }

}
