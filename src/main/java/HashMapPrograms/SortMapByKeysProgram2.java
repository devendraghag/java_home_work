package HashMapPrograms;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
 
public class SortMapByKeysProgram2
{
    public static void main(String[] args) 
    {
        Map<String, Integer> studentMap = new HashMap<String, Integer>();
         
        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);
                 
        Map<String, Integer> sortedStudentMap = new TreeMap<>(Collections.reverseOrder());
                 
        sortedStudentMap.putAll(studentMap);
         
        System.out.println("Before Sorting : ");
         
        System.out.println(studentMap);
         
        System.out.println("After Sorting : ");
         
        System.out.println(sortedStudentMap);
    }
}