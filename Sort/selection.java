import java.util.Arrays;
class selection
{
	public static void main(String args[])
	{
		int[] arr={15,11,3,24,10};
		System.out.println("Original Array: "+Arrays.toString(arr));
		SelectionSort(arr);
	}
	
	public static void SelectionSort(int[] arr)
	{
		int n=arr.length;
		for(int i=0; i<n-1; i++)
		{
			int minIndex=i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[j]<arr[minIndex])
				{
				    minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		System.out.println("Sorted Array: "+Arrays.toString(arr));
	}
}