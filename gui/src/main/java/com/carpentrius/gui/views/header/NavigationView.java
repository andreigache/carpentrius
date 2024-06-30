package com.carpentrius.gui.views.header;

import javax.swing.JPanel;
import java.awt.BorderLayout;


import javax.swing.ImageIcon;

public class NavigationView extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public NavigationView() {
		setLayout(new BorderLayout(0, 0));
		ImageIcon uploadImg = new ImageIcon(NavigationView.class.getResource("/icons/home1.png"));
		

	}

}
