package GesFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GesFrame extends JFrame implements ActionListener {
	private JPanel p=new JPanel();
	private JPanel p1=new JPanel();
	private JPanel p2=new JPanel();
	
	private JLabel foto=new JLabel();
	
	private ButtonGroup scelta=new ButtonGroup();
	private JRadioButton città1 = new JRadioButton("Miami");
	private JRadioButton città2 = new JRadioButton("Los Angeles");
	private JRadioButton città3 = new JRadioButton("Duabi");
	
	private JButton b= new JButton("Verifica");
	
	private JTextField risultato=new JTextField();
	
	public GesFrame(String title) {
		p.setLayout(new GridLayout(3,1));
		p.add(foto);
		foto.setIcon(new
		ImageIcon());
		p.add(p1);
		p1.setLayout(new GridLayout(1,3));
		
		scelta.add(città1);
		scelta.add(città2);
		scelta.add(città3);
		p1.add(città1);
		p1.add(città2);
		p1.add(città3);
		
		p.add(p2);
		p2.setLayout(new FlowLayout());
		p2.add(b);
		b.setBackground(Color.WHITE);
		
		p2.add(risultato);
		risultato.setBackground(Color.WHITE);
		
		this.getContentPane().add(p);
		this.setSize(1280,720);
		this.setVisible(true);
		this.setTitle(title);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}


/*l1.setAlignmentX(LEFT_ALIGNMENT);

l1.setAlignmentX(RIGHT_ALIGNMENT);

l1.setAlignmentY(BOTTOM_ALIGNMENT);

l1.setAlignmentY(TOP_ALIGNMENT);*/
