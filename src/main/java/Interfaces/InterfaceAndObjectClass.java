package Interfaces;

interface A {
    @Override
    public boolean equals(Object obj);
    @Override
    public int hashCode();
    @Override
    public String toString();
}

class InterfaceAndObjectClass {
    public static void main(String[] args) {
        A a = null;
        a.equals(null);
        a.hashCode();
        a.toString();
    }
}