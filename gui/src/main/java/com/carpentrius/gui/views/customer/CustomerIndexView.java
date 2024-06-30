package com.carpentrius.gui.views.customer;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
                                       
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.carpentrius.gui.views.commons.DetailWrapperView;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CustomerIndexView extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public CustomerIndexView() {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.WHITE);
		toolBar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton_4 = new JButton("Create Customer");
		JPanel thisPanel = this;
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Create customer clicked");
				JPanel customerFormView = new CustomerFormView();
				DetailWrapperView detailWrapperView = new DetailWrapperView(customerFormView);
				JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(thisPanel);
				detailWrapperView.setLocationRelativeTo(parentFrame);
				detailWrapperView.setModal(true);
				detailWrapperView.pack();
				detailWrapperView.setVisible(true);
			}
		});
		toolBar.add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel(" | ");
		toolBar.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Filter");
		toolBar.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel(" | ");
		toolBar.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Refresh");
		toolBar.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel(" | ");
		toolBar.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("First Row");
		toolBar.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("<<");
		toolBar.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setMaximumSize(new Dimension(100, 20));
		toolBar.add(textField);
		textField.setColumns(1);
		
		JButton btnNewButton_3 = new JButton(">>");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		toolBar.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("# of rows");
		toolBar.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setText("20");
		textField_1.setMaximumSize(new Dimension(100, 20));
		toolBar.add(textField_1);
		textField_1.setColumns(1);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		splitPane.setBorder(new TitledBorder(null, "Customers", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		add(splitPane);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		table = new JTable();
		
		DefaultTableModel defaultTableModel = new DefaultTableModel(new Object[][] {
			{new Integer(1), "Andrei", null},
			{new Integer(2), "Andrea", "andrea@hmail.com"},
			{new Integer(3), "Ma-ta", null},
		},
		new String[] {
			"ID", "NAME", "EMAIL"
		});
		
		
		TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>(defaultTableModel);
		
		table.setModel(defaultTableModel);
		table.setRowSorter(tableRowSorter);
		scrollPane.setViewportView(table);
		splitPane.setDividerLocation(0.5);
		

	}

}
