import java.util.Scanner;

public class t362 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		String arr [] = in.split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int [][] intArray = new int [n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(i == 0 || j ==0){
					intArray[i][j] = 1;
				}else {
					intArray[i][j] = intArray[i-1][j] + intArray[i][j-1];
				}
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}