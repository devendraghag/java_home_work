package java16;

import java.util.Objects;

public class Customer{

    private String name;
    private int age;

    public Customer(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
