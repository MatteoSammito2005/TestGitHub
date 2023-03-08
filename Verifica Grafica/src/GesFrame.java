import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GesFrame extends JFrame implements ActionListener, MouseListener{
	JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JLabel nome = new JLabel("Nome");
	JLabel cog = new JLabel("Cognome");
	JLabel num = new JLabel("Numero");
	JLabel cont = new JLabel("Contatto");
	JLabel tipo = new JLabel("Tipo");
	JTextField name = new JTextField();	
	JTextField surname = new JTextField();	
	JTextField numb = new JTextField();	
	String opzioni[] = {"", "Privato", "Pubblico"};
	JComboBox contatto = new JComboBox(opzioni);
	ButtonGroup s = new ButtonGroup();
	JRadioButton s1 = new JRadioButton("Cellulare");
	JRadioButton s2 = new JRadioButton("Fisso");
	JRadioButton s3 = new JRadioButton("Email");
	JButton reset = new JButton("Reset");
	JButton reg = new JButton("Registra");
	JButton list = new JButton("Lista");
	JTextArea l = new JTextArea();
	String con="";
	String str="";

	public GesFrame(String title) {
		p.setLayout(new GridLayout(4,1));
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		p1.setLayout(new GridLayout(4,2));
		p1.add(nome);
		p1.add(name);
		p1.add(cog);
		p1.add(surname);
		p1.add(num);
		p1.add(numb);
		p1.add(cont);
		p1.add(contatto);
		
		p2.setLayout(new GridLayout(1,4));
		p2.add(tipo);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		p2.add(s1);
		p2.add(s2);
		p2.add(s3);
		
		p3.setLayout(new GridLayout(1,3));
		p3.add(reset);
		p3.add(reg);
		p3.add(list);
		
		p4.setLayout(new GridLayout(1,1));
		p4.add(l);
		
		reset.addActionListener(this);
		reg.addActionListener(this);
		list.addActionListener(this);
		reset.addMouseListener(this);
		reg.addMouseListener(this);
		list.addMouseListener(this);
		
		this.getContentPane().add(p);
	    this.setSize(400,450);
	    this.setVisible(true);
	    this.setTitle(title);
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
		if(e.getSource()==reset) {
			reset.setBackground(Color.YELLOW);
		}
		if(e.getSource()==reg) {
			reg.setBackground(Color.YELLOW);
		}	
		if(e.getSource()==list) {
			list.setBackground(Color.YELLOW);
		}	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==reset) {
			reset.setBackground(Color.WHITE);
		}
		if(e.getSource()==reg) {
			reg.setBackground(Color.WHITE);
		}	
		if(e.getSource()==list) {
			list.setBackground(Color.WHITE);
		}	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==reset) {
			name.setText("");
			surname.setText("");
			numb.setText("");
			contatto.setSelectedIndex(0);
			s.clearSelection();
		}
		
		if(e.getSource()==reg) {
			if (name.getText()=="" || surname.getText()=="" || contatto.getSelectedIndex()==0 || s1.isSelected()==false && s2.isSelected()==false && s3.isSelected()==false) {
				JOptionPane.showMessageDialog(null, "Inserire tutti i dati", "Errore", JOptionPane.ERROR_MESSAGE);
			}
			if (contatto.getSelectedIndex()==1) {
				con = "Privato";
			}
			if (contatto.getSelectedIndex()==2) {
				con= "Pubblico";
			}
			if (s.getSelection()==s1) {
				str = "Cellulare";
			}
			if (s.getSelection()==s2) {
				str = "Fisso";
			}
			if (s.getSelection()==s3) {
				str = "Email";
			}
			String s = name.getText() + " "	+ surname.getText() + " " + numb.getText() + " " + con + str;
			l.setText(s);
		}
		
	}
}
