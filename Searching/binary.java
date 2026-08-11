import java.util.Arrays;
class binary
{
	public static void main(String args[])
	{
		int[] arr={80,50,60,70,40};
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		int target=40;
		
		Arrays.sort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		
		int result=BinarySearch(arr,target);
		if(result!=-1)
		{
		    System.out.println("Index is "+result);
		}
		else{
		    System.out.println("Index is not found.");
		}
	}
	
	public static int BinarySearch(int[] sortarr,int element)
	{
		int low=0;
		int high=sortarr.length-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(sortarr[mid]==element)
			{
				return mid;
			}
			else if(sortarr[mid]<element)
			{
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return -1;
	}
}