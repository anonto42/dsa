

// // ther ara 3 kind of link list is in the programing 

// public class Linklist {
//     Node head;

//     class Node {
//         String data;
//         Node next;
        
//         Node(String data ){
//             this.data = data;
//             this.next = null;
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
//         if (head == null){
//             head = newNode;
//             return;
//         }
        
//         Node currNode = head;
//         while (currNode.next != null) {
//             currNode = currNode.next;
//         }
//     }
//     // print list 
//     public void printList(){

//         if(head == null){
//             System.out.println("List is empty");
//             return;
//         }
//         Node currNode = head;
//         while (currNode != null){
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }
//         System.out.println("NULL");
//     }
//     public static void main(String[] args) {
//         Linklist linklist = new Linklist();
//         linklist.addFirst("a");
//         linklist.addFirst("is");
//         linklist.printList();
//         linklist.addLast("thisLast");
//         linklist.printList();
//     }
    
// } 






public class Linklist {
    
    Node head;

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
        if (head == null) {
            head = newNode;
            return;
        }
            Node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        
    }
    // print list
    public void printNode(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode+ "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.addFirst("a");
        list.addFirst("is");
        // list.addLast("anonto");
        list.printNode();

    }
}
