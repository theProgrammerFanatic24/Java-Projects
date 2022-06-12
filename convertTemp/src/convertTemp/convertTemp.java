package convertTemp;
import java.util.*;
import java.io.*;
public class convertTemp {

	public static void main(String[] args) throws IOException {
		
		BufferedReader chosenTemp = new BufferedReader(new InputStreamReader(System.in));
		Scanner tempResult = new Scanner(System.in);
		
		double Celsius;
		double Farenheight;
		
		final double cFraction = 5.0/9.0;
		final double fFraction = 9.0/5.0;
		final int constant = 32;
		
		System.out.println("Please Enter a character f or F or c or C\n"+"Followed by a number");
		String choice = chosenTemp.readLine();
		double aNumber = tempResult.nextDouble();
		
		switch(choice) {
			case("f"):
			case("F"):
				Celsius = cFraction*(aNumber- constant);
				System.out.println("The Celsius is : "+Celsius);
				break;
			case("c"):
			case("C"):
				Farenheight = (fFraction*aNumber)+ constant;
				System.out.println("The Farenheight is : "+Farenheight);
				break;
			default:
				System.out.println("The Wrong Data has been entered");
		}
	}
}
