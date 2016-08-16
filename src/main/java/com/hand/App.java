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
        System.out.println("������FirstName(first_name):");
        String first_name=input.nextLine();
        System.out.println("������LastName(last_name):");
        String last_name=input.nextLine();
        System.out.println("������Email(email):");
        String email=input.nextLine();
        System.out.println("������Address ID:");
        int address_id=input.nextInt();
        
        //�ж�address_id�Ƿ�������ȷ
        AddressService addressService=ctx.getBean("addressService",AddressService.class);
        Address address=new Address();
        address=addressService.selectByID(address_id);
        while(address==null){
	        System.out.println("�������Address ID�����ڣ����������룡");
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
        
        
        System.out.println("������Ҫɾ����Customer��ID");
        int customer_id=input.nextInt();
        //�ж�customer_id �Ƿ����
        Customer customer1=new Customer();
        customer1=customerService.selectCustomerById(customer_id);
        while(customer1==null){
        	System.out.println("�������customer_ID�����ڣ����������룡");
        	customer_id=input.nextInt();
        	customer1=customerService.selectCustomerById(customer_id);
        }
        
        
    }
}
