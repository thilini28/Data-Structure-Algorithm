import java.util.*;

/**
 * Day 02: Arrays: declaration, traversal, update, insertion idea, deletion idea, min/max, and linear search.
 * Topic: Arrays store elements in contiguous indexed positions. Practice traversal, finding min/max, and linear search. Understand that indexed access is O(1), while searching is O(n).
 */
public class Day02_Arrays 
{
    public static void main(String[] args) 
	{

        int[] a = {7, 2, 9, 4, 1};
        int min = a[0], max = a[0];
        for (int x : a) 
		{ 
			min = Math.min(min, x); 
			max = Math.max(max, x); 
		}
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Min = " + min + ", Max = " + max);
        System.out.println("Index of 9 = " + linearSearch(a, 9));

    }

    static int linearSearch(int[] a, int target) 
	{ 
		for(int i=0;i<a.length;i++) 
			if(a[i]==target) 
				return i; 
			return -1; 
	}

}
