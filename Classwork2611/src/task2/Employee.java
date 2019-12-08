package task2;
//In the main() method declare map employeeMap of pairs <Integer, String>.
//Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
//Ask user to enter ID, then find and write corresponding name from your map.
// If you can't find this ID - say about it to user (use function containsKey()).
//Ask user to enter name, verify than you have name in your map and write corresponding ID.
// If you can't find this name - say about it to user (use function containsValue()).
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Employee {
    public static void main(String[] args) throws IOException {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     Map<Integer,String> employeeMap = new HashMap<Integer, String>();
     employeeMap.put(10,"Sergijenko");
     employeeMap.put(11,"Sergijenko");
     employeeMap.put(12,"Melenevych");
     employeeMap.put(13,"Partyka");
     employeeMap.put(14,"Kolodii");
     employeeMap.put(15,"Avramenko");
     employeeMap.put(16,"Moroz");
     System.out.println(employeeMap);


     getNameFromMap(employeeMap,reader);
     getIDEmployee(employeeMap,reader);
    }
    public static void getNameFromMap(Map<Integer,String> hashMap,BufferedReader reader) throws IOException {

        System.out.println("Enter ID emplooyee (two-digit number): ");
        int id = Integer.parseInt(reader.readLine());
        if (hashMap.containsKey(id)){
            System.out.println("This employee name is " + hashMap.get(id));
        }else {
            System.out.println("There is no employee with this ID in the list");
        }

    }
    public static void getIDEmployee(Map<Integer,String> hashMap, BufferedReader reader) throws IOException {
        System.out.println("Enter last name employee, please : ");
        String name = reader.readLine();
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry myMap = (Map.Entry)iterator.next();
            if (myMap.getValue().equals(name)) {
                System.out.println("ID is: "+ myMap.getKey() +", lastName is: "+myMap.getValue());
            }if(!hashMap.containsValue(name)){
                System.out.println("There is no employee with this last name in the list");
               break;
            }
        }
    }
}




    /*public static void getIDEmployee(HashMap<Integer,String> hashMap,BufferedReader reader) throws IOException {
        System.out.println("Enter last name employee, please : ");
        String name = reader.readLine();
        Set<K> keys = new HashSet<>();
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                keys.add(key);
            }
        }
        return keys;*/


        //if (hashMap.containsValue(name)){
           // System.out.println("This employee id is " + entry.getKey());
        //}else {
            //




