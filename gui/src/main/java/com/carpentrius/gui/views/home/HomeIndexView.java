package com.carpentrius.gui.views.home;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;


public class HomeIndexView extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public HomeIndexView() {
		setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Chat", null, panel_4, null);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.2);
		panel_4.add(splitPane, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBorder(new EmptyBorder(10, 10, 10, 10));
		splitPane.setLeftComponent(panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.WHITE);
		toolBar.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_toolBar = new GridBagConstraints();
		gbc_toolBar.anchor = GridBagConstraints.WEST;
		gbc_toolBar.insets = new Insets(0, 0, 5, 0);
		gbc_toolBar.gridx = 0;
		gbc_toolBar.gridy = 0;
		panel_5.add(toolBar, gbc_toolBar);
		
		JButton btnNewButton = new JButton("New chat");
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mentions");
		toolBar.add(btnNewButton_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 0;
		gbc_scrollPane_2.gridy = 1;
		panel_5.add(scrollPane_2, gbc_scrollPane_2);
		
		JLabel lblNewLabel_1 = new JLabel("Direct messages");
		lblNewLabel_1.setBorder(new EmptyBorder(5, 0, 10, 0));
		scrollPane_2.setColumnHeaderView(lblNewLabel_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Andrei Gache", "Thomas Canto Branco", "Ionut Gavrilas", "Florin Bosoi", "Stefan Crisan"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_2.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 2;
		panel_5.add(scrollPane_1, gbc_scrollPane_1);
		
		JLabel lblNewLabel = new JLabel("Spaces");
		lblNewLabel.setBorder(new EmptyBorder(5, 0, 10, 0));
		scrollPane_1.setColumnHeaderView(lblNewLabel);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new EmptyBorder(10, 10, 30, 50));
		splitPane.setRightComponent(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBorder(new EmptyBorder(0, 0, 10, 0));
		panel_6.add(scrollPane_3, BorderLayout.CENTER);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setFocusable(false);
		textPane_1.setBackground(Color.WHITE);
		textPane_1.setEditable(false);
		textPane_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		scrollPane_3.setViewportView(textPane_1);
		
		textField = new JTextField();
		textField.setMinimumSize(new Dimension(7, 70));
		panel_6.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Announces", null, panel_1, null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Newsfeed RSS", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.RIGHT);
		panel.add(tabbedPane_1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane_1.addTab("Arts et divertissement", null, panel_2, null);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
        // Create a custom StyledDocument 
        StyledDocument styledDocument  = textPane.getStyledDocument(); 

        // Create and set a Style for the text 
        Style styleTitle = styledDocument.addStyle("customStyle", null); 
        StyleConstants.setForeground(styleTitle, Color.RED); 
        StyleConstants.setBold(styleTitle, true); 

        // Set the StyledDocument 
        textPane.setStyledDocument(styledDocument);
        
        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("History ", null, panel_3, null);
		try {
			HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://www.francetvinfo.fr/monde.rss")).GET().build();
			HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(response.body()));
			Document doc = db.parse(is);
			doc.getDocumentElement().normalize();

			System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
			System.out.println("------");
            NodeList itemList = doc.getElementsByTagName("item");
            for (int i = 0; i < itemList.getLength(); i++) {
                Node item = itemList.item(i);
                if (item.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) item;
                    
                    String title = element.getElementsByTagName("title").item(0).getTextContent();
                    String link = element.getElementsByTagName("link").item(0).getTextContent();
                    String description = element.getElementsByTagName("description").item(0).getTextContent();
                    String date = element.getElementsByTagName("pubDate").item(0).getTextContent();
                    styledDocument.insertString(0, "-----------------------------------------------"+"\n", styleTitle);
                    styledDocument.insertString(0, "Date: "+date+"\n", null);
                    styledDocument.insertString(0, description+"\n", null);
                    StyleConstants.setForeground(styleTitle, Color.BLUE); 
                    styledDocument.insertString(0, link+"\n", styleTitle);
                    StyleConstants.setForeground(styleTitle, Color.RED); 
                    styledDocument.insertString(0, "Title: "+title+"\n", styleTitle);
                    
                    
                    styledDocument.insertString(0, "-----------------------------------------------"+"\n", styleTitle);
                    
                    
                    System.out.println("Title: " + title);
                    System.out.println("Link: " + link);
                }
            }
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
