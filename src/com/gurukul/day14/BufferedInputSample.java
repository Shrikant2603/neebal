package com.gurukul.day14;

import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedInputSample {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
//	readByte();
//	readByteArray();
	readAllStream();
    }

    public static void readByte() {
	try {
	    System.out.println("Enter an input");
	    BufferedInputStream reader = new BufferedInputStream(System.in);
	    int a = reader.read();
	    System.out.println("Input was " + a);
	} catch (IOException e) {
	    System.err.println("Error in i/p");
	}
    }

    public static void readByteArray() {
	try {
	    System.out.println("Enter an input");
	    BufferedInputStream reader = new BufferedInputStream(System.in);
	    byte[] b = new byte[10];
	    reader.read(b);
	    System.out.println("Input was " + new String(b));
	} catch (IOException e) {
	    System.err.println("Error in i/p");
	}
    }

    public static void readAllStream() {
	try {
	    System.out.println("Enter an input");
	    BufferedInputStream reader = new BufferedInputStream(System.in);
	    StringBuilder sb = new StringBuilder();
	    byte[] b = new byte[5];
	    int pos;
	    while ((pos = reader.read(b)) != -1) {
		sb.append(new String(b, 0, pos));
		if (b[pos - 1] == '\n')
		    break;
		b = new byte[5];
	    }
	    System.out.println("Input was " + sb);
	} catch (IOException e) {
	    System.err.println("Error in i/p");
	}
    }

}
