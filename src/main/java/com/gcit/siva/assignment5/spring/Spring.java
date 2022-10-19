package com.gcit.siva.assignment5.spring;


import com.gcit.siva.Assignment4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class Spring {


    @GetMapping("/country/searchByName")
    @ResponseBody
    public static String usingCountryName(@RequestParam String id) {
        return usingCountryName(id);

    }

    @GetMapping("/country/searchByCode")
    @ResponseBody
    public static String usingCountryCode(@RequestParam String id) {
        return usingCountryCode(id);

    }
}
