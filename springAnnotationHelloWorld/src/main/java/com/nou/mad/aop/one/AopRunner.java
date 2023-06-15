package com.nou.mad.aop.one;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopRunner {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("one/customer.xml");
        CustomerService customerService = (CustomerService)applicationContext.getBean("customerService");
        customerService = (CustomerService)applicationContext.getBean("customerServiceProxy");
        System.out.println(customerService.getClass());
        customerService.printName();
        customerService.printUrl();
    }
}
