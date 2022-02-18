class LLNode {
    public String data;
    public LLNode next;

    public LLNode(String d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    protected LLNode head;

    public LLNode getHead() {
        return head;
    }

    public void setHead(LLNode head) {
        this.head = head;
    }

    public void addElement(String data) {
        LLNode node = new LLNode(data);
        if (head == null) {
            this.head = node;
            return;
        }
        LLNode tracerNode = head; // helps us to reach the last node starting from head
        while (tracerNode.next != null) {
            tracerNode = tracerNode.next;
        }
        tracerNode.next = node; // last node's next points to new node
    }

    public void show() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        LLNode tracerNode = head; // helps us to traverse the list starting from head
        System.out.print(tracerNode.data); // print the first node
        tracerNode = tracerNode.next;
        while (tracerNode.next != null) {
            System.out.print(" " + tracerNode.data);
            tracerNode = tracerNode.next;
        }
    }
}

class Test {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addElement("A");
        list.addElement("B");
        list.addElement("C");
        list.addElement("D");
        list.addElement("E");
        list.addElement("F");

        list.show();
    }
}
