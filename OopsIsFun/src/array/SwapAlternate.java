package array;

public class SwapAlternate {
	static void swap1(int[] arr) {
		int i=0;
		int temp;
		while(i<arr.length-1) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1] = temp;
			i=i+2;		
		}
		int t=0;
		while(t<arr.length)
		{
			System.out.print(arr[t] + "  ");
			t++;
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {9, 3,6,12,4,3,2};
		swap1(arr);

	}

}
