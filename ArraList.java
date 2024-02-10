import java.util.ArrayList;
import java.util.Collections;

public class ArraList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements in arrayList
        list.add(1);
        list.add(32);
        list.add(2);

        // add elements in middle
        list.add(2,4);

        // Replace element
        list.set(0, 65);

        // remove element
        list.remove(3);

        // for get list size
        int listSize = list.size();

        // for sorting
        Collections.sort(list);

        // get elements in arrayList
        System.out.println(list);

    }
}
