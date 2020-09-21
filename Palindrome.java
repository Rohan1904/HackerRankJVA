import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        int i=0,j=A.length()-1;
	        int flag=1;
	        while(i<j) {
	        	if(A.charAt(i)!=A.charAt(j)) {
	        		flag=0;
	        		break;
	        	}        	
	        	i++;
	        	j--;
	        }
	        if(flag==0) {
	        	System.out.println("No");
	        }
	        else
	        	System.out.println("Yes");
	}

}
