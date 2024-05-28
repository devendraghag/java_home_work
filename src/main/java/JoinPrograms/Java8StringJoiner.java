package JoinPrograms;
import java.util.StringJoiner;
 
public class Java8StringJoiner 
{
    public static void main(String[] args) 
    {
        StringJoiner stringJoiner = new StringJoiner(" | ");
         
        stringJoiner.add("Facebook");
         
        stringJoiner.add("Twitter");
         
        stringJoiner.add("YouTube");
         
        stringJoiner.add("WhatsApp");
         
        stringJoiner.add("LinkedIn");
         
        System.out.println(stringJoiner);
    }
}