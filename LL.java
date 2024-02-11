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
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode != null ) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // print linklist 
    public void print(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null){
            System.out.println(curNode.data + " ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL linkLList = new LL();
        linkLList.addFirst("a");
        linkLList.addFirst("n");
        linkLList.addFirst("o");
        linkLList.addLast("n");
        linkLList.addLast("t");

    }
}


// public class LL {
//     Node head;
//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = next;
//         }
//     }
//     // add first
//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }
//     // add last 
//     public void addLast(String data){
//         Node newNode = new Node(data);
//     }
//     public static void main(String[] args) {
//         LL lk = new LL();
//     }
// }