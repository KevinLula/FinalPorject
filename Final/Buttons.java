import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import javax.swing.border.*;

public class Buttons extends JPanel implements ActionListener{
    private JButton button;
    public Buttons(){
        this.setLayout(new GridLayout(2,1));
        JButton button = new JButton("Check");
	button.addActionListener(this);
	this.add(button);
    }

    public void actionPerformed(ActionEvent e){
	for
}
