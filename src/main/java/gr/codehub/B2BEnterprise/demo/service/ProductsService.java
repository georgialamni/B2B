package gr.codehub.B2BEnterprise.demo.service;

import gr.codehub.B2BEnterprise.demo.model.Product;
import gr.codehub.B2BEnterprise.demo.repository.Products;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductsService {

    public Products getProducts() {

        int code = 0;
        String name = null;
        double grossPrice = 0;
        int quantity = 0;
        Products products = new Products();

        String csvFile = "products.csv";
        String line = " ";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String [] product = line.split(",");
                Product p = new Product(Integer.parseInt(product[0]), product[1], Double.parseDouble(product[2]),Integer.parseInt(product[3]));
                products.addProducts(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
