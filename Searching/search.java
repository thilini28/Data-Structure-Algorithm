import java.util.Arrays;
class search
{
	public static void main(String args[])
	{
		int[] arr={12,56,48,25,10,50,39};
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		int element=SearchElement(arr);
		System.out.println("Search element index is: "+element);
	}
	
	public static int SearchElement(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==48)
			{
				return i;
			}
		}
		return -1;
	}
}