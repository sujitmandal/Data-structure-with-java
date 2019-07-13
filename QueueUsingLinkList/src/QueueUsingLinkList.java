import java.util.Scanner;
//This programe is create by Sujit Mandal
public class QueueUsingLinkList {
Node head;
	
	public void push() {
		Scanner input = new Scanner(System.in);
		Node temp = new Node();
		System.out.println("Enter node data: ");
		temp.info = input.nextInt();
		System.out.println(temp.info + " push/inserted into Queue.");
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
	
	public void pop() {
		if(head == null) {
			System.out.println("\nQueue Underflow!");
		}
		else {
			head = head.next;
			
			System.out.println("\nQueue after deleted/pop");
			display();
		}
	}
	public void display() {
		Node temp = new Node();
		if(head == null) {
			System.out.println("\nQueue is empty!");
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
