package gr.codehub.B2BEnterprise.demo.service;

import gr.codehub.B2BEnterprise.demo.model.Customer;
import gr.codehub.B2BEnterprise.demo.repository.Customers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomersService {

    public Customers getCustomers() {

        int code = 0;
        String title = null;
        String city = null;
        String description = null;
        Customers customers = new Customers();

        String csvFile = "customers.csv";

        String line = " ";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] customer = line.split(",");
                Customer c = new Customer(Integer.parseInt(customer[0]), customer[1], customer[2],customer[3]);
                customers.addCustomer(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
