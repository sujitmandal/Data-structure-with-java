import java.util.Scanner;
//This programe is create by Sujit Mandal
public class StackUsingLinkList {
	Node head;
	
	public void push() {
		Scanner input = new Scanner(System.in);
		Node temp = new Node();
		System.out.println("Enter node data: ");
		temp.info = input.nextInt();
		System.out.println(temp.info + " push/inserted into Stack.");
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
			System.out.println("\nStack Underflow!");
		}
		else {
			Node last_node = new Node();
			Node prve_node = new Node();
			last_node = head;
			
			while(last_node.next != null) {
				prve_node = last_node;
				last_node = last_node.next;
			}
			prve_node.next = null;
			
			System.out.println("\nStake after deleted/pop");
			display();
		}
	}
	public void display() {
		Node temp = new Node();
		if(head == null) {
			System.out.println("\nStack is empty!");
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
