import java.io.*;

class Node {
	int data;
	Node next;

	Node(int key)
	{
		data = key;
		next = null;
	}
}
class list {

	static Node head;
	static Node temp;

	static void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");

			node = node.next;
		}
		System.out.println();
	}


	static Node mergeKLists(Node arr[], int last)
	{

		for (int i = 1; i <= last; i++) {
			while (true) {

		
				Node head_0 = arr[0];
				Node head_i = arr[i];

				if (head_i == null)
					break;

				if (head_0.data >= head_i.data) {
					arr[i] = head_i.next;
					head_i.next = head_0;
					arr[0] = head_i;
				}
				else {

					while (head_0.next != null) {

						if (head_0.next.data
							>= head_i.data) {
							arr[i] = head_i.next;
							head_i.next = head_0.next;
							head_0.next = head_i;
							break;
						}

						head_0 = head_0.next;

						if (head_0.next == null) {
							arr[i] = head_i.next;
							head_i.next = null;
							head_0.next = head_i;
							head_0.next.next = null;
							break;
						}
					}
				}
			}
		}
		return arr[0];
	}

	public static void main(String[] args)
	{

		int k = 3;

		int n = 4;



		Node[] arr = new Node[k];

		arr[0] = new Node(1);
		arr[0].next = new Node(3);
		arr[0].next.next = new Node(5);
		arr[0].next.next.next = new Node(7);

		arr[1] = new Node(2);
		arr[1].next = new Node(4);
		arr[1].next.next = new Node(6);
		arr[1].next.next.next = new Node(8);

		arr[2] = new Node(0);
		arr[2].next = new Node(9);
		arr[2].next.next = new Node(10);
		arr[2].next.next.next = new Node(11);

		head = mergeKLists(arr, k - 1);
		printList(head);
	}
}

