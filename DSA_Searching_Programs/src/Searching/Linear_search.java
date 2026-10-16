package Searching;

public class Linear_search {

	public String search(int[] arr, int find) {
		
		int n = arr.length;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] == find)
			{
				return "Element Present";
			}
		}
		
		return "Element Not Present";
	}
	
	public static void main(String []args)
	{
		int arr[] = {1,2,4,5,8,9};
		
		int find = 3; 
		
		Linear_search ls = new Linear_search();
		
		String str = ls.search(arr, find);
		
		System.out.println(str);
		
	}
}
