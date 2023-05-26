package sorting;

public class Algorithm {// insertion sort
	public static void main(String[] args) {
		
		int  arr[]= {22,3,4,64,3,2};
		
		
		
		for (int i = 1; i <arr.length; i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
				
			}
			arr[j+1]=key;
		}
		for(int a:arr)
		{
			System.out.println(a+" ");
		}
		
	}
}
