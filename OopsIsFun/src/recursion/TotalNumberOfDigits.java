package recursion;
import java.util.Scanner;
public class TotalNumberOfDigits {
	static int count=0;
	static int countDigits(int n)
	{
		int t=0;
		if(n==0)
			return 0;
		else
		{
			t=n%10;
			count++;
			countDigits(n/10);
		}
		return count;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countDigits(n));
		

	}

}
