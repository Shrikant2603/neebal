package com.gurukul.day14;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	readUsingFileReader();

    }

    public static void readUsingFileReader() {
	FileReader fileReader = null;
	try {
	    fileReader = new FileReader("C:\\Users\\shrik\\Downloads\\Sample.txt");
	    char[] charuf = new char[10];
	    int characterRead;
	    String fileData = "";

	    while ((characterRead = fileReader.read(charuf)) != -1) {
		fileData += new String(charuf, 0, characterRead);
	    }
	    System.out.println(fileData);
	} catch (IOException e) {
	    throw new RuntimeException();
	} finally {
	    try {
		fileReader.close();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}

    }

}
