package MemoryRelated;

class StackAndHeapMemory
{
     static void methodOne()
     {
          System.out.println("From Method One");
          methodTwo();
     }
 
     static void methodTwo()
     {
          System.out.println("From Method Two");
     }
 
     public static void main(String[] args)
     {
          System.out.println("Main Method Started");
          methodOne();
          System.out.println("Main Method Ended");
     }
}