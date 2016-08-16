package com.hand;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuxiaoli.entity.Address;
import com.yuxiaoli.entity.Customer;
import com.yuxiaoli.service.AddressService;
import com.yuxiaoli.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CustomerService customerService= (CustomerService) ctx.getBean("customerService", CustomerService.class);
        
        Scanner input=new Scanner(System.in);
        System.out.println("请输入FirstName(first_name):");
        String first_name=input.nextLine();
        System.out.println("请输入LastName(last_name):");
        String last_name=input.nextLine();
        System.out.println("请输入Email(email):");
        String email=input.nextLine();
        System.out.println("请输入Address ID:");
        int address_id=input.nextInt();
        
        //判断address_id是否输入正确
        AddressService addressService=ctx.getBean("addressService",AddressService.class);
        Address address=new Address();
        address=addressService.selectByID(address_id);
        while(address==null){
	        System.out.println("你输入的Address ID不存在，请重新输入！");
	        address_id=input.nextInt();
	        address=addressService.selectByID(address_id);
        }
        
        Customer customer=new Customer();
        customer.setStore_id(1);
        customer.setFirst_name(first_name);
        customer.setLast_name(last_name);
        customer.setEmail(email);
        customer.setAddress_id(address_id);
        Date date=new Date();
        customer.setCreate_date(date);
        customerService.addCustomer(customer);
        
        
        System.out.println("请输入要删除的Customer的ID");
        int customer_id=input.nextInt();
        //判断customer_id 是否存在
        Customer customer1=new Customer();
        customer1=customerService.selectCustomerById(customer_id);
        while(customer1==null){
        	System.out.println("你输入的customer_ID不存在，请重新输入！");
        	customer_id=input.nextInt();
        	customer1=customerService.selectCustomerById(customer_id);
        }
        
        
    }
}
