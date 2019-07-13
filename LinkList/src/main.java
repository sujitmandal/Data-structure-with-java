import java.util.Scanner;
//This programe is create by Sujit Mandal
public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		linklist list = new linklist();
		int choice;
		
		do {
			System.out.println("\n1: create.");
			System.out.println("2: display.");
			System.out.println("3: exit.");
			
			System.out.println("Enter your choice: ");
			choice = input.nextInt();
			
			switch(choice) {
			case 1:
				if(choice == 1) {
					list.create();
					break;
				}
			case 2:
				if(choice == 2) {
					list.display();
					break;
				}
			case 3:
				System.exit(0);
				break;
			default :
				System.out.println("Invalid choice!");
				break;
			}
		}while(choice != 3);
	}
}
