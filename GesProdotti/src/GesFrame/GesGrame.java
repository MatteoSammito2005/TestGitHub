package GesFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GesGrame extends JFrame implements ActionListener, MouseListener {
	JPanel p = new JPanel();
	JLabel l1 = new JLabel("Codice");
	JTextField t1 = new JTextField();
	JLabel l2 = new JLabel("Descrizione");
	JTextField t2 = new JTextField();
	JLabel l3 = new JLabel("Prezzo");
	JTextField t3 = new JTextField();
	JLabel tipo = new JLabel("Tipo");
	ButtonGroup scelte = new ButtonGroup();
	JRadioButton alimentare = new JRadioButton("Alimentare");
	JRadioButton non_alimentare = new JRadioButton("Non Alimentare");
	JButton reset = new JButton("Reset");
	JButton inserisci = new JButton("Inserisci");
	
	public GesGrame(String title) {
		p.setLayout(new GridLayout(5,2));
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(l3);
		p.add(t3);
		p.add(tipo);
		scelte.add(alimentare);
		scelte.add(non_alimentare);
		p.add(alimentare);
		p.add(non_alimentare);
		
		reset.addActionListener(this);
		inserisci.addActionListener(this);
		
		this.getContentPane().add(p);
		this.setSize(600,600);
		this.setVisible(true);
		this.setTitle(title);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==reset) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			scelte.clearSelection();
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
