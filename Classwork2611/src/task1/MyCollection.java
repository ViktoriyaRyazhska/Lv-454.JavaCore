package task1;

//Declare collection myCollection of 10 integers and fill it (from the console or random).
// Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
// Remove from collection myCollection elements, which are greater then 20. Print result
//Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
// Sort and print collection
// Use one or more of the next Collections: List, ArrayList, LinkedList

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class MyCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i<10 ; i++) {
            list.add(random.nextInt(10)+ 4);
        }
        System.out.println("Before sorting " + list);
        ArrayList<Integer> newList =  new ArrayList<>();//(ArrayList<Integer>) list.clone();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
                Integer number = iterator.next();
                    if (number <5) {
                 iterator.remove();
                    }else{
                        newList =  (ArrayList<Integer>) list.clone();
                    }
               }
        //System.out.println("ArrayList After : " + list);
        System.out.println("New Collection "+ newList);
        newList.add(1,1);
        newList.add(4,-4);
        newList.add(7,-3);
        //System.out.println(newList);
        for (int i = 0; i <newList.size() ; i++) {
            System.out.println("Position " + (i+1) + " value of element = " + newList.get(i));
        }
        Collections.sort(newList);
        System.out.println("After sorting " + newList);
        }
}

