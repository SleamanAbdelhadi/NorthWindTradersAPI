package com.pluralsight.NorthWindTradersAPI;

import models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @RequestMapping (path = "/products",method = RequestMethod.GET )
    public List <Product> findAll() {

        List<Product> results = new ArrayList<>();
        results.add(    new Product(1, "Great stuff", 2, 10.50 )   );
        results.add(    new Product(2, "Wonderful stuff", 3, 11.50 )   );
        results.add(    new Product(3, "Incredible stuff", 4, 12.50 )   );
        return results;
    }

}
