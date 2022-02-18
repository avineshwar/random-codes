class LLNode<String> {
    //public static void main(String[]args) {
    protected String info;
    protected LLNode<String> link;              //Link variable is used to store address of next variable 

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public LLNode<String> getLink() {
        return link;
    }

    public void setLink(LLNode<String> link) {
        this.link = link;
    }

    public LLNode(String info) {                // Info variable is uded to store info of data
        this.info = info;
        link = null;                              //INITIALLY NEW NODE WILL NOT BE POINTING ANYWHERE
    }

}

class LinkedList {
    protected LLNode<String> head;               // Head variable is uded to store value of first node

    public LLNode<String> getHead() {
        return head;
    }

    public void setHead(LLNode<String> head) {
        this.head = head;
    }

    public void addElement(String info) {
        LLNode node = new LLNode(info);            // As stated above info variable will now store new variable

        if (head == null) {                          // Empty list head saves address of new node
            this.head = node;
        } else {
            LLNode n = head;
            while (n.getLink() != null) {            // while loop will work upto the nth element of list
                n = n.getLink();
            }
            n.setLink(node);                     // LAST ELEMENT SAVES ADDRESS OF NEW NODE
        }


    }

    public void show() {                          // show method will print the list
        LLNode x = head;
        System.out.println("Name in the list:-");
        while (x.getLink() != null) {                 // when loop runs the address of every next elemnent starts to be updated upto the last
            System.out.print(" " + x.getInfo());
            x = x.getLink();
        }
        System.out.println(" " + x.getInfo());
    }

    public void reverse(LLNode head) {              // Recursion function is used to reverse the list
        if (head == null) {
            return;
        }
        reverse(head.getLink());                    // to reverse we call reverse function
        System.out.print(" " + head.getInfo());
    }
}

class Test {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();            // object creation for the test class to print the list
        list.addElement("Atul");
        list.addElement("Rani");
        list.addElement("Kiko");
        list.addElement("xiang");
        list.addElement("Yuchi");
        list.addElement("Priya");
        list.addElement("Thappar");
        list.addElement("James");
        list.addElement("kevin");

        list.show();                                  // To shgow the reversed list show method will be called.
        System.out.println("Names in list in reverse order:-");
        list.reverse(list.head);
    }

}
