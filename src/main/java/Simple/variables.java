package Simple;

public class variables {
    static int staticValue = 11;
    int instanceValue = 22;
    static void variableMethod(int LocalValue){
        System.out.println("Local variable " + LocalValue);
    }
    public static void main(String[] args) {
        variableMethod(11);
        System.out.println("Static variable " + staticValue);
        System.out.println("Instance variable " + new variables().instanceValue);
    }
}
