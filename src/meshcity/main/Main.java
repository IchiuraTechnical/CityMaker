package meshcity.main;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	Frame frame = new Frame("CityMaker");
	JPanel p = new JPanel();
	
	JButton buttona1 = new JButton("E");
	JButton buttona2 = new JButton("E");
	JButton buttona3 = new JButton("E");
	JButton buttonb1 = new JButton("E");
	JButton buttonb2 = new JButton("E");
	JButton buttonb3 = new JButton("E");
	JButton buttonc1 = new JButton("E");
	JButton buttonc2 = new JButton("E");
	JButton buttonc3 = new JButton("E");
	
	p.add(buttona1);
	p.add(buttona2);
	
	Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
	}