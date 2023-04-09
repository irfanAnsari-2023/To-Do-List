package com.toDoList.project;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	static ArrayList<String> tasks = new ArrayList<String>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the To-Do List Application");
		
		while(true) {
			System.out.println("Please Select an Option");
			System.out.println("1. Add Task");
			System.out.println("2. Edit Task");
			System.out.println("3. Delete Task");
			System.out.println("4. View Task");
			System.out.println("5. Exit");
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1: 
				addTask();
				break;
			case 2: 
				editTask();
				break;
			case 3:
				deleteTask();
				break;
			case 4:
				viewTask();
				break;
			case 5:
				System.out.println("Thank you for using the To-Do App.");
				System.exit(0);
				break;
			default: 
				System.out.println("Invalid choice, Please try again!!");
			}
		}
		
	}

	

	private static void viewTask() {
		if(tasks.size() == 0) {
			System.out.println("No task to display!");
			return;
		}
		System.out.println("Tasks : ");
		for(int i=0; i<tasks.size(); i++) {
			System.out.println((i+1)+ ". " + tasks.get(i));
		}
		
	}



	private static void deleteTask() {
		System.out.println("\nEnter task number to delete :");
		int taskNumber = scanner.nextInt();
		scanner.nextLine();
		if(taskNumber > tasks.size()) {
			System.out.println("Invalid task number, Please try again!");
			return;
		}
		tasks.remove(taskNumber-1);
		System.out.println("Task deleted successfully!");
		
	}



	private static void addTask() {
		System.out.println("\nEnter task description: ");
		scanner.nextLine();
		String task = scanner.nextLine();
		tasks.add(task);
		System.out.println("Task added successfully!");
		
	}
	
	private static void editTask() {
		System.out.println("\nEnter task number to edit : ");
		int taskNumber = scanner.nextInt();
		scanner.nextLine();
		if(taskNumber > tasks.size()) {
			System.out.println("Invalid task number, Please try again!");
			return;
		}
		System.out.println("\nEnter new task description :");
		String newTask = scanner.nextLine();
		tasks.set(taskNumber-1,newTask);
		System.out.println("Task edit successfully!");
	}
}
