/*
 *Intisar Ratul
 *Calculate Area of Square
 *3/15/2022
 */
package squarearea;
import java.io.*;
import java.util.Scanner;


//Import a library

public class Squarearea {
	
	    static void intro1()throws IOException { 
	  
	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String inputString;
		System.out.println("Hello, input your name please: ");
		inputString = input.readLine();
		System.out.println("Hello " + inputString);
	    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		intro1();
		Scanner enterside=new Scanner(System.in);
		System.out.println("Welcome to our area calculator.");
		System.out.println("Here you may calculate the area of a square!");
		System.out.println("Please enter the length of 1 side of the square");
		double squareSide=enterside.nextDouble();
		double squareArea=squareSide*squareSide;
		System.out.println("Thank You, the area of the square that you are requesting is : ");
		System.out.println(squareArea);
		System.out.println("Bye");

			// TODO Auto-generated method stub
			
			Scanner data=new Scanner(System.in);
			System.out.println("Welcome to our area calculator.");
			System.out.println("Here you may calculate the area of a Rectangle!");
			
			
			System.out.print("Please enter the length of the rectangle, Length: ");
			System.out.println();
			double rectLength=data.nextDouble();
			System.out.print("Please enter the width of the rectangle, Width: ");
			System.out.println();
			double rectWidth=data.nextDouble();
			
			double rectArea=rectLength*rectWidth;
			
			System.out.println("Thank You, the area of the Rectangle that you are requesting is : ");
			System.out.println(rectArea);
			System.out.println("Bye");
	}
}

