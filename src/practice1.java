import java.util.Scanner;

public class practice1 {
	public static void main(String [] args)
	{
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your name: ");
	String name = sc.nextLine();
	System.out.println("Your name is: " +name);
	System.out.print("Enter your age: ");
	int age = sc.nextInt();
	System.out.println("Your age is: " +age);
	System.out.print("Enter your weight: ");
	double weight = sc.nextDouble();
	System.out.println("Your weight is: " +weight);
	
	@SuppressWarnings("unused")
	int [][] a;
	a = new int[][]{new int[] {5, 10, 3},
	new int[] { 25, 11, 13}};
	}
	
	public static long fact(int n) {
		if (n<=1)
			return 1;
		else
			return n * fact(n-1);
	}
	public static long Fib( int n ) {
		if ( n==1 )
		return 1;
		else if ( n==2 )
		return 1;
		else
		return Fib( n-1 ) + Fib( n-2 );
		}
	
	public static int countCharacter(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
		if (c == s.charAt(i)) {
		count++;
		}
		}
		return count;
		}
}
