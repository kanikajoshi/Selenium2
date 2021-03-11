import java.io.File;
import java.io.IOException;

/**
 * 
 */

/**
 * @author kanika
 *
 */
public class JavaFile {

	/**
	 import java.io.File;  // Import the File class

	 File myObj = new File("filename.txt"); // Specify the filename
	 * @throws IOException 
	 
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File ob = new File("filename11.txt");
		
		if(ob.createNewFile()) {
			System.out.println("File is created");
			System.out.println(ob.getAbsolutePath());
		
		}

	}

}
