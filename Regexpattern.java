import java.util.Scanner;
import java.util.regex.Pattern;

public class Regexpattern {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while(testCases>0){
			String pattern = in.next();
          	//Write your code
			Pattern.compile(pattern);
			System.out.println("valid");
			
		}
		
		
		testCases--;
	}

}
