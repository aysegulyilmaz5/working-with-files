package workingwithfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Files {
	
	public static void main(String[] args) {
		createFile();
		getFileInfo();
		ReadFile();
		WriteFile();
		ReadFile();
		
	
	}
	public static void createFile() {
		File file = new File("C:\\Users\\aysegul\\Documents\\GitHub\\working-with-files\\students.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File is created");
			}
			else {
				System.out.println("File already exists");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void getFileInfo() {
		File file = new File("C:\\Users\\aysegul\\Documents\\GitHub\\working-with-files\\students.txt");
		if(file.exists()) {
			System.out.println("File Name:" +file.getName());
			System.out.println("File Path:"+file.getAbsolutePath());
			System.out.println("File Can Write:" +file.canWrite());
			System.out.println("File Can Read:" +file.canRead());
			System.out.println("File Byte:" +file.length());
		}
	}
	
	public static void ReadFile() {
		File file = new File("C:\\Users\\aysegul\\Documents\\GitHub\\working-with-files\\students.txt");
		try {
			Scanner Reader = new Scanner(file);
			while(Reader.hasNextLine()) {
				String line = Reader.nextLine();
				System.out.println(line);
			}
			Reader.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void WriteFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\aysegul\\Documents\\GitHub\\working-with-files\\students.txt",true));
			writer.newLine();
			writer.write("I love World");
			System.out.println("Writing to file");
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
