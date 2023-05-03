
import java.io.*;

// Main class
class checked {

	// Main driver method
	public static void main(String[] args)
		throws IOException
	{

		FileReader file = new FileReader("C:\\test\\a.txt");

		BufferedReader fileInput = new BufferedReader(file);

		for (int counter = 0; counter < 3; counter++)
			System.out.println(fileInput.readLine());

		
		fileInput.close();
	}
}
