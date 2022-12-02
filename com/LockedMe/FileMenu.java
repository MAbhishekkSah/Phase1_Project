package com.LockedMe;

public class FileMenu {
	public void printWelcomeScreen(String name)
	{
		System.out.println("***************************************************");
		System.out.print("------------> Welcome to LockedMe.com <------------\n");
		System.out.printf("This application was developed by -->\n%s\n", name);
		String appFunction = "This app can perform the following operations: - " + "\n\n" +
								"--> Retrieve all file names \n" + 
								"--> Add, Search or delete a file \n"
								+ "--> Close the application";
		System.out.println();
		System.out.println(appFunction);
		System.out.println();
		
	}
	public void displayMainMenu()
	{
		String menuOption = "Please choose the following option: -\n" 
							+ "1-> Retrieve all files\n"
							+"2->Display Menu for performing file operations\n"
							+ "3->Exit the main Menu";
		System.out.println(menuOption);
	}
	public void displayFileMenu()
	{
		String fileMenu = "Please choose the following options to perform any File Operations: -\n" +
							"1-> Create a new File\n"
							+ "2-> Delete a file\n" + 
							"3-> Search a file with file Name\n" +
							"4-> Show previous menu\n" + "5-> Exit the Program";
		System.out.println();
		System.out.println();
		System.out.println(fileMenu);
	}


}
