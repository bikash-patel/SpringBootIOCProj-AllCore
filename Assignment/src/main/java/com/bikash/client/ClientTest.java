package com.bikash.client;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bikash.configuration.WishMsgConfig;
import com.bikash.sbeans.WishMessageGenerator;

public class ClientTest 
{
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(WishMsgConfig.class);
        WishMessageGenerator wmg1=acac.getBean("wishMessageGenerator",WishMessageGenerator.class);
        WishMessageGenerator wmg2=acac.getBean("wishMessageGenerator",WishMessageGenerator.class);
        
        System.out.println(wmg1.hashCode()+"..."+wmg2.hashCode());
        System.out.println("wmg1==wmg2 ? "+(wmg1==wmg2));
        
        System.out.println(acac.getBeanDefinitionCount());
        System.out.println(Arrays.toString(acac.getBeanDefinitionNames()));
        acac.close();
	}
}
