/*
Generics, Arrays and Containers
Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface.
Each Link object in the list should contain a reference to the next element in the list, but not the previous one
(LinkedList, in contrast, is a doubly linked list, which means it maintains links in both directions).
Create your own SListIterator which, again for simplicity, does not implement ListIterator. The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.
The only way to insert and remove elements from an SList is through SListIterator. Write code to demonstrate SList.
 */
public class Assignment10 {
    public static void main(String[] args) {
        SList sList = new SList();
        SListIterator sListIterator = sList.iterateList();
        System.out.print(sList);
        sListIterator.insertNode("100");
        sListIterator.insertNode("10");
        System.out.println(sList);
        SListIterator sListIterator2 = sList.iterateList();
        sListIterator2.insertNode("25");
        sListIterator2.deleteNode();
        System.out.println(sList);
    }
}

 class Node {
    String data;
    Node next;

    Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(String data) {
        this(data, null);
    }

    public String toString() {
        if (data == null)
            return "null";
        return data;
    }
}
 class SList {
    Node head = new Node(null);

    public SListIterator iterateList() {
        return new SListIterator(head);
    }

    public String toString() {

        SListIterator iterator = this.iterateList();
        StringBuilder s = new StringBuilder();
        while (iterator.hasNext()) {
            s.append(iterator.next() + (iterator.hasNext() ? ", " : ""));
        }
        return s.toString().length() != 0 ? s.toString() : "Empty list\n";
    }
}

class SListIterator {
    Node temp;

    SListIterator(Node node) {
        this.temp = node;
    }

    public Node next() {
        temp = temp.next;
        return temp;
    }

    public boolean hasNext() {
        return temp.next != null;
    }

    public void insertNode(String data) {
        temp.next = new Node(data, temp.next);
        temp = temp.next;
    }

    public void deleteNode() {
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}