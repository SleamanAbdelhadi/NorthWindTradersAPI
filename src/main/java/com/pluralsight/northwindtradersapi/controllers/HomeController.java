package com.pluralsight.NorthWindTradersAPI;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping (path="/")

    String home(@RequestParam (defaultValue = "world") String country) {

        return "Hello" + country;

    }


}
