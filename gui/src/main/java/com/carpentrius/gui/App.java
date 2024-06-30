package com.carpentrius.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.carpentrius.gui.entities.Organization;
import com.carpentrius.gui.utils.HibernateUtil;
import com.carpentrius.gui.views.MainGUI;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		//SessionFactory sessionFactory = HibernateUtil.getSessionFactory(); 
		
		this.frame = new MainGUI();

    }
	
}
