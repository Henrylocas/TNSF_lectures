

class array {
	public static void main(String[] args)
	{
		int[] arr;

		arr = new int[5];

		arr[0] = 10;

		arr[1] = 20;

		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at index " + i+ " : " + arr[i]);
      		Arrays.sort(arr);
          int intArr1[]= {2,10,30,88,999};
		System.out.println(Arrays.toString(intArr1));
		
		
		if(Arrays.compare(arr, intArr1)==0)
		{
			System.out.println("Both the Arrays are equal");
		}
		else
		{
			System.out.println("Both the Arrays are not equal");
		}

	}
}
