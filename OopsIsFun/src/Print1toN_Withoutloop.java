
public class Print1toN_Withoutloop {
	
	 static  int curr = 0;
	 static void printNo(int r)
		{
			int  t = r;
			if(curr<t)
			{
				System.out.println(++curr);
				printNo(curr);
				System.out.println(curr);
				
			}
		}
	
	
public static void main(String[] args) {
		
		int n=10;
		printNo(n);
		
		
	
	


	}
}
	


