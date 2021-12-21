package array;

public class ArrangeArray {
	 public static void arrange(int[] arr, int n) {
	        for(int i=0; i<n;i++)
	        {
	            arr[i] = i+1;
	        }
	    	for(int i=0; i<n; i++)
	        {
	            if(arr[i]%2!=0)
	                System.out.print(arr[i] +" ");
	        }
	        for(int i=0; i<n; i++)
	        {
	            if(arr[i]%2==0)
	                System.out.print(arr[i] + " ");
	        }
	    }

	public static void main(String[] args) {
		int n=10;
		int[] arr= new int[n];
		arrange(arr, n);

	}

}
