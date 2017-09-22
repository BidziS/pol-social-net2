package com.cudnik;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bidzis on 9/8/2017.
 */
@RestController
public class Greeting {

    @RequestMapping("/greeting")
    public String greeting() {
        return "Welcome!";
    }

}
