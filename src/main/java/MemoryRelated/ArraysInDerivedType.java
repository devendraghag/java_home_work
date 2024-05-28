package MemoryRelated;

class A1
{
    int i;
}

public class ArraysInDerivedType
{
    public static void main(String[] args)
    {
        A1[] a;                  //Declaring array reference variable of A-type which will be referring to an array object containing references to A-type objects

        a = new A1[5];           // One array object which can hold 5 references to class A-type objects is created. Please remember that, in this statement only an array object is created not 5 objects of class A-type are created

        a[1] = new A1();         //Creating an object of A-type and assigning it to element at index 1

        a[3] = new A1();         //Creating an object of A-type and assigning it to element at index 3
    }
}