import java.util.Arrays;
class insertion
{
	public static void main(String args[])
	{
		int[] arr={10,85,2,21,130};
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		InsertionSort(arr);
	}
	
	public static void InsertionSort(int[] arr)
	{
		int n=arr.length;
		for(int i=1; i<n; i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		System.out.println("Sorted Array: "+Arrays.toString(arr));
	}
}