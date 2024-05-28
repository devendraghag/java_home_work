package java11;

public class StripMethod {
    public static void main(String[] args)
    {
        System.out.println("   1   ".strip());
        System.out.println("\t A \t".strip());
        System.out.println("\n A1 \n".strip());
        System.out.println("1   A".strip());

        System.out.println("    1".stripLeading());
        System.out.println("   11".stripLeading());
        System.out.println("  111".stripLeading());
        System.out.println(" 1111".stripLeading());

        System.out.println("   1    ".stripTrailing());
        System.out.println("  11    ".stripTrailing());
        System.out.println(" 111    ".stripTrailing());
        System.out.println("1111    ".stripTrailing());
    }
}
