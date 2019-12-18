package task3;
        /*Read context from file into array of strings.
        Each array item contains one line from file.
        Complete next tasks:
        1) count and write the number of symbols in every line.
        2) find the longest and the shortest line.
        3) find and write only that lines, which consist of word «var»*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Gazik 0687617017\\homeworks\\ClassworkThread\\src\\mytext.txt");
        List<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            arrayList.add(scanner.nextLine());
        }
        List<Integer>characterCountList = new ArrayList<>();
        for (String string: arrayList) {
            characterCountList.add(string.length());
        }System.out.println(characterCountList);
       getLongestLine(characterCountList);
       getShortestLine(characterCountList);
       getLineContainWord(arrayList);
    }
        public static void getLongestLine (List<Integer>array){
         int longestLine= array.get(0);
         int imax = 0;
         int i=0;
            while (i < array.size()) {
                if (array.get(i) > longestLine) {
                    longestLine = array.get(i);
                    imax = i;
                }
                i++;
            }
            System.out.print("Longest line have " + longestLine + " symbols.");
            System.out.println(" It is in line number " + (imax + 1)+".");
    }
    public static void getShortestLine (List<Integer>array){
        int shortestLine= array.get(0);
        int imin = 0;
        int i=0;
        while (i < array.size()) {
            if (array.get(i)< shortestLine) {
                shortestLine = array.get(i);
                imin = i;
            }
            i++;
        }
        System.out.print("Shortest line have " + shortestLine + " symbols.");
        System.out.println(" It is in line number " + (imin + 1) + ".");
    }
       public static void getLineContainWord(List<String>list){
           String word = " var";
           for (String string:list) {
               if (string.contains(word)){
               System.out.println(string);
               }
           }
       }
}


