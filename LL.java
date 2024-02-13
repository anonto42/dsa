public class LL {

    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    // node class
    class Node{

        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
            size ++;
        }

    }
    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add last 
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null ) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // print linklist 
    public void print(){
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null){
            System.out.println(curNode.data + " ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }
    // delet first 
    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size --;
        head = head.next;
    }
    // delet last 
    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }size --;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secodLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secodLast = secodLast.next;
        }
        secodLast.next = null;
    }
    public int getSize(){
        return size;
    }
    // revarce itarate
    public void revarceIterate(){
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update 
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

        public static void main(String[] args) {
            LL linkLList = new LL();
            linkLList.addFirst("a");
            linkLList.addFirst("n");
            linkLList.addFirst("o");
            linkLList.addLast("n");
            linkLList.addLast("t");
            // linkLList.print();
            // linkLList.deleteFirst();
            // linkLList.print();
            // linkLList.deleteLast();
            // linkLList.print();

    }
}
