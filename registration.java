package Student;

import java.util.Scanner;

public class registration {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	
	System.out.println("WELCOME TO SDBMS");
	System.out.println("Enter the choice");
	System.out.println("-------------");
	
	//UPCASTING->UPCASTING
	
	studentManagementSystem obj=new studentManagementSystemImpl();
	
	//MENU DRIVEN PROGRAM
	while(true) {
	System.out.println("1:ADD STUDENTS\n2:REMOVE STUDENT");
	System.out.println("3:REMOVE ALL STUDENTS\n4:DISPLAY STUDENT");
	System.out.println("5:DISPLAY ALL STUDENTS\n6:UPDATE STUDENT");
	System.out.println("7:COUNT STUDENTS\n8:SORT STUDENT\n9.EXIT");
	System.out.println("----------------");
	System.out.println("ENTER YOUR CHOICE");
	System.out.println("----------------");
	int choice=scan.nextInt();
	switch(choice) {
	case 1:
		obj.addStudent();
		break;
	case 2:
		obj.removeStudent();
		break;
	case 3:                                    
		obj.removeAllStudent();
		break;
	case 4:
		obj.displayStudent();
		break;
	case 5:
		obj.displayAllStudent();
		break;
	case 6:
		obj.updateStudent();
		break;
	case 7:
		obj.countStudent();
		break;
	case 8:
		obj.sortStudent();
		break;
	case 9:
		System.out.println("Thank you!!");
		System.exit(0);
		break;
	default:
		System.out.println("Enter the valid choice,kindly ennter the valid choice.");
	}
	System.out.println("-----------------");
}
}
}
