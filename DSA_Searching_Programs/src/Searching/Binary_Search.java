package Searching;

public class Binary_Search {
	
	public String binarysearch(int[] arr, int find)
	{
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high)
		{
			int mid = low + ( high - low ) / 2;
			if(arr[mid] == find)
			{
				return "Element Present";
			}
			else if(find > arr[mid])
			{
				low = high - 1;
			}
			else
			{
				high = low + 1;
			}
		}
		
		return "Element not present";
	}
	
	public static void main(String []args)
	{
		int arr[] = {1,2,3,4,5,6,7};
		int find = 4;
		
		Binary_Search bs = new Binary_Search();
		String str = bs.binarysearch(arr, find);
		
		System.out.println(str);
		
	}

}
