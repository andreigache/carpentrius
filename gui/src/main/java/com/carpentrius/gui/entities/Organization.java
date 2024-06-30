package com.carpentrius.gui.entities;

@jakarta.persistence.Entity
public class Organization {
	
	
	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Long id;
	
	@jakarta.persistence.ManyToOne
	@jakarta.persistence.JoinColumn(name = "parent_organization_id", nullable = true)
	private Organization parentOrganization;
	
	@jakarta.persistence.Column(nullable = false)
	private String comercialName;
	
	@jakarta.persistence.Column(nullable = true)
	private String juridicalName;
	
	@jakarta.persistence.Column(nullable = true)
	private SocialType socialType;
	
	@jakarta.persistence.Column(nullable = true)
	private String vatNumber;
	
	@jakarta.persistence.Column(nullable = true)
	private String companyRegistrationNumber;
	
	@jakarta.persistence.Column(nullable = true)
	private String contactPhone;
	@jakarta.persistence.Column(nullable = true)
	private String email;
	@jakarta.persistence.Column(nullable = true)
	private String website;

	public Organization() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Organization getParentOrganization() {
		return parentOrganization;
	}

	public void setParentOrganization(Organization parentOrganization) {
		this.parentOrganization = parentOrganization;
	}

	public String getComercialName() {
		return comercialName;
	}

	public void setComercialName(String comercialName) {
		this.comercialName = comercialName;
	}

	public String getJuridicalName() {
		return juridicalName;
	}

	public void setJuridicalName(String juridicalName) {
		this.juridicalName = juridicalName;
	}

	public SocialType getSocialType() {
		return socialType;
	}

	public void setSocialType(SocialType socialType) {
		this.socialType = socialType;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public String getCompanyRegistrationNumber() {
		return companyRegistrationNumber;
	}

	public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
		this.companyRegistrationNumber = companyRegistrationNumber;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	

}
