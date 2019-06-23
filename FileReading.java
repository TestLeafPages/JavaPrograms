package coding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class FileReading extends BaseTestNg{
	String fileName = "MyFile.txt";
	@Test(priority=1)
	public void fileRead() {
		String line =null;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			try {
				while((line = br.readLine())!= null) {
					System.out.println(line);
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}} catch (FileNotFoundException e) {
				e.printStackTrace();

}
}
	@Test(priority=2)
	public void read() throws FileNotFoundException {
		File file =  new File("fileName");
				Scanner sc = new Scanner(file);

				while (sc.hasNextLine())
					System.out.println(sc.nextLine());
		         sc.close();
			}

}