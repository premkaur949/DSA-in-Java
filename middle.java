import java.util.Vector;

class Node {
    int data;
    Node next;
      Node(int x) {
        data = x;
          next = null;
    }
}

public class Main {
    static void pushNode(Node[] head_ref, int data_val)
    {
        Node new_node = new Node(data_val);
        new_node.next = head_ref[0];
        head_ref[0] = new_node;
    }

    static int getMiddle(Node head)
    {
        Vector<Integer> v = new Vector<>();
       
        while (head != null) {
            v.add(head.data);
            head = head.next;
        }
        int middleIdx = v.size() / 2;
        return v.get(middleIdx);
    }

    public static void main(String[] args)
    {
        Node[] head = new Node[1];
        for (int i = 5; i > 0; i--) {
            pushNode(head, i);
        }

        System.out.println(
            "Middle Value Of Linked List is : "
            + getMiddle(head[0]));
    }
}
