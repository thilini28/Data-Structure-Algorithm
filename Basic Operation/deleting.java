import java.util.Arrays;
class deleting
{
	public static void main(String args[])
	{
		int[] arr={5,8,30,7,4,2,9,10};
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		int indexremove=-1;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==30)
			{
				indexremove=i;
				break;
			}
		}
		
		int[] Array=deleteElement(arr,indexremove);
		System.out.println("Deleted Array: "+Arrays.toString(Array));
	}
	
	public static int[] deleteElement(int[] arr,int index)
	{
		int[] newarr=new int[arr.length-1];
		int i,j;
		for(i=0,j=0; i<=newarr.length; i++)
		{
			if(i!=index)
			{
				newarr[j]=arr[i];
				j++;
			}
		}
		return newarr;
	}
}