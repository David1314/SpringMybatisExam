package com.hand;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuxiaoli.entity.Customer;
import com.yuxiaoli.service.CustomerService;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yuxiaoli/config/ApplicationContext.xml");
      CustomerService customerService= (CustomerService) ctx.getBean("customerService", CustomerService.class);
      Customer customer=new Customer();
      customer.setStore_id(1);
      customer.setFirst_name("yu");
      customer.setLast_name("xiaoli");
      customer.setEmail("123@gmail.com");
      customer.setAddress_id(3);
      Date date=new Date();
      customer.setCreate_date(date);
      
      customerService.addCustomer(customer);
      System.out.println("≤Â»Î≥…π¶£°");
    }
}
