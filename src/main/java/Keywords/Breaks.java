package Keywords;

public class Breaks
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println(i);

            if(i == 50)
            {
                break;
            }
        }
    }
}