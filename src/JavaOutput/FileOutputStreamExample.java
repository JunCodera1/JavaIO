package JavaOutput;

import java.io.FileOutputStream;  

public class FileOutputStreamExample {
   public static void main(String[] args) {
	   try {
		   FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		   String s = "phuc kiki la gay";
		   byte[] b = s.getBytes();//converting string to byte array;
		   fout.write(b);
		   fout.close();
		   System.out.print("success");

	   }catch(Exception e) {
		   
	   }
	   
   }
}
