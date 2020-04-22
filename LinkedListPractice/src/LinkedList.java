public class LinkedList {

	Node head;

	//insert at the end
	public static LinkedList insert(LinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;

		if (list.head == null) {
			list.head = new_node;
		}

		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}

		return list;
	}

	public static void printList(LinkedList list) {
		Node currNode = list.head;
		System.out.println("Linked List:   ");

		while (currNode != null) {
			System.out.println(currNode.data + " ");
			currNode = currNode.next;
		}
	}

	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		// for(int i=1;i<=20;i++)
		// {
		// list = insert(list, i);
		// }

		// Print the LinkedList
		printList(list);
	}

}
