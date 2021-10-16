import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int numOfRows = sc.nextInt();
	//	numberPyramid(numOfRows);
		pattern2(numOfRows);
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

	public static void pattern2(int num){
		int count =1;
		for(int i=num;i>0;i--){
			for(int j=i;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=count;j++){
				System.out.print("*");
			}
			System.out.println();
			count++;
		}
	}

}
