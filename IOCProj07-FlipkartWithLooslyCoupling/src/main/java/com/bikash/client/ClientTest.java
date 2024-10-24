package com.bikash.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bikash.commons.Flipkart;
import com.bikash.configuration.FlipkartConfig;

public class ClientTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(FlipkartConfig.class);
        Flipkart flipKart=acac.getBean("flkt",Flipkart.class);
        String msg=flipKart.shopping(new String[] {"Dhoti","Genji","Perfume"},new double[] {700.0,300.0,500.0});
        System.out.println(msg);
        acac.close();
    }
}
