
class GenericConstructor {
	// Member variable of this class
	private double v;

	// Constructor of this class where
	// T is typename and t is object
	<T extends Number> GenericConstructor(T t)
	{
		
		v = t.doubleValue();
	}

	void show()
	{
		System.out.println("v: " + v);
	}
}

// Class 2 - Implementation class
// Main class
class GFG {
	// Main driver method
	public static void main(String[] args)
	{
		// Display message
		System.out.println("Number to Double Conversion:");

		
		GenericConstructor obj1= new GenericConstructor(10);
		GenericConstructor obj2
			= new GenericConstructor(136.8F);

		
		obj1.show();
		obj2.show();
	}
}
