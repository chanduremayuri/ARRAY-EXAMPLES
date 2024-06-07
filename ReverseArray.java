class ReverseArray 
{
	public static void main(String[] args) 
	{
		int arr[] = { 1,7,8,9,4,1,2};
		for(int i  = arr.length-1 ; i >= 0 ; i--)
		{
			System.out.println(arr[i] + " ");
		}
	}
}