
public class ReverseALinkedList {

	static Node head;

	public Node reverse(Node node) {

		Node prev = null;
		Node current = node;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;

	}

	public void printList(Node node) {
		Node currNode = head;
		while (currNode != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}

	}

	public static void main(String args[]) {
		ReverseALinkedList list = new ReverseALinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}

}
