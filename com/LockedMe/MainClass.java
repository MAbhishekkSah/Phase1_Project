package com.LockedMe;

public class MainClass {

		public static void main(String[] args) {
			FileOperations objFileOperations = new FileOperations();
			objFileOperations.createMainFolder("main");
			FileMenu objFileMenu = new FileMenu();
			objFileMenu.printWelcomeScreen("Abhishek Kumar Sah");
			FileOperationsHandler objFileOprerationsHandler = new FileOperationsHandler();
			objFileOprerationsHandler.mainMenuOptions();
		}

}
