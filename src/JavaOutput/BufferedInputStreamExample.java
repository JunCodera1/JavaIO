package JavaOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("D:\\testout.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i;
		while((i = bin.read())!=-1) {
			System.out.print((char)i);
		}
		bin.close();
		fin.close();
	}
}
