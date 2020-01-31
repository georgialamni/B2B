package gr.codehub.B2BEnterprise.demo.repository;

import gr.codehub.B2BEnterprise.demo.model.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Products {
    private List<Product> products;

    public  Products (){
        products = new ArrayList<>();
    }

    public int addProducts(Product p){
        products.add(p);
        return products.size();
    }

}
