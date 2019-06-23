package coding;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileWrite extends BaseTestNg{
	String fileName ="MyFile.txt";
	@Test(priority=1)
	public void usingFileWriter() throws FileNotFoundException {
		 try {
			            FileWriter writer = new FileWriter(fileName, true);
			            writer.write("Hello World");
			            writer.write("\r\n");   // write new line
			            writer.write("Good Bye!");
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
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Amazon Indis Private Limited");
			bw.newLine();
			bw.write("TestLeaf Solutions Private Limited");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
