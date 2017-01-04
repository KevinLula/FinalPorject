import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class SettingsGUI2{
    private JLabel j;
    private JTextField t;
    private JButton b, b2, b3, b4;
    
    public static void drawFrame(){
	JFrame frame = new JFrame("Game Settings");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        JButton b = new JButton("Easy");
        JButton b2 = new JButton("Medium");
        b2.setPreferredSize(new Dimension (50,50));
        JButton b3 = new JButton("Hard");
	frame.add(b, BorderLayout.LINE_START);
	frame.add(b2, BorderLayout.CENTER);
	frame.add(b3, BorderLayout.LINE_END);
	JPanel twinPane = new JPanel();
	frame.add(twinPane, BorderLayout.PAGE_START);
	twinPane.setLayout(new FlowLayout());
	t = new JTextField(10);
	j = new JLabel("Board Number");
	JButton b4 = new JButton("Create");
	twinPane.add(t);
	twinPane.add(j);
	twinPane.add(b4);
    }
    
    public static void main(String [] args){
	SettingsGUI2 a = new SettingsGUI2();
	a.drawFrame();
    }
}
