package oops_skill;
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
	System.out.println("Enter n: ");
	int n = sc.nextInt();
	int temp=n;
	int rev=0;
while(n!=0) {
	int rem = n%10;
	rev=rev*10+rem;
	n=n/10;
}
if (temp==rev) {
	System.out.println("Palindrome");
} else {
	System.out.println("Not a Palindrome");
}
sc.close();

}
}
