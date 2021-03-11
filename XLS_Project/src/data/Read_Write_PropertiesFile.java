package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Write_PropertiesFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fs = new FileInputStream("C:\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);

		String S = prop.getProperty("browser");
		System.out.println(S);

		// to read the value
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("environment"));
		System.out.println(prop.getProperty("browser"));

		// to write the value
		prop.setProperty("name", "Kanika");
		System.out.println(prop.getProperty("name"));

		prop.setProperty("Tool", "Selenium");
		System.out.println(prop.getProperty("Tool"));
		// to store the value
		FileOutputStream fo = new FileOutputStream("C:\\Testing\\prop.properties");
		prop.store(fo, "Add to file");

	}

}
