public class LL {

    Node head;

    // node class
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
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
        
    }

    public static void main(String[] args) {
        LL linkLList = new LL();
        linkLList.addFirst("a");
        linkLList.addFirst("n");
        linkLList.addFirst("o");

        
    }
}
