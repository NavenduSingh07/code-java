import java.util.Scanner;
public class PrimeM {
//write a method for user entered number is prime or not
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n =sc.nextInt();
		boolean rs= isPrime(n);
		if(rs == true)
			System.out.println("Prime");
		else
			System.out.println("not a Prime");

	}
	static boolean isPrime(int x) {
		int count=0;
		for(int i= 2; i<=x/2; i++) {
			if(x % i == 0)
				return false;
		}
		return true;
	}

}
