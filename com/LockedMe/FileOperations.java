package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileOperations {
	public void createMainFolder(String fileName)
	{
		File file = new File(fileName);
		if(!file.exists())
		{
			file.mkdirs();
		}
	}
	public void displayAllFiles(String path)
	{
		FileOperations ob = new FileOperations();
		ob.createMainFolder("main");
		try {
			System.out.println("Displaying the file names in ascending order: -");
			
			File dir = new File(path);
			File[] files = dir.listFiles();
			List<File> filesList = Arrays.asList(files);
			Collections.sort(filesList);
			for(File f : filesList)
			{
				System.out.print(f.toString()+ " ");
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void createFile(String fileName, String fileType)
	{
		FileOperations ob = new FileOperations();
		ob.createMainFolder("main");
		String fileSeparator = System.getProperty("file.separator");
		String absolutePath = fileSeparator + "main" + fileSeparator + fileName + fileSeparator + "." + fileType;
		File file = new File(absolutePath);
		try {
			if(file.createNewFile())
			{
				System.out.printf("The new file with file name as %s is created under main folder\n",fileName);
			}
			else
			{
				System.out.println("File already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteFile(String path)
	{
		File file = new File(path);
		try {
			if(file.delete())
			{
				System.out.println("File deleted successfully!");
			}
			else
			{
				System.out.println("File is failed to delete. Please enter the correct path!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void searchFile(String directory, String fileName)
	{
		File file = new File(directory);
		File[] fList = file.listFiles();
		int flag = 0;
		for(File f : fList)
		{
			if(f.getName().toString().equalsIgnoreCase(fileName))
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("File found!");
		}
		else
		{
			System.out.println("File Not Found!");
		}
	}

}
