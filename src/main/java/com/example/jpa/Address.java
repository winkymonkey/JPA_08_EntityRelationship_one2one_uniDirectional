package com.example.jpa;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "T_ADDRESS")
public class Address {
	
	private Customer customer;
	
	//Getter, Setter
}
