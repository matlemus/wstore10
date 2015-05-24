package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{
private List<Customer> listOfCustomers = new ArrayList<Customer>();

public InMemoryCustomerRepository(){
	Customer nanotechMx = new Customer("10","Nanotechnology S.A., MX","Ave Revolucion 2000","10");
	Customer propasa = new Customer("20","Productora de papel S.A., MX","Ave Cuahutenmoc 4000","10");
	Customer minsa = new Customer("30","Minsa del golfo MX","Ave Eugenio Garza Sada 1000","10");
	Customer ieqsa = new Customer("40","IEQSA del norte golfo MX","Ave Eugenio Garza Sada 2700","10");
	Customer pgmex = new Customer("50","Procter & Gamble de Mexico","Ave Eugenio Garza Sada 5600","10");
	Customer absormex = new Customer("60","Absormex del norte MX","Ave Guerrero 6100","10");
	Customer lamosa = new Customer("70","Laminas y aceros S.A.","Ave Gral. Anaya 3600","10");
	Customer famosa = new Customer("80","Fabricas de Monterrey S.A.","Ave Eugenio Garza Sada 8010","10");
	Customer jdv = new Customer("90","Jugos del Valle S.A.","Ave Valle de Mexico 4011","10");
	Customer kof = new Customer("100","KOF Coca Cola Company S.A.","Tek Morelia Michoacan 4011","10");


listOfCustomers.add(nanotechMx);
listOfCustomers.add(propasa);
listOfCustomers.add(minsa);
listOfCustomers.add(ieqsa);
listOfCustomers.add(pgmex);
listOfCustomers.add(absormex);
listOfCustomers.add(lamosa);
listOfCustomers.add(famosa);
listOfCustomers.add(jdv);
listOfCustomers.add(kof);
}
	public List<Customer> getAllCustomers() {		// 
		return listOfCustomers;
	}

	public Customer getCustomerById(String customerId) {
	
		Customer customerById = null;
		for (Customer customer : listOfCustomers){
				if(customer!=null){
					customerById = customer;
					break;
				}
			
		}
		if(customerById == null){
			throw new IllegalArgumentException("No customer found with the customer id:"+ customerById);
		}
		return customerById;	
	}

}
