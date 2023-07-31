package com.gurukul.day14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamSample {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	writeAFile();

    }

    public static void writeAFile() {
//	FileOutputStream fileOutputStream;
	String s = "Hello";
	try {

	    OutputStream outputStream = new FileOutputStream("C:\\Users\\shrik\\Downloads\\Sample.txt");
	    writeStream(outputStream, s);
	} catch (IOException e) {
	    System.err.println("Error in i/p");
	}
    }

    public static void writeStream(OutputStream outputStream, String s) {
	try {
	    byte[] data = s.getBytes();
	    outputStream.write(data);
	    outputStream.flush();
	} catch (IOException e) {
	    throw new RuntimeException(e);
	} finally {
	    try {

		outputStream.close();
	    } catch (IOException e) {
		throw new RuntimeException(e);
	    }
	}
    }

}
