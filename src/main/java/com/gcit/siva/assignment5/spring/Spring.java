package com.gcit.siva.assignment5.spring;

import com.gcit.siva.Assignment4;
import org.springframework.web.bind.annotation.*;

@RestController
public class Spring {

    @GetMapping("/country/searchByName")
    @ResponseBody
    public static String usingCountryName(@RequestParam String id) {
        return Assignment4.usingCountryName(id);

    }

    @GetMapping("/country/searchByCode")
    @ResponseBody
    public static String usingCountryCode(@RequestParam String id) {
        return Assignment4.usingCountryCode(id);

    }
}
