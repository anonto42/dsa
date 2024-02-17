import java.util.*;;

public class STK {

    public static void pushAtBottom(int data , Stack<Integer> s){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {


        Stack<Integer> list = new Stack<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        pushAtBottom(8, list);

        while (!list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }
    }
    
}
