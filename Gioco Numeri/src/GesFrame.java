import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import java.io.*;

public class GesFrame extends JFrame implements ActionListener {
	InputStreamReader input = new InputStreamReader(System.in);
	BufferedReader t= new BufferedReader (input);
	Random r = new Random();
	int c=0;

	JPanel finestra = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JLabel l4 = new JLabel();
	JLabel l5 = new JLabel();
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	JTextField t5 = new JTextField();
	JButton b1 = new JButton ("INIZIA");
	JButton b2 = new JButton ("VERIFICA");

	
	public GesFrame(String title) {
		finestra.setLayout(new GridLayout(4,1));
		finestra.add(p1);
		finestra.add(p2);
		finestra.add(p3);
		finestra.add(p4);
		
		p1.setLayout(new GridLayout(1,5));
		l1.setOpaque(true);
		p1.add(l1);
		l2.setOpaque(true);
		p1.add(l2);
		l3.setOpaque(true);
		p1.add(l3);
		l4.setOpaque(true);
		p1.add(l4);
		l5.setOpaque(true);
		p1.add(l5);	
		l1.setBackground(Color.green);
		l2.setBackground(Color.green);
		l3.setBackground(Color.green);
		l4.setBackground(Color.green);
		l5.setBackground(Color.green);
		l1.setText(String.valueOf(r.nextInt(10)));
		l2.setText(String.valueOf(r.nextInt(10)));
		l3.setText(String.valueOf(r.nextInt(10)));
		l4.setText(String.valueOf(r.nextInt(10)));
		l5.setText(String.valueOf(r.nextInt(10)));
		
		p2.setLayout(new GridLayout(1,1));
		p2.add(b1);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		
		p3.setLayout(new GridLayout(1,5));
		p3.add(t1);
		p3.add(t2);
		p3.add(t3);
		p3.add(t4);
		p3.add(t5);
		t1.setBackground(Color.green);
		t2.setBackground(Color.green);
		t3.setBackground(Color.green);
		t4.setBackground(Color.green);
		t5.setBackground(Color.green);
		
		p4.setLayout(new GridLayout(1,5));
		p4.add(b2);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		
		this.getContentPane().add(finestra);
		this.setSize(300, 300);
		this.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			l1.setForeground(Color.green);
			l2.setForeground(Color.green);
			l3.setForeground(Color.green);
			l4.setForeground(Color.green);
			l5.setForeground(Color.green);
			
		}
		if(e.getSource()==b2) {
			c++;
			if (c==1) {
				if (l1.getText().equals(t1.getText())) {
					l1.setForeground(Color.black);
				}
				if (l2.getText().equals(t2.getText())) {
					l2.setForeground(Color.black);
				}
				if (l3.getText().equals(t3.getText())) {
					l3.setForeground(Color.black);
				}
				if (l4.getText().equals(t4.getText())) {
					l4.setForeground(Color.black);
				}
				if (l5.getText().equals(t5.getText())) {
					l5.setForeground(Color.black);
				}
			}
				
			if (c==2) {
				if (l1.getText().equals(t1.getText())) {
					l1.setForeground(Color.black);
				}
				if (l2.getText().equals(t2.getText())) {
					l2.setForeground(Color.black);
				}
				if (l3.getText().equals(t3.getText())) {
					l3.setForeground(Color.black);
				}
				if (l4.getText().equals(t4.getText())) {
					l4.setForeground(Color.black);
				}
				if (l5.getText().equals(t5.getText())) {
					l5.setForeground(Color.black);
				}
			}
			
			}
			
			if (c==3) {
				if (l1.getText().equals(t1.getText())) {
					l1.setForeground(Color.black);
				}
				if (!l1.getText().equals(t1.getText())) {
					l1.setBackground(Color.red);
					l1.setForeground(Color.black);
				}
				
				if (l2.getText().equals(t2.getText())) {
					l2.setForeground(Color.black);
			
				}
				if (!l2.getText().equals(t2.getText())) {
					l2.setBackground(Color.red);
					l2.setForeground(Color.black);
				}
				
				if (l3.getText().equals(t3.getText())) {
					l3.setForeground(Color.black);
				}
				if (!l3.getText().equals(t3.getText())) {
					l3.setBackground(Color.red);
					l3.setForeground(Color.black);
				}
				
				if (l4.getText().equals(t4.getText())) {
					l4.setForeground(Color.black);
				}
				if (!l4.getText().equals(t4.getText())) {
					l4.setBackground(Color.red);
					l4.setForeground(Color.black);
				}
				
				if (l5.getText().equals(t5.getText())) {
					l5.setForeground(Color.black);
				}
				if (!l5.getText().equals(t5.getText())) {
					l5.setBackground(Color.red);
					l5.setForeground(Color.black);
				}	
			}
			
			if (l1.getBackground()==Color.red || l2.getBackground()==Color.red || l3.getBackground()==Color.red || l4.getBackground()==Color.red || l5.getBackground()==Color.red) {
				JOptionPane.showMessageDialog(null, "HAI PERSO", "RISULTATO", JOptionPane.ERROR_MESSAGE);
			}	
	}	
}
