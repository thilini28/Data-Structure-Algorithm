import java.util.Arrays;
public class QuickSort
{
	public static void main(String args[])
	{
		int arr[] = {50,3,100,4,2,1,10};
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		quickSort(arr,0,arr.length-1);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int pivot = arr[low];
			int i=low;
			int j=high;
			
			while(i<=j)
			{
				while(i<=high && arr[i] <= pivot)
				{
					i++;
				}
				while(arr[j] > pivot)
				{
					j--;
				}
				
				if(i<j)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			int temp = arr[low];
			arr[low] = arr[j];
			arr[j] = temp;
			
			quickSort(arr,low,j-1);
			quickSort(arr,j+1,high);
		}
	}
}