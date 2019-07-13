import java.util.Scanner;
//This programe is create by Sujit Mandal
public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		CompleteLinkList list = new CompleteLinkList();
		int choice;
		
		do {
			System.out.println("\n1: create.");
			System.out.println("2: revers.");
			System.out.println("3: delete last node.");
			System.out.println("4: delete info.");
			System.out.println("5: display.");
			System.out.println("6: exit.");
			
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
					list.revers();
					break;
				}
			case 3:
				if(choice == 3) {
					list.deleteLastNode();
					break;
				}
			case 4:
				if(choice == 4) {
					list.deleteInfo();
					break;
				}
			case 5:
				if(choice == 5) {
					list.display();
					break;
				}
			case 6:
				System.exit(0);
				break;
			default :
				System.out.println("Invalid choice!");
				break;
			}
		}while(choice != 6);
	}
}
