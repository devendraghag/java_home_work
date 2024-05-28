package HashMapPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
 
public class SortMapByValuesProgram3
{
    public static void main(String[] args) 
    {
        //Define one HashMap called idNameMap
         
        Map<Integer, String> idNameMap = new HashMap<Integer, String>();
         
        //Insert Id-Name pairs into idNameMap
         
        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");
         
        //Java 8 sorting using Entry.comparingByValue()
         
        Map<Integer, String> sortedIdNameMap 
        = idNameMap.entrySet()
                   .stream()
                   .sorted(Collections.reverseOrder(Entry.comparingByValue()))
                   
                 // OR  
                 // .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                    
                   .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,  e2) -> e1, LinkedHashMap::new));
 
         
        //Print idNameMap before and after sorting
         
        System.out.println("Before Sorting : ");
         
        System.out.println(idNameMap);
         
        System.out.println("After Sorting : ");
         
        System.out.println(sortedIdNameMap);
    }
}