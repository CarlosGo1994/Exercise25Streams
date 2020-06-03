package com.exercise25streams.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class StreamsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = null;
		FileReader myReader = null;
		BufferedReader myBuffer = null;
		String line = "";
		
		try
		{	
			myFile = new File("c:\\a\\a.txt");
			myReader = new FileReader(myFile);
			myBuffer = new BufferedReader(myReader);
			
			while((line = myBuffer.readLine())!=null)
			{	
				line = line.toUpperCase();
				line = line.replace("O","W");
				System.out.println(line);
			}
			
			/*line = myBuffer.readLine();
			System.out.println(line);*/
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				myBuffer.close();
				myFile = null;
				myReader = null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
