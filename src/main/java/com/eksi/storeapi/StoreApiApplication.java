package com.eksi.storeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApiApplication {

    public static String BASE_URL = "localhost:8080/";

    public static void main(String[] args) {
        SpringApplication.run(StoreApiApplication.class, args);
    }

}
