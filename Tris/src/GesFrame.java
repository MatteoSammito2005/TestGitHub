import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GesFrame extends JFrame implements ActionListener, MouseListener{
  JPanel p = new JPanel();
  JPanel p2  = new JPanel();
 
  JLabel l1 = new JLabel("");
  JLabel l2 = new JLabel("Giocatore 1");
  JLabel l3 = new JLabel("");
 
  JButton b1 = new JButton();
  JButton b2 = new JButton();
  JButton b3 = new JButton();
  JButton b4 = new JButton();
  JButton b5 = new JButton();
  JButton b6 = new JButton();
  JButton b7 = new JButton();
  JButton b8 = new JButton();
  JButton b9 = new JButton();
 
  boolean giocatore = false;
 
public GesFrame(String title) {
p2.setLayout(new GridLayout(1,1));
p2.add(p);
p2.add(l2);

p.setLayout(new GridLayout(4,3));
p.add(l1);
p.add(l2);
l2.setFont(new Font("Courier", Font.BOLD,24));
p.add(l3);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);

this.getContentPane().add(p2);
this.setSize(600, 600);
this.setVisible(true);
this.setTitle(title);
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1) {
		if(giocatore==false) {
			b1.setBackground(Color.RED);
			giocatore=true;
			l2.setText("Giocatore 2");
		}
		if(giocatore==true) {
			b1.setBackground(Color.GREEN);
			giocatore=false;
			l2.setText("Giocatore 1");
		}
	}
	
	if(e.getSource()==b2) {
		if(giocatore==false) {
			b2.setBackground(Color.RED);
			giocatore=true;
			l2.setText("Giocatore 2");
		}
		if(giocatore==true) {
			b2.setBackground(Color.GREEN);
			giocatore=false;
			l2.setText("Giocatore 1");
		}
	}
	
	if(e.getSource()==b3) {
		if(giocatore==false) {
			b3.setBackground(Color.RED);
			giocatore=true;
			l2.setText("Giocatore 2");
		}
		if(giocatore==true) {
			b3.setBackground(Color.GREEN);
			giocatore=false;
			l2.setText("Giocatore 1");
		}
	}
	
	if(e.getSource()==b4) {
		if(giocatore==false) {
			b4.setBackground(Color.RED);
			giocatore=true;
			l2.setText("Giocatore 2");
		}
		if(giocatore==true) {
			b4.setBackground(Color.GREEN);
			giocatore=false;
			l2.setText("Giocatore 1");
		}
	}
	
	if(e.getSource()==b5) {
		if(giocatore==false) {
			b5.setBackground(Color.RED);
			giocatore=true;
			l2.setText("Giocatore 2");
		}
		if(giocatore==true) {
			b5.setBackground(Color.GREEN);
			giocatore=false;
			l2.setText("Giocatore 1");
		}
	}
	
	if(e.getSource()==b6) {
		if(giocatore==false) {
			b6.setBackground(Color.RED);
			giocatore=true;
			l2.setText("Giocatore 2");
		}
		if(giocatore==true) {
			b6.setBackground(Color.GREEN);
			giocatore=false;
			l2.setText("Giocatore 1");
		}
	}
	
	if(e.getSource()==b7) {
		if(giocatore==false) {
			b7.setBackground(Color.RED);
			giocatore=true;
			l2.setText("Giocatore 2");
		}
		if(giocatore==true) {
			b7.setBackground(Color.GREEN);
			giocatore=false;
			l2.setText("Giocatore 1");
		}
	}
	
	if(e.getSource()==b8) {
		if(giocatore==false) {
			b8.setBackground(Color.RED);
			giocatore=true;
			l2.setText("Giocatore 2");
		}
		if(giocatore==true) {
			b8.setBackground(Color.GREEN);
			giocatore=false;
			l2.setText("Giocatore 1");
		}
	}
	
	if(e.getSource()==b9) {
		if(giocatore==false) {
			b9.setBackground(Color.RED);
			giocatore=true;
			l2.setText("Giocatore 2");
		}
		if(giocatore==true) {
			b9.setBackground(Color.GREEN);
			giocatore=false;
			l2.setText("Giocatore 1");
		}
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
