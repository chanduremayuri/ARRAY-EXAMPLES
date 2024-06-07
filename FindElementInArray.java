class FindElementInArray
{
	public static void main(String[] args) 
	{
		int arr[] = {1,9,7,4,8,9,10};
		int findElement = 9;
		boolean flag = true ;
		int i ;
		for(i =0 ; i <arr.length ; i++)
		{
			if(findElement == arr[i])
			{
				System.out.println("Element found in pos :" + (i+1));
				flag= false ;
				break ;
			}
		}
		if(flag)
		{
			System.out.println("Element not found");
		}
	}
}