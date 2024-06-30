package com.carpentrius.gui.entities;

import java.util.Date;

@lombok.Getter
@lombok.Setter
@jakarta.persistence.Entity
public class Customer {
	
	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Long id;
	
	@jakarta.persistence.ManyToOne
	@jakarta.persistence.JoinColumn(name = "organization_id")
	private Organization organization;
	
	@jakarta.persistence.Enumerated(jakarta.persistence.EnumType.STRING)
	@jakarta.persistence.Column(nullable = true)
	private SocialType socialTitle;
	
	@jakarta.persistence.Column(nullable = true)
	private String fullName;
	
	@jakarta.persistence.Column(nullable = true)
	private String indentificationNumber;
	
	@jakarta.persistence.Column(nullable = true)
	private String vatNumber;
	
	@jakarta.persistence.Column(nullable = true)
	private String email;
	
	@jakarta.persistence.Column(nullable = true)
	private String website;
	
	@jakarta.persistence.Column(nullable = true)
	private String mobilePhone1;
	
	@jakarta.persistence.Column(nullable = true)
	private String mobilePhone2;
	
	@jakarta.persistence.Column(nullable = true)
	private String homePhone;
	
	@jakarta.persistence.Column(nullable = true)
	private String workPhone;
	
	@jakarta.persistence.Temporal(jakarta.persistence.TemporalType.TIMESTAMP)
	@jakarta.persistence.Column(name = "creation_date")
	private Date creationDate;
	
	@jakarta.persistence.Temporal(jakarta.persistence.TemporalType.TIMESTAMP)
	@jakarta.persistence.Column(name = "last_update")
	private Date lastUpdate;
	
}
