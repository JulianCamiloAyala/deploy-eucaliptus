package com.eucaliptus.springboot_app_person.utlities;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServicesUri {

    public static String AUTH_SERVICE;
    public static String PRODUCT_SERVICE;
    public static String FRONT_URL;


    @Value("${services.authentication}")
    private String authentication;

    @Value("${services.product}")
    private String product;

    @Value("${services.front.baseUrl}")
    private String front;

    @PostConstruct
    public void init() {
        AUTH_SERVICE = authentication;
        PRODUCT_SERVICE = product;
        FRONT_URL = front;
    }


}