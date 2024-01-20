package javaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {
        LinkedList<String>seasons = new LinkedList<>();
        seasons.add("Summer");
        seasons.add(0,"winter");
        seasons.addFirst("raining");
        seasons.addLast("sunning");
        System.out.println(seasons);


        // Traversing through a LinkedList
        Iterator<String> itr = seasons.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println(seasons.getFirst());

        System.out.println();

        for(String Winter: seasons){
            System.out.println(Winter);
        }
    }

}
