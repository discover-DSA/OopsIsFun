package AVY;

import java.util.Scanner;
public class test {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  int p = 65;
        for(int i=1; i<=n; i++)
        {
        	
        
            for(int j=1; j<=i; j++)
            {
               
                System.out.print((char)(65+i-1));
                
                
                
               
            }
            System.out.println();
        }

		
	}
}

