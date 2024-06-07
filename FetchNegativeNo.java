class FetchNegativeNo
{
	public static void main(String[] args) 
	{
		int numbers[] ={1,-2,-13,4,5,6,-7,8,-19,10};
		 System.out.println("Length of array is :"+(numbers.length));
		 for(int i = 0 ; i < numbers.length ; i++)
		 {
		 	if(numbers[i] < 0)
		 	{
		 		System.out.println(numbers[i]);
		 	}
		 	
		 }
	}
}
