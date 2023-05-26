package sorting;

public class Quicksort2 {
	public static void main(String[] args) {
		int arr[]= {10,2,4,6,11,33,5};
		
		sort(arr,0,arr.length-1);
		for (int a : arr) {
			System.out.print(a+" ");
		}
	}
	public static void sort(int []arr,int low,int high)
	{
		if (low<high) {
			int idx=partition(arr,low,high);
			sort(arr,0,idx-1);
			sort(arr,idx+1,high);
		}
	}
	public static int  partition(int []arr,int low,int high)
	{
		int pi=arr[high];
		int i=low-1;
		for (int j = low; j < high; j++) {
			
			if (arr[j]<pi) {
				i++;
			}
		}
		swap(i+1,high,arr);
		return i+1;
	}
	
	public static  void swap(int a,int b,int []arr)
	{
		int temp=arr[a];
		arr [a]=arr[b];
		arr[b]=temp;
		
	}
}
