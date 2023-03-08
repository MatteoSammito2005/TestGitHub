import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GesFrame extends JFrame implements ActionListener, MouseListener{
	ListaLibri list = new ListaLibri();
    JPanel window = new JPanel();
    JButton inserimento = new JButton("INSERISCI LIBRO");
    JButton gestione = new JButton("GESTISCI PRESTITO");
    JButton exit = new JButton("ESCI");
    JPanel p = new JPanel();
    JPanel ins = new JPanel();
    JPanel scriv = new JPanel();
    JPanel p2 = new JPanel();
    JPanel ges_pres = new JPanel();
    JLabel l5 = new JLabel("                              Codice:");
    JTextField t1 = new JTextField();
    JButton reso = new JButton("RESO");
    JButton prestito = new JButton("PRESTITO"); 
    JTextField codice = new JTextField();
    JTextField titolo = new JTextField();
    JTextField autore = new JTextField();
    JTextField edizione = new JTextField();
    JButton inserisci = new JButton("INSERISCI");
    JLabel l1 = new JLabel(" Codice:");
    JLabel l2 = new JLabel("   Titolo:");
    JLabel l3 = new JLabel("  Autore:");
    JLabel l4 = new JLabel("Edizione:");
    
    public GesFrame(String title) {
        window.setLayout(new GridLayout(3,1));
        window.add(inserimento);
        window.add(gestione);
        window.add(exit);
        inserimento.setFont(new Font("Helvetica", Font.BOLD, 15));
        gestione.setFont(new Font("Helvetica", Font.BOLD, 15));
        exit.setFont(new Font("Helvetica", Font.BOLD, 15));
        inserimento.setBackground(Color.lightGray);
        exit.setBackground(Color.lightGray);
        gestione.setBackground(Color.lightGray);
        
        inserimento.add(p);
        p.setLayout(new GridLayout(2,1));
        p.setVisible(false);
        p.add(scriv);
        scriv.setLayout(new GridLayout(4,4));
        scriv.add(l1);
        l1.setFont(new Font("Helvetica", Font.BOLD, 12));
        scriv.add(codice);
        codice.setFont(new Font("Helvetica", Font.BOLD, 10));
        scriv.add(l2);
        l2.setFont(new Font("Helvetica", Font.BOLD, 12));
        scriv.add(titolo);
        titolo.setFont(new Font("Helvetica", Font.BOLD, 10));
        scriv.add(l3);
        l3.setFont(new Font("Helvetica", Font.BOLD, 12));
        scriv.add(autore);
        autore.setFont(new Font("Helvetica", Font.BOLD, 10));
        scriv.add(l4);
        l4.setFont(new Font("Helvetica", Font.BOLD, 12));
        scriv.add(edizione);
        edizione.setFont(new Font("Helvetica", Font.BOLD, 10));
        gestione.add(p2);
        p2.setLayout(new GridLayout(1,1));
        p2.setVisible(false);
        p2.add(ges_pres);
        ges_pres.setLayout(new GridLayout(2,2));
        ges_pres.add(l5);
        l5.setFont(new Font("Helvetica", Font.BOLD, 12));
        ges_pres.add(t1);
        t1.setFont(new Font("Helvetica", Font.BOLD, 10));
        ges_pres.add(reso);
        reso.setBackground(Color.lightGray);
        ges_pres.add(prestito);
        prestito.setBackground(Color.lightGray);
        p.add(ins);
        scriv.setLayout(new GridLayout(1,1));
        ins.add(inserisci);
        inserisci.setBackground(Color.lightGray);
        inserisci.setFont(new Font("Helvetica", Font.BOLD, 12));
        this.getContentPane().add(window);
        this.setSize(485,250);
        this.setVisible(true);
        inserimento.addActionListener(this);
        gestione.addActionListener(this);
        exit.addActionListener(this);
        inserisci.addActionListener(this);
        prestito.addActionListener(this);
        reso.addActionListener(this);
        inserimento.addMouseListener(this);
        gestione.addMouseListener(this);
        exit.addMouseListener(this);
        reso.addMouseListener(this);
        prestito.addMouseListener(this);
        inserisci.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==inserimento) {
            p.setVisible(true);
        }
        if(e.getSource()==inserisci) {
        	if(codice.getText().equals("") || titolo.getText().equals("") || autore.getText().equals("") || edizione.getText().equals("")) {
        		JOptionPane.showMessageDialog(null, "HAI LASCIATO UNO O PIU' CAMPI VUOTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
        	}
        	list.AggiungiLibro(codice.getText(), titolo.getText(), autore.getText(), edizione.getText(), false);
        	codice.setText("");
        	titolo.setText("");
        	autore.setText("");
        	edizione.setText("");
        	p.setVisible(false);
        }
        if(e.getSource()==gestione) {
        	p2.setVisible(true);  		
        } 
        if(e.getSource()==prestito) {
        	if (t1.getText().equals("")) {
        		JOptionPane.showMessageDialog(null, "HAI LASCIATO IL CAMPO DEL CODICE VUOTO", "ERRORE", JOptionPane.ERROR_MESSAGE);
        	}
        	else {
        		boolean c=false;
        		int a=list.ControllaCodice(t1.getText());
        		c = list.getPrestito1(a);
        		if (c==false) {
        			list.setPrestito(a);
        			t1.setText("");
        			p2.setVisible(false);  	
        		}	
        		if (c==true) {
        			JOptionPane.showMessageDialog(null, "IL LIBRO È GIÀ IN PRESTITO", "ERRORE", JOptionPane.ERROR_MESSAGE);
        		}	
        	}
        }
        if(e.getSource()==reso) {
        	if (t1.getText().equals("")) {
        		JOptionPane.showMessageDialog(null, "HAI LASCIATO IL CAMPO DEL CODICE VUOTO", "ERRORE", JOptionPane.ERROR_MESSAGE);
        	}
        	else {
        		boolean c =false;
        		int b=list.ControllaCodice(t1.getText());
        		c = list.getPrestito1(b);
        		if (c==true) {
        			list.setPrestito1(b);
        			t1.setText("");
        			p2.setVisible(false);  	
        		}
        		if (c==false) {
        			JOptionPane.showMessageDialog(null, "IL LIBRO É GIÀ NELLA BIBLIOTECA", "ERRORE", JOptionPane.ERROR_MESSAGE);
        		}
        	}	
        }
        if(e.getSource()==exit) {
        	list.stampaLibri();
        	System.exit(ABORT); 
        }
    }
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==inserimento) {
			inserimento.setBackground(Color.gray);
		}
		if(e.getSource()==gestione) {
			gestione.setBackground(Color.gray);
		}
		if(e.getSource()==exit) {
			exit.setBackground(Color.gray);
		}
		if(e.getSource()==reso) {
			reso.setBackground(Color.gray);
		}
		if(e.getSource()==prestito) {
			prestito.setBackground(Color.gray);
		}
		if(e.getSource()==inserisci) {
			inserisci.setBackground(Color.gray);
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==inserimento) {
			inserimento.setBackground(Color.lightGray);
		}
		if(e.getSource()==gestione) {
			gestione.setBackground(Color.lightGray);
		}
		if(e.getSource()==exit) {
			exit.setBackground(Color.lightGray);
		}
		if(e.getSource()==reso) {
			reso.setBackground(Color.lightGray);
		}
		if(e.getSource()==prestito) {
			prestito.setBackground(Color.lightGray);
		}
		if(e.getSource()==inserisci) {
			inserisci.setBackground(Color.lightGray);
		}
	}
}