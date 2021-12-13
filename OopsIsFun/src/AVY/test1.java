package AVY;



import java.util.*;
class test1{

static boolean canMake(int n, int ar[])
{
	
	if (n == 1)
		return true;
	else
	{

		if (ar[0] < ar[1])
		{

			int i = 1;
			while (i < n && ar[i - 1] < ar[i])
			{
				i++;
			}
			while (i + 1 < n && ar[i] > ar[i + 1])
			{
				i++;
			}

			if (i >= n - 1)
				return true;
			else
				return false;
		}

		else if (ar[0] > ar[1])
		{
			int i = 1;

			while (i < n && ar[i - 1] > ar[i])
			{
				i++;
			}

			while (i + 1 < n && ar[i] < ar[i + 1])
			{
				i++;
			}

			if (i >= n - 1)
				return true;
			else
				return false;
		}

		else
		{
			for (int i = 2; i < n; i++)
			{
				if (ar[i - 1] <= ar[i])
					return false;
			}
			return true;
		}
	}
}

public static void main(String[] args)
{

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
int[] arr = new int[n];
for(int i=0; i<n; i++)
{
	arr[i] = sc.nextInt();
}


	if (!canMake(n, arr)) {
		System.out.print("false");
	}
	else
	{
		System.out.print("true");
	}
}
}

