package com.gcit.siva.assignment5.web;

import com.gcit.siva.Assignment4;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
@RestController
public class Web {
    private Assignment4 assignment4;
    public Web() throws IOException {
      assignment4 = new Assignment4();
    }
    @RequestMapping(path = "/country/searchByName/{name}", method = RequestMethod.GET)
    public  String usingCountryName(@PathVariable String name) {
        return assignment4.usingCountryName(name);
    }
    @RequestMapping(path = "/country/searchByCode/{code}" , method = RequestMethod.GET)
    public String usingCountryCode(@PathVariable String code) {
        return assignment4.usingCountryCode(code);
    }
}
