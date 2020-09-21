import java.text.NumberFormat;
import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 double payment = sc.nextDouble();
		 	NumberFormat us=NumberFormat.getInstance(Locale.US);
			NumberFormat india=NumberFormat.getInstance(new Locale("en", "IN"));
			String s=india.format(payment);
			NumberFormat china=NumberFormat.getInstance(Locale.US);
			NumberFormat france=NumberFormat.getInstance(Locale.US);
			Currency cur= Currency.getInstance(Locale.CHINA);
			StringBuilder ss=new StringBuilder(cur.getSymbol());
			System.out.println(ss);
	        System.out.println("US: $" + us.format(payment));
	        System.out.println("India: Rs." + s);
	        System.out.println("China: " +ss.charAt(2)+ china.format(payment));
	        System.out.println("France: " + france.format(payment)+"  €");
	       
	}

}
