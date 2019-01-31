import java.io.*;

public class BubbleUp {
	public static void main(String[] args) {
		BufferedReader in = null;
		String line = null;
		String xString = "";

		try {
			in = new BufferedReader(new FileReader("bubbles.txt"));

			while ((line = in.readLine()) != null)
				xString += line;

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Before: " + xString);
		System.out.print("After: ");
		char[] l = xString.toCharArray();
		
	
	}
}
