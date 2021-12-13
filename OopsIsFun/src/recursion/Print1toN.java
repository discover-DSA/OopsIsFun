package recursion;
import java.util.Scanner;
public class Print1toN {

	public static void printN(int n)
	{
		if(n==0)
		{
			return;
		}
		printN(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int r=sc.nextInt();
	printN(r);
	}

}
