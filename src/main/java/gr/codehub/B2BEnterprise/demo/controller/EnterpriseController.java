package gr.codehub.B2BEnterprise.demo.controller;

import gr.codehub.B2BEnterprise.demo.model.Customer;
import gr.codehub.B2BEnterprise.demo.model.Product;
import gr.codehub.B2BEnterprise.demo.repository.Customers;
import gr.codehub.B2BEnterprise.demo.repository.Products;
import gr.codehub.B2BEnterprise.demo.service.CustomersService;
import gr.codehub.B2BEnterprise.demo.service.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnterpriseController {


    @GetMapping("customers")
    public Customers getCustomers() {
        CustomersService sc = new CustomersService();
        return sc.getCustomers();
    }

    @GetMapping("products")
    public Products getProducts() {
        ProductsService sc = new ProductsService();
        return sc.getProducts();
    }

    @GetMapping("customers/{id}")
    public Customer getCustomer(@PathVariable int id) {
        CustomersService sc = new CustomersService();
        Customers customers =  sc.getCustomers();
        for(Customer c: customers.getCustomers()){
            System.out.println(c.toString());
        }
        for(int i = 0; i < customers.getCustomers().size(); i++){
            if(customers.getCustomers().get(i).getCode() == id) return customers.getCustomers().get(i);
        }
        return null;
    }

    @GetMapping("products/{id}")
    public Product getProducts(@PathVariable int id) {
        ProductsService sc = new ProductsService();
        Products products =  sc.getProducts();
        for(int i = 0; i < products.getProducts().size(); i++){
            if(products.getProducts().get(i).getCode() == id) return products.getProducts().get(i);
        }
        return null;
    }
}
