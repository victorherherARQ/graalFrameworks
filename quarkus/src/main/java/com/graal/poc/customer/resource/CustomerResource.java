package com.graal.poc.customer.resource;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.graal.poc.customer.entity.CustomerEntity;
import com.graal.poc.customer.repository.CustomerRepository;

import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class CustomerResource {

	@Inject
	CustomerRepository customerRepository;
	private final Logger log = LoggerFactory.getLogger(CustomerResource.class);

	@GET
	@Path("/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerEntity getCustomer(@PathParam("email") String email) {

		CustomerEntity customerEntity = customerRepository.findByEmail(email);
		log.info("Returning Entity.....");
		return customerEntity;
	}

	@POST
	@Path("/{email}")
	@Transactional
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerEntity postCustomer(@PathParam("email") String email) {

		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.email = email;
		customerRepository.persist(customerEntity);
		log.info("Persisting Entity.....");
		return customerEntity;
	}
	
	@DELETE
	@Path("/{email}")
	@Transactional
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteCustomer(@PathParam("email") String email) {

		//CustomerEntity customerEntity = new CustomerEntity();
		//customerEntity.email = email;
		customerRepository.delete("email",email);
		log.info("Deleting Entity.....");
		//return customerEntity;
	}

}