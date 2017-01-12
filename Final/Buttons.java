import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import javax.swing.border.*;

public class Buttons extends JPanel implements ActionListener{
    private JButton button;
    private Board2 d;
    private Board a;
    public Buttons(){
	
        this.setLayout(new GridLayout(2,1));
        JButton button = new JButton("Check");
	button.addActionListener(this);
	this.add(button);
    }

    public void actionPerformed(ActionEvent e){
	SettingsGUI3.getSolvedBoard().setVisible(true);
	SettingsGUI3.getUnSolvedBoard().setVisible(false);
}
}
