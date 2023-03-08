package Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class GesFrame extends JFrame implements ActionListener{

	JPanel p1 = new JPanel();
	
	JLabel l1 = new JLabel("Numero 1: ");
	JLabel l2 = new JLabel("Numero 2: ");
	JLabel l3 = new JLabel("Risultato: ");
	
	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(20);	
	
	JButton b1 = new JButton ("+");
	
	public GesFrame(String titolo) {	
		p1.setLayout(new GridLayout(10,6));
	
		p1.add(l1);
		l1.setForeground(Color.DARK_GRAY);
		l1.setFont(new Font("Serif", Font.CENTER_BASELINE, 36));
		
		t1.setBackground(Color.CYAN);
		t1.setSelectedTextColor(Color.black);
		t1.setFont(new Font("Serif", Font.CENTER_BASELINE, 36));
		p1.add(t1);
		
		p1.add(l2);
		l2.setForeground(Color.DARK_GRAY);
		l2.setFont(new Font("Serif", Font.CENTER_BASELINE, 36));
	
		t2.setBackground(Color.CYAN);
		t2.setSelectedTextColor(Color.black);
		t2.setFont(new Font("Serif", Font.CENTER_BASELINE, 36));
		p1.add(t2);
		
		p1.add(l3);
		l3.setForeground(Color.DARK_GRAY);
		l3.setFont(new Font("Serif", Font.CENTER_BASELINE, 36));
		
		t3.setBackground(Color.CYAN);
		t3.setSelectedTextColor(Color.black);
		t3.setFont(new Font("Serif", Font.CENTER_BASELINE, 36));
		t3.setEditable(false);
		p1.add(t3);
		
		b1.addActionListener(this);
		p1.add(b1);
		b1.setBackground(Color.GREEN);
		b1.setFont(new Font("Serif", Font.CENTER_BASELINE, 36));
		
		this.getContentPane().add(p1);
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle(titolo);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		if(!t1.getText().equals("") && !t2.getText().equals("")) {
		int a=Integer.valueOf(t1.getText()).intValue();
		int b=Integer.valueOf(t2.getText()).intValue();
		int somma=a+b;
		String s=""+somma;
		t3.setText(s);
		}
		else {t3.setText("Errore!");};
	} catch(Exception errore) {t3.setText("Errore!");} 
}
}