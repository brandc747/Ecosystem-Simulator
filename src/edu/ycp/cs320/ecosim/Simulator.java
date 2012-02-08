package edu.ycp.cs320.ecosim;

import javax.swing.*;

public class Simulator {
	
	  public static void main(String[] args) {
		  JFrame frame = new JFrame("Ecoystem Simulator");
		  frame.setSize(1024,768);
		  frame.setLayout(null);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  //menubar
		  JMenuBar menuBar = new JMenuBar();
		  JMenu file = new JMenu("File");
		  JMenu about = new JMenu("About");
		  menuBar.add(file);
		  menuBar.add(about);
		  frame.setJMenuBar(menuBar);
		  
		  
		  //2d graphixxxx
		  JPanel g = new JPanel();
		  g.setSize(1024, 368);
		  	  
		  
		  //tabbed section
		  JTabbedPane tabbedPane = new JTabbedPane();
		  JComponent panel1 = makeTextPanel("Panel 1");
		  JCheckBox checkBox = new JCheckBox("This is cool!", false);
		  panel1.add(checkBox);
		  checkBox.setBounds(200, 200, checkBox.getWidth(), checkBox.getHeight());
		  JComponent panel2 = makeTextPanel("Panel 2");
		  tabbedPane.addTab("Tab 1", panel1);
		  tabbedPane.addTab("Tab 2", panel2);
		  
		  
		  //add items to frame
		 // frame.add(g);
		  frame.add(tabbedPane);  
		  
		  frame.setVisible(true);
	  }
	  
	  protected static JComponent makeTextPanel(String text) {
		    JPanel panel = new JPanel(false);
		    JLabel filler = new JLabel(text);
		    filler.setHorizontalAlignment(JLabel.CENTER);
		    panel.setLayout(null);
		    panel.add(filler);
		    return panel;
		  }
}

