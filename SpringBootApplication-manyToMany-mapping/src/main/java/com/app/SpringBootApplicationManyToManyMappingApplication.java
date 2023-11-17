package com.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.entity.Customer;
import com.app.entity.Item;
import com.app.service.CustomerService;

@SpringBootApplication
public class SpringBootApplicationManyToManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationManyToManyMappingApplication.class, args);
	}
	@Autowired
	private CustomerService cusSer;
	



	@Override
	public void run(String... args) throws Exception {
		
		Item item=new Item("laptop",15);
		Item item2=new Item("mobile",899);
		Item item3=new Item("switchboard",877);
		Item item4=new Item("chairs",766);
		
		List<Item> asList = Arrays.asList(item,item2,item3,item4);
		Set<Item> items=new HashSet<>(asList);
		
		Item i1=new Item("watch",18);
		Item i2=new Item("trimmer",799);
		Item i3=new Item("mouse",89);
		Item i4=new Item("bed",78);
		List<Item> asList1 = Arrays.asList(i1,i2,i3,i4);
		Set<Item> items2=new HashSet<>(asList1);
		Customer cus1=new Customer("anil",15,items);
		Customer cus2=new Customer("naganika",13,items2);
		
		//cusSer.saveCustomer(cus1);
		//cusSer.saveCustomer(cus2);
		List<Customer> allCutomers = cusSer.getAllCutomers();
		System.out.println(allCutomers);
		
		
		
	}

}
