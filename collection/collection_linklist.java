/*
    1.itimplements the Collection interface.
    2.It uses a doubly linked list internally
        to store the elements. 
    3.It can store the duplicate elements.
    4.It maintains the insertion order.
    5.it does not synchronized.
    6. no shifting is required
 */ 

import java.util.*;

class collection_linklist {
    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}