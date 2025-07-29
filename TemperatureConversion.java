package oops_skill;
import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Farenheit: ");
		int f = sc.nextInt();
		int c = (f-32) * 5 / 9;
		System.out.println("Temperature in Celsius: " + c);
		sc.close();
		
		
		
		
	}

}
