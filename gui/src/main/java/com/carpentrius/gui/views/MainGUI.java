package com.carpentrius.gui.views;


import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.carpentrius.gui.views.customer.CustomerIndexView;
import com.carpentrius.gui.views.home.HomeIndexView;
import com.formdev.flatlaf.FlatLightLaf;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MainGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public MainGUI() {
		try {
			initialize();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	
	}
	
	/**
	 * Initialize the contents of the frame.
	 * @throws UnsupportedLookAndFeelException 
	 */
	private void initialize() throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new FlatLightLaf());
		setTitle("Carpentrius");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		JPanel home = new HomeIndexView();
		home.setBackground(Color.WHITE);
		
		getContentPane().add(home, BorderLayout.CENTER);

		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		getContentPane().setFont(new Font("Calibri", Font.PLAIN, 11));
		setFont(new Font("Calibri", Font.PLAIN, 12));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.setBorder(new EmptyBorder(4, 4, 4, 4));
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_4 = new JMenu("Home");
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu = new JMenu("Orders");
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Orders");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Orders");
			}
		});
		mntmNewMenuItem.setBackground(Color.WHITE);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Invoices");
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Customers");
		mnNewMenu_1.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Customers");
		mntmNewMenuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Customers");
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Addresses");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Catalogs");
		mnNewMenu_2.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Products");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Stock");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		final JMenu mnNewMenu_3 = new JMenu("Settings");
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Settings");
			}
		});
		mnNewMenu_3.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_5 = new JMenu("Help");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Documentation");
		mnNewMenu_5.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Check for updates");
		mnNewMenu_5.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("About");
		mnNewMenu_5.add(mntmNewMenuItem_8);
	}

}
