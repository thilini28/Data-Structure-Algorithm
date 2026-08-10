import java.util.Arrays;
class inserting
{
	public static void main(String args[])
	{
		int[] arr={5,8,7,4,2,6,9};
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		int[] Array=AddElement(arr,50,5);
		System.out.println("Inserted Array: "+Arrays.toString(Array));
	}
	
	public static int[] AddElement(int[] arr,int element,int index)
	{
		int[] newarr=new int[arr.length+1];
		for(int i=0; i<index; i++)
		{
			newarr[i]=arr[i];
		}
		
		newarr[index]=element;
		
		for(int i=index+1; i<newarr.length; i++)
		{
			newarr[i]=arr[i-1];
		}
		
		return newarr;
	}
}