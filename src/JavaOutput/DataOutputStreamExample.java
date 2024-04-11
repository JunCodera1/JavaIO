package JavaOutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream file = new FileOutputStream("D:\\testout.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.writeInt(65);
		data.flush();
		data.close();
		file.close();
		System.out.println("Success...");
	}
}
