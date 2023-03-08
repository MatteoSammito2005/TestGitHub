package GesFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GesFrame {
	JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	
	JButton on_off = new JButton("Accendi-Spegni");
	JButton dx = new JButton("Freccia Dx");
	JButton acc = new JButton("Accelera");
	JButton fr = new JButton("Frena");
	JButton sx = new JButton("Freccia Sx");
	
	JLabel luci = new JLabel("Luci");
	ButtonGroup luci1 = new ButtonGroup();
	JRadioButton pos = new JRadioButton("Posizioni");
	JRadioButton ana = new JRadioButton("Anabbaglianti");
	JRadioButton abb = new JRadioButton("Abbaglianti");
	
	JLabel alim = new JLabel ("Alimentazione");
	String opzioni[] = {"", "Gasolio", "Diesel"};
	JComboBox alime = new JComboBox(opzioni);
	
	JLabel vel = new JLabel("Velocità");
	JLabel cont = new JLabel("0");
	
	public GesFrame(String title) {
		p.setLayout(new GridLayout(4,1));
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		p2.setLayout(new GridLayout(1,1));
		p2.add(on_off);
		on_off.setBackground(Color.RED);
		
		p3.setLayout(new GridLayout(1,4));
		p3.add(dx);
		p3.add(acc);
		p3.add(fr);
		p3.add(sx);
	}

}
