package com.carpentrius.gui.utils;

import org.hibernate.SessionFactory;

import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.carpentrius.gui.entities.Address;
import com.carpentrius.gui.entities.Customer;
import com.carpentrius.gui.entities.Organization;

public class HibernateUtil {

	//XML based configuration
	private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	Configuration configuration = new Configuration();
        	configuration.configure("hibernate.cfg.xml");
        	System.out.println("Hibernate Configuration loaded");
        	
        	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        			.applySettings(configuration.getProperties())
        			.build();
        	System.out.println("Hibernate serviceRegistry created");
        	
        	
        	
        	MetadataSources metadata = new MetadataSources(serviceRegistry);
        	metadata.addAnnotatedClass(Organization.class);
        	
        	metadata.addAnnotatedClass(Customer.class);
        	metadata.addAnnotatedClass(Address.class);
        	metadata.buildMetadata();
        	
        	SessionFactory sessionFactory = metadata.buildMetadata().buildSessionFactory();
        	
        	
            return sessionFactory;
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
   
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) sessionFactory = buildSessionFactory();
        return sessionFactory;
    }
	


}
