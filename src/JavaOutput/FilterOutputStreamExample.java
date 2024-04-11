package JavaOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FilterOutputStreamExample {
	public static void main(String[] args) throws Exception{
		File data = new File("D:\\testout.txt");
		FileOutputStream file = new FileOutputStream(data);
		FilterOutputStream filter = new FilterOutputStream(file);
		String s = "Welcome to my house";
		byte b[] = s.getBytes();
		filter.write(b);
		filter.flush();
		filter.close();
		file.close();
		System.out.println("Success...");
	}
}
