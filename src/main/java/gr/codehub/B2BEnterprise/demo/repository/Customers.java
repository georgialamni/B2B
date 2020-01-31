package gr.codehub.B2BEnterprise.demo.repository;

import gr.codehub.B2BEnterprise.demo.model.Customer;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Customers {
    private List<Customer> customers;

    public Customers(){
        customers = new ArrayList<>();
    }

    public int addCustomer(Customer c){
        customers.add(c);
        return customers.size();
    }
}
