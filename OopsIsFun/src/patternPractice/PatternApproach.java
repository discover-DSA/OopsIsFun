package patternPractice;

public class PatternApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		pattern1(5);
		pattern2(5);
		pattern4(5);
		

	}
	//Pattern1
	static void pattern1(int n)
	{
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=n; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();System.out.println();System.out.println();
	}
	//Pattern1
	

	
	//Pattern2
	static void pattern2(int n)
	{
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//Pattern2
	
	//pattern4
	
	static void pattern4(int n)
	{
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}






























