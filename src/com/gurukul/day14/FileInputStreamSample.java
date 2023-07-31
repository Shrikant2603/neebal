package com.gurukul.day14;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamSample {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
//	readAnInput();
//	readAFile()
	readUsingBufferStream();
//	System.out.println(getFileString());
    }

    public static void readAFile() {
	InputStream fis;
	try {
	    System.out.println("Enter an input");
	    FileInputStream fileInputStream = new FileInputStream(
		    "C:\\\\Users\\\\shrik\\\\eclipse-workspace\\\\stockmarketusingthreads\\\\bin\\\\com\\\\project\\\\sharemarket\\\\TraderOneMoves.txt");
	    String sb = getFileString();

	    System.out.println("Input was " + sb);
	} catch (IOException e) {
	    System.err.println("Error in i/p");
	}
//	System.out.println(getFileString());
    }

    public static void readUsingBufferStream() {
	InputStream bis;
	try {
	    System.out.println("Enter an input");
	    BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(
		    "C:\\\\Users\\\\shrik\\\\eclipse-workspace\\\\stockmarketusingthreads\\\\bin\\\\com\\\\project\\\\sharemarket\\\\TraderOneMoves.txt"));
	    String sb = getFileString();

	    System.out.println("Input was " + sb);
	} catch (IOException e) {
	    System.err.println("Error in i/p");
	}
    }

    public static String getFileString() {
	FileInputStream fileInputStream = null;
	try {
	    System.out.println("Enter an input");
	    fileInputStream = new FileInputStream(
		    "C:\\\\Users\\\\shrik\\\\eclipse-workspace\\\\stockmarketusingthreads\\\\bin\\\\com\\\\project\\\\sharemarket\\\\TraderOneMoves.txt");
	    String s = "";
	    byte[] b = new byte[5];
	    int pos;
	    while ((pos = fileInputStream.read(b)) != -1) {
		s += (new String(b, 0, pos));
	    }
//	    System.out.println("Input was " + sb);
	    return s;
	} catch (IOException e) {
//	    System.err.println("Error in i/p");
	    return "Error in i/p";
	} finally {
	    try {
		fileInputStream.close();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
    }

}
