package com.gcit.siva.assignment5;

import com.gcit.siva.Assignment4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Assignment5Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Assignment5Application.class, args);
		Assignment4.main(null);
	}

}
