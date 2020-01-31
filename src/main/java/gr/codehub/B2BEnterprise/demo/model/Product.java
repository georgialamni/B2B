package gr.codehub.B2BEnterprise.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int code;
    private String name;
    private double grossPrice;
    private int quantity;
}
