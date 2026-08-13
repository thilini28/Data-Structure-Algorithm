import java.util.Arrays;

class desendingBinarySearch
{
	public static int BSearch(int arr[],int target)
	{
		int low=0; //left
		int high=arr.length-1; //right
		
		boolean asc=true;
		
		if(arr[low] > arr[high])
		{
			asc=false;
		}
		
		if(asc)	
		{
			while(low<=high)
			{
				int mid = low+(high-low)/2;
				if(arr[mid] == target)
				{
					return mid; 
				}
				else if(arr[mid] > target)
				{
					high = mid - 1;
				}
				else{
					low = mid + 1;
				}
			}	
		}
		else{ //desending
			while(low<=high)
			{
				int mid = low+(high-low)/2;
				if(arr[mid] == target)
				{
					return mid; 
				}
				else if(arr[mid] > target)
				{
					low = mid + 1;
				}
				else{
					high = mid - 1;
				}
			}	
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int arr[] ={1,2,3,5,7,9,11};
		int srr[] = {11,10,8,7,6,5,4};
		int target = 40;	
		System.out.println(BSearch(srr,target));
	}
}