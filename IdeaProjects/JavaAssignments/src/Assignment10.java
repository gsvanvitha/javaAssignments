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