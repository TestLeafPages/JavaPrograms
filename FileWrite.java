package coding;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileWrite extends BaseTestNg{
	String fileName ="./NewFile.txt";
	
	@Test(priority=1)
	public void usingOutputStream() throws FileNotFoundException {
		try {
            FileOutputStream writer=new FileOutputStream(fileName);    
			writer.write("TestLeaf Software".getBytes()); // You have to convert to bytes and write them
			writer.write("\r\n".getBytes());   // write new line
			writer.write("Welcome to the learning.".getBytes());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	@Test(priority=2)
	public void usingBufferWriter() {
		FileWriter fw;
		try {
			fw = new FileWriter(fileName);
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write("TestLeaf Software");
			writer.write("\r\n");   // write new line
			writer.write("Welcome to the learning.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public void usingFileWriter() throws FileNotFoundException {
		try {
			FileWriter writer = new FileWriter(fileName, true);
			writer.write("TestLeaf Software");
			writer.write("\r\n");   // write new line
			writer.write("Welcome to the learning.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	
	

}
