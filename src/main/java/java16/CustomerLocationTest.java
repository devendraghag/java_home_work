package java16;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class CustomerLocationTest {

    public static void main(String[] args) {

        //Compound key.
        Map<CustomerLocation,LocalDateTime> customerLocations = getCustomerLocation();

        LocalDateTime lastSpotted = customerLocations.get(
                new CustomerLocation(new Customer("Amit",35),
                        new Location("India","New Delhi")));

        System.out.println("Last Spotted on : "+lastSpotted);
    }


    private static Map<CustomerLocation,LocalDateTime> getCustomerLocation(){
        var customerLocationVisited = new HashMap<CustomerLocation, LocalDateTime>();

        //Ben
        var uk = new Location("UK","London");
        var ben = new CustomerLocation(new Customer("Ben",30),uk);

        customerLocationVisited.put(ben,LocalDateTime.now());

        //Emily
        var emily = new CustomerLocation(new Customer("Emily",30),uk);
        customerLocationVisited.put(emily,LocalDateTime.now().minusDays(1));

        //Amit
        var india = new Location("India","New Delhi");
        var amit = new CustomerLocation(new Customer("Amit",35),india);
        customerLocationVisited.put(amit,LocalDateTime.now().minusDays(2));

        return customerLocationVisited;
    }
}
