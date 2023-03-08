package gesframe;

import java.awt.*;
import javax.swing.*;

public class GesFrame extends JFrame {
	private JPanel p = new JPanel();
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	private JPanel p4 = new JPanel();
	
	private JTextField nome = new JTextField();
	private JTextField cognome = new JTextField();
	private JLabel name = new JLabel();
	private JLabel surname = new JLabel();
	
	private JTextField sesso = new JTextField();
	private ButtonGroup sex=new ButtonGroup();
	private JRadioButton m = new JRadioButton("M");
	private JRadioButton f = new JRadioButton("F");
	
	private JTextField categoria = new JTextField();
	String opzioni[] = {"", "Adulto", "Bambino"};
	private JComboBox sesso1 = new JComboBox(opzioni);
	
	private JButton reset = new JButton("Reset");
	private JButton saluta = new JButton("Saluta");
	
	private JLabel saluto = new JLabel();
	
	public GesFrame(String title) {
		p.setLayout(new GridLayout(4,1));
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		p1.setLayout(new GridLayout(2,2));
		p1.add(name);
		p1.add(nome);
		p1.add(surname);
		p1.add(cognome);
		name.setBackground(Color.WHITE);
		surname.setBackground(Color.WHITE);
		nome.setBackground(Color.WHITE);
		cognome.setBackground(Color.WHITE);
		name.setText("Nome");
		surname.setText("Cognome");
		
		
		
		p2.setLayout(new GridLayout(1,3));
		p2.add(sesso);
		sesso.add(m);
		sesso.add(f);
		p2.add(m);
		p2.add(f);
		sesso.setBackground(Color.WHITE);
		sesso.setText("Sesso");
		
		p3.setLayout(new GridLayout(2,2));
		p3.add(categoria);
		p3.add(sesso1);
		sesso1.setSelectedIndex(0);
		p3.add(reset);
		p3.add(saluta);
		categoria.setText("Categoria");
		categoria.setBackground(Color.WHITE);
		
		p4.setLayout(new GridLayout(1,1));
		p4.add(saluto);
		
		this.getContentPane().add(p);
		this.setSize(600,600);
		this.setVisible(true);
		this.setTitle(title);	
	}

}
