package CollectorsClass;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class CollectorsMethods 
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(8, 2, 5, 7, 3, 6);
         
        //collect() method returning List of OddNumbers
         
        List<Integer> oddNumbers = numbers.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
         
        System.out.println(oddNumbers);
         
        //OUTPUT : [5, 7, 3]
    }
}