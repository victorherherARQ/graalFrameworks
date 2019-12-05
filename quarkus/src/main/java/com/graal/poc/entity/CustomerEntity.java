package com.graal.poc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity(name="customer")
public class CustomerEntity extends PanacheEntity {
	@Column
	public Long id;
	@Column
	public Date signup_date;
	@Column
	public String email;

}
