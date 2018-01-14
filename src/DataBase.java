import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DataBase extends JFrame implements ActionListener{
	
	JPanel p=new JPanel();
	JButton b=new JButton("Start");
	JTextField t=new JTextField("Go!",20);
		
	public static void main(String[] args){
		new DataBase();
	}
	
	public DataBase(){
	super("DataBase");
	
		setSize(400,200);
		setResizable(true);
		b.addActionListener(this);
		p.add(b);
		p.add(t);
		add(p);

		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		JOptionPane.showMessageDialog(null, t.getText());
		
	};
}

