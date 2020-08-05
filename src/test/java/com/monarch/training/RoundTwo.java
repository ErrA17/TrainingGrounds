package com.monarch.training;

import java.io.IOException;

import org.junit.Test;

public class RoundTwo {

	String content = "lorem ipsum madafaka here we go \n shmecher linia doi oare?";
	String fileName = "erraLoop.txt";
	
	
	@Test
	public void callCreateFileClassMethod() throws IOException {
		FirstRoundTest fileWriter = new FirstRoundTest();
		
		for (int i=0; i<10; i++) {
			fileName = i + fileName;
			fileWriter.writeToFile(fileName, content + "     ==== " + i);
		}
		
	}
}
