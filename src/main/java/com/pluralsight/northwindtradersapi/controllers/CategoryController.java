package com.pluralsight.NorthWindTradersAPI;

import models.Category;
import models.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> findAll() {

        List<Category> results = new ArrayList<>();

        results.add(new Category(1, "Condiments"));

        results.add(new Category(2, "Beverages"));

        return results;
    }

}
