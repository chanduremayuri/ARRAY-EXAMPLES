class ReverseString 
{
	public static void main(String[] args) 
	{
		   
          String arr [] = { "ABC" ,"DEF" ,"GHI " };

		   for(int i  = arr.length-1 ; i >= 0 ; i--)
		{
			System.out.println(arr[i] + " ");
		}
	}
}