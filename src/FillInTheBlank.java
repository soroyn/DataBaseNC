import javax.swing.JOptionPane;

public class FillInTheBlank {
	public static void main(String args[]) {
		new FillInTheBlank();
	
	}
	
	public FillInTheBlank() {
		boolean done=false;
		while(!done) {
			done=true;
		String[] ans=new String[11];
		JOptionPane.showMessageDialog(null, "Let's make a story", 
				"fill in the blank",JOptionPane.INFORMATION_MESSAGE);
		String[] colors= {
		"orange",
		"Green",
		"Blue",
		"Yellow"
		};
		
int color_index = JOptionPane.showOptionDialog(null,"what's your favorite color?","Color",0,
				JOptionPane.QUESTION_MESSAGE,null,colors,0);
ans[0]=colors[color_index];

ans[1]=JOptionPane.showInputDialog(null,"What is your favorite thing to drink?","liquid",
		JOptionPane.QUESTION_MESSAGE);
ans[2]=JOptionPane.showInputDialog("Name something people bring with them to school");
ans[3]=JOptionPane.showInputDialog("What is one aspect you would want?");
ans[4]=JOptionPane.showInputDialog("What is something you do when you?");
ans[5]=JOptionPane.showInputDialog("Name something you own multiple?");
ans[6]=JOptionPane.showInputDialog("What is something you might find?");
ans[7]=JOptionPane.showInputDialog("Describe your current leader in?");
ans[8]=JOptionPane.showInputDialog("What is something you do while?");
ans[9]=JOptionPane.showInputDialog("Name something you do when you?");
ans[10]=JOptionPane.showInputDialog("If you could have one thing in?");

int input=JOptionPane.showConfirmDialog(null, "Are you sureyou are?");

if(input==1 || input==2) {
done=false;
}else {
	input=JOptionPane.showConfirmDialog(
			null,
			"Really this is your///?",
			"",
			JOptionPane.YES_NO_OPTION
			);
	if(input==1) {
		done=false;
	}else {
		input=JOptionPane.showConfirmDialog(
				null,
				"Ok, we will move on (but you can still prec CANCEL",
				"",
				JOptionPane.OK_CANCEL_OPTION
				);
	}
}
if(done) {
	JOptionPane.showMessageDialog(null, 
			"1-pervoe" + ans[0]+"2-vtoroe"+ans[1]
			+ "tret'e"+ans[2]+"   "+ans[3]+"   "+ans[4]
					+"   "+ans[5]+"   "+ans[6]+"   "+ans[7]
							+"   "+ans[8]+"   "+ans[9]);
}else {
	JOptionPane.showMessageDialog(null, "Ok we'lll start over then");
}
}

	}
}

