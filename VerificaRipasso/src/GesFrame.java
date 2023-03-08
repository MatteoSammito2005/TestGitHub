import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class GesFrame extends JFrame implements ActionListener, MouseListener{
	ListaClienti list = new ListaClienti();
    JPanel window = new JPanel();
    JButton cliente = new JButton("INSERISCI CLIENTE");
    JButton mov = new JButton("INSERISCI MOVIMENTO");
    JButton lista = new JButton("ELENCO");
    
    JPanel p = new JPanel();
    JLabel l1 = new JLabel("Nome:");
    JLabel l2 = new JLabel("Indirizzo:");
    JLabel l3 = new JLabel("Numero Conto:");
    
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    JTextField t6 = new JTextField();
    JTextField t7 = new JTextField();
    
    JButton ins = new JButton("INSERISCI");
    JButton reset = new JButton("RESET");
    
    JPanel p2 = new JPanel();
    JLabel l4 = new JLabel("Conto:");
    JLabel l5 = new JLabel("Importo:");
    JTextField t8 = new JTextField();
    JTextField t9 = new JTextField();
    JButton prel = new JButton("PRELIEVO");
    JButton dep = new JButton("DEPOSITO");

    public GesFrame(String title) {
    	window.setLayout(new GridLayout(3,1));
    	window.add(cliente);
        window.add(mov);
        window.add(lista);
        
        cliente.add(p);
        p.setLayout(new GridLayout(2,6));
        p.setVisible(false);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);
        p.add(t4);
        t4.setEditable(false);
        p.add(ins);
        p.add(t5);
        t5.setEditable(false);
        p.add(t6);
        t6.setEditable(false);
        p.add(reset);
        p.add(t7);
        t7.setEditable(false);
        
        mov.add(p2);
        p.setLayout(new GridLayout(3,3));
        p2.setVisible(false);
        p2.add(l4);
        p2.add(t8);
        p2.add(l5);
        p2.add(t9);
        p2.add(prel);
        p2.add(dep);
        
        
        this.getContentPane().add(window);
        this.setSize(1000,1000);
        this.setVisible(true);	
        cliente.addActionListener(this);
        ins.addActionListener(this);
        prel.addActionListener(this);
        dep.addActionListener(this);
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



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cliente) {
            p.setVisible(true);
        }
		
		if(e.getSource()==ins) {
        	if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("")) {
        		JOptionPane.showMessageDialog(null, "HAI LASCIATO UNO O PIU' CAMPI VUOTI", "ERRORE", JOptionPane.ERROR_MESSAGE);
        	}
        	list.AggiungiCliente(t1.getText(), t2.getText(), t3.getText(),0);
        	t1.setText("");
        	t2.setText("");
        	t3.setText("");
        	p.setVisible(false);
        }

		if(e.getSource()==reset) {
			t1.setText("");
        	t2.setText("");
        	t3.setText("");
		}
		
		if(e.getSource()==prel) {
			if(t8.getText().equals("")) {
				String a = list.ControllaPosizione(t8.getText());
			}
		}
		
		
	}
}