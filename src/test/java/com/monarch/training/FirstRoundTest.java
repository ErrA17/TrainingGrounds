package com.monarch.training;

import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class FirstRoundTest {
	public int answer = 2 + 2;
	double d = 4.5;
	@Test
	public void canAddTwoPlusTwo() {

	
		System.out.println("2+2 = " + answer);
		assertEquals("2+2=4", 4, answer);
	}

	@Test
	public void createFileTest() throws IOException {
		String str = "Hello " + answer;
		BufferedWriter writer = new BufferedWriter(new FileWriter("erra"));
		writer.write(str);

		writer.close();
	}
	
	public void writeToFile(String fileName, String content)throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		writer.write(content);

		writer.close();
	}

}
