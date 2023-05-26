

package sorting;

public class Sorting {
	public static void main(String[] args) 
	{
		int[] arr= {8,4,6,3,10,11};
		int n = arr.length;
		
		
		for(int i=0;i<n;i++)
		{
			int temp;
			for (int j = 0; j <n-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
	
			}
		
			
		}
		for(int v:arr)
		{
			System.out.println(v+" ");
		}
		
		
	}
	
	
}
