package coding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FileReading extends BaseTestNg{
	
	@Test(priority=1)
	public void readUsingBuffer() throws IOException {
		String str;

		File file = new File("./capgemini.txt"); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 

		while ((str = br.readLine()) != null) 
			System.out.println(str); 

		br.close();
	} 
	
	@Test(priority=2)
	public void readUsingReader() throws IOException {
		int i; 
		FileReader reader = new FileReader("./capgemini.txt"); 

		while ((i=reader.read()) != -1) 
			System.out.print((char) i); 

		reader.close();
		System.out.println("");
	} 

	@Test(priority=3)
	public void readUsingScanner() throws IOException {

		File file = new File("./capgemini.txt"); 
		Scanner sc = new Scanner(file); 

		while (sc.hasNextLine()) 
			System.out.println(sc.nextLine()); 

		sc.close();
	}

	
	

}