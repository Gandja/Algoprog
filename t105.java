import java.util.Scanner;

public class t362 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstString = scanner.nextLine();
		String secondString = scanner.nextLine();
		if(compare(firstString,secondString)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}	
	}

	public static boolean compare(String s1, String s2) {
		int count = 0;
		for(int i = 0; i < s1.length(); i++){
			char first = s1.charAt(i);
			char second = s2.charAt(i);
			if(first == second){
				count++;
			}
		}
		return count == 0 ? false : true;
	}
}