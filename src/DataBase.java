import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class DataBase extends JFrame{
	
	JPanel p=new JPanel();
	JButton b=new JButton("Start");
	JTextField t=new JTextField("Go!",20);
	JTextArea ta=new JTextArea("How are you",20,5);
	JLabel l=new JLabel("What's up");
	String choices[]={
		"Hallo",
		"Bonjour",
		"gggg"
	};
	JComboBox cb=new JComboBox(choices);
	
	public static void main(String[] args){
		new DataBase();
	}
	
	public DataBase(){
	super("DataBase");
	
		setSize(800,300);
		setResizable(true);
		
		p.add(b);
		p.add(t);
		p.add(ta);
		p.add(l);
		p.add(cb);
		add(p);
		
		setVisible(true);
	}
}