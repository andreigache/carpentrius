package com.carpentrius.gui.entities;

@lombok.Getter
@lombok.Setter
@jakarta.persistence.Entity
public class Address {
	
	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Long id;
	
	@jakarta.persistence.ManyToOne
	@jakarta.persistence.JoinColumn(name = "customer_id")
	private Customer customer;
	
	@jakarta.persistence.Column(nullable = true)
	private String fullname;
	
	@jakarta.persistence.Column(nullable = true)
	private String street;
	
	@jakarta.persistence.Column(nullable = true)
	private String city;
	
	@jakarta.persistence.Column(nullable = true)
	private String state;
	
	@jakarta.persistence.Column(nullable = true)
	private String region;
	
	@jakarta.persistence.Column(nullable = true)
	private String postcode;
	
	@jakarta.persistence.Column(nullable = true)
	private String country;
	
	@jakarta.persistence.Column(nullable = true)
	private String countryIsoCode;

	@jakarta.persistence.Column(nullable = true)
	private String phone;
	
	
	public Address() {
	}

	
}
