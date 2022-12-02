package com.LockedMe;

import java.util.Scanner;

public class FileOperationsHandler {
	public void mainMenuOptions()
	{
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		do
		{
			try {
				FileMenu objFileMenu = new FileMenu();
				objFileMenu.displayMainMenu();
				int input = sc.nextInt();
				switch(input)
				{
				case 1:
					Scanner scan = new Scanner(System.in);
					System.out.println("Enter the path of the folder you want to see");
					String path = scan.nextLine();
					FileOperations obj = new FileOperations();
					obj.displayAllFiles(path);
					scan.close();
					break;
				case 2:
					FileOperationsHandler obj1 = new FileOperationsHandler();
					obj1.fileOperationsMenu();
					break;
				case 3:
					System.out.println("Application exited successfully!");
					flag = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Wrong choice! Please select a valid option.");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}while(flag);
	}
	public void fileOperationsMenu()
	{
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		do
		{
			FileMenu objFileMenu = new FileMenu();
			objFileMenu.displayFileMenu();
			int input = sc.nextInt();
			switch(input)
			{
			case 1:
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the file Name: -");
				String fileName = scan.nextLine();
				System.out.println("Enter the file type: -");
				String fileType = scan.nextLine();
				FileOperations obj1 = new FileOperations();
				obj1.createFile(fileName, fileType);
				scan.close();
				break;
			case 2:
				System.out.println("Please enter the path of the file to be deleted: -");
				String path = sc.nextLine();
				FileOperations obj2 = new FileOperations();
				obj2.deleteFile(path);
				break;
			case 3:
				System.out.println("Please enter the directory under which the file has to be searched: -");
				Scanner scan1 = new Scanner(System.in);
				String directory = scan1.nextLine();
				System.out.println("Please enter the file name to be searched: -");
				String fileNametoSearch = scan1.nextLine();
				FileOperations obj3 = new FileOperations();
				obj3.searchFile(directory, fileNametoSearch);
				scan1.close();
				break;
			case 4:
				return;
			case 5:
				System.out.println("Program Exited successfully!");
				flag = false;
				sc.close();
				System.exit(0);
			default:
				System.out.println("Wrong choice! Please enter a correct choice.");			
			}
			
		}while(flag);
	}


}
