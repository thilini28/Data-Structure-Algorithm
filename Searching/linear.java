import java.util.Arrays;
class linear
{
	public static void main(String args[])
	{
		int[] arr={12,56,48,25,10,5,39};
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		int target=48;
		
		int result=LinearSearch(arr,target);
		if(result!=-1)
		{
		    System.out.println("Index is "+result);	
		}
		else{
		    System.out.println("Index is not found.");	
		}
	}
	
	public static int LinearSearch(int[] arr,int target)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
}