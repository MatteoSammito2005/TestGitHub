package Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class GesFrame extends JFrame implements ActionListener{
	private JPanel p = new JPanel();
	private JPanel gradi = new JPanel();
	JTextField t = new JTextField(20);
	JButton b = new JButton ("Converti: ");
	
	public GesFrame() {
		p.setLayout(new GridLayout(2,1));
		p.add(gradi);
		p.add(t);
		p.add(b);
		this getContentPane().add(p);
		this setSize
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	JPanel p3 = new JPanel();
	
	JLabel l1 = new JLabel("Gradi Celsius: ");
	JLabel l3 = new JLabel("Gradi Kelvin: ");
	
	
	JTextField t3 = new JTextField(20);	
	
	
	
	public GesFrame(String titolo) {	
		p1.setLayout(new GridLayout(10,6));
		p2.setLayout(new GridLayout(1,4));
	
		p1.add(l1);
		l1.setForeground(Color.DARK_GRAY);
		l1.setFont(new Font("Serif", Font.CENTER_BASELINE, 24));
		
		t1.setBackground(Color.CYAN);
		t1.setSelectedTextColor(Color.black);
		t1.setFont(new Font("Serif", Font.CENTER_BASELINE, 24));
		p1.add(t1);
		
		p1.add(l3);
		l3.setForeground(Color.DARK_GRAY);
		l3.setFont(new Font("Serif", Font.CENTER_BASELINE, 24));
		
		t3.setBackground(Color.CYAN);
		t3.setSelectedTextColor(Color.black);
		t3.setFont(new Font("Serif", Font.CENTER_BASELINE, 24));
		t3.setEditable(false);
		p1.add(t3);
		
		b1.addActionListener(this);
		p1.add(b1);
		b1.setBackground(Color.GREEN);
		b1.setFont(new Font("Serif", Font.CENTER_BASELINE, 24));
		
		this.getContentPane().add(p1);
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle(titolo);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		if(!t1.getText().equals("")) {
		int a=Integer.valueOf(t1.getText()).intValue();
		double somma=a+273.15;
		String s=""+somma;
		t3.setText(s);
		}
		else {t3.setText("Errore!");};
	} catch(Exception errore) {t3.setText("Errore!");} 
}
}