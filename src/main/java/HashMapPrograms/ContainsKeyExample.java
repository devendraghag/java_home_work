package HashMapPrograms;
import java.util.HashMap;
import java.util.Map;
 
/**
 * 
 * A simple Java Program to check if HashMap contains a given key or value or not
 * in Java.
 */
public class ContainsKeyExample {
 
  public static void main(String[] args) {
 
    // let's create a Map which maps id to name
    Map<Integer, String> idToName = new HashMap<>();
 
    idToName.put(100, "James");
    idToName.put(101, "Jack");
    idToName.put(102, "Jasmin");
    idToName.put(103, "Joe");
    idToName.put(104, "Joshua");
 
    // now let's check if a key or Id 200 is present in Map
    boolean isId200Exists = idToName.containsKey(200);
    boolean isId100Exists = idToName.containsKey(100);
 
    System.out.println("Is key 200 exists in the map? " + isId200Exists);
    System.out.println("Is key 100 exists in the Hashmap? " + isId100Exists);
 
    // now let's check if a value or name is present in Map
    boolean isJimmyExists = idToName.containsValue("Jimmy");
    boolean isJoeExists = idToName.containsValue("Joe");
 
    System.out.println("Is value Jimmy exists in the map? " + isJimmyExists);
    System.out.println("Is value Joe exists in the Hashmap? " + isJoeExists);
 
  }
 
}