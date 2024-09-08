package C_09082024.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab99 {
    public static void main(String[] args) {
        Queue pq1=new PriorityQueue();
        pq1.add("B");
        pq1.add("A");
        pq1.add("C");
        pq1.add("C");
        pq1.add("D");
//        pq1.add(null);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println(pq1);

        Iterator iterator=pq1.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next()+" ");
        }
        System.out.println(pq1);
    }
}
