
class MyException extends Exception {
}

public class setText {
	// Driver Program
	public static void main(String args[])
	{
		try {
			// Throw an object of user defined exception
			throw new MyException();
		}
		catch (MyException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}
