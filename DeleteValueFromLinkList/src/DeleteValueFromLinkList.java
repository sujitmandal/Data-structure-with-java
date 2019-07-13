import java.util.Scanner;
//This programe is create by Sujit Mandal
public class DeleteValueFromLinkList {
	Node head;
	
	public void create() {
		Scanner input = new Scanner(System.in);
		Node temp = new Node();
		System.out.println("Enter node data: ");
		temp.info = input.nextInt();
		System.out.println(temp.info + " inserted into Linked List");
		temp.next = null;
		
		if(head == null) {
			head = temp;
		}
		else {
			Node newnode = head;
			while(newnode.next != null) {
				newnode = newnode.next;
			}
			newnode.next = temp;
		}
	}
	public void deleteInfo() {
		Scanner input = new Scanner(System.in);
		if(head == null) {
			System.out.println("\nList is empty!");
		}
		else {
			int value;
			Node temp = new Node();
			
			System.out.println("Enete the value for delete: ");
			value = input.nextInt();
			 // #delete first node
			if(head.info == value) {
				head = head.next;
				return;
				}
				//#delete in between or at the end
				temp = head;
				while(temp.next != null) {
					if(temp.next.info == value) {
						break;
					}
				temp = temp.next;
				}
				if(temp.next == null) {
					System.out.println("\nvalue " + value + " is not in list");
				}
				else {
					temp.next = temp.next.next;
				}	
			System.out.println("\nlist after deleted.");
			display();
		}
		
	}
	
	public void display() {
		Node temp = new Node();
		if(head == null) {
			System.out.println("\nList is empty!");
		}
		else {
			temp = head;
			System.out.println("List is: ");
			while(temp != null) {
				System.out.println("info = " + temp.info);
				temp = temp.next;
			}
		}
	}
}
