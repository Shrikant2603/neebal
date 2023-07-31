package com.gurukul.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSample {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	readUsingBufferedReader();

    }

    public static void readUsingBufferedReader() {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter an input");
	try {
	    String data = reader.readLine();
	    System.out.println(data);
	} catch (IOException e) {
	    throw new RuntimeException();
	} finally {
	    try {
		reader.close();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}

    }

}
