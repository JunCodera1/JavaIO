package JavaOutput;

import java.io.*;

public class MyByteArrayOutputStream {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout1 = new FileOutputStream("D:\\f1.txt");
        FileOutputStream fout2 = new FileOutputStream("D:\\f2.txt");

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close(); // now it will close properly
        System.out.println("Success...");
    }
}
