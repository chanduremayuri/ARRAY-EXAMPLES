class LenghtVariable1
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50,60};
		int lnght = 0;
		for( ; ;)
		{

			try 
			{
				System.out.print(arr[lnght++] + " ");
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
				break ;
			}
		}
		System.out.println();
		System.out.println("Length of array is : "+(lnght - 1));
	}
}