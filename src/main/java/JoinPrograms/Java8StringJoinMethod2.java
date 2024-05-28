package JoinPrograms;

public class Java8StringJoinMethod2
{
    public static void main(String[] args) 
    {
        String[] strArray = new String[] {"Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn"};
         
        String joinedString = String.join(" | ", strArray);
         
        System.out.println(joinedString);
    }
}