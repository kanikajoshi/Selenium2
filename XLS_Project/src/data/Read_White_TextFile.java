package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_White_TextFile {

	public static void main(String[] args) throws IOException {
		
		//to create a new file
		File f = new File("C:\\Testing\\temp.txt");
		f.createNewFile();
		
		//to write in file
		FileWriter w = new FileWriter("C:\\Testing\\temp.txt");
		BufferedWriter out = new BufferedWriter(w);
		out.write("My name is kanika");
		out.newLine();
		out.write("I study cs 1");
		out.newLine();
		out.write("I study cs 2");
		out.newLine();
		out.write("I study cs 3");
		out.newLine();
		out.flush();
		out.close();
		
		//to read from file
		FileReader r = new FileReader("C:\\Testing\\temp.txt");
		BufferedReader rd = new BufferedReader(r);
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		rd.close();*/
		
		int i = 0;
		String S = rd.readLine();
		while(S != null) {
			System.out.println(S);
			S =rd.readLine();
			i++;
		}
		System.out.println(i);
		rd.close();
	}

}
