import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import javax.swing.border.*;
import java.util.Calendar;

public class Board extends JFrame implements ActionListener{
    public int BoxNumber = 9;
    public Box[]boxes = new Box[BoxNumber];
    public JPanel panel = new JPanel (new GridLayout(3,3));
    public JPanel Buttons = new JPanel (new GridLayout(3,2));
    public JPanel Timer = new JPanel (new FlowLayout());
    public JLabel l, Seed1;
    public JButton b, b2;
    public Timer timer;
    public JTextField timeF, Seed;
    public Sudoku c = new Sudoku();
    private static final long serialVersionUID = 1L;
     
    public Board(){
	this.setLayout(new GridLayout(1,1));
        this.setTitle("Sudoku");
        this.setSize(800,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	boxes[0] = new Box(0,0,c);
	boxes[1] = new Box(3,0,c);
	boxes[2] = new Box(6,0,c);
        boxes[3] = new Box(0,3,c);
	boxes[4] = new Box(3,3,c);
	boxes[5] = new Box(6,3,c);   
        boxes[6] = new Box(0,6,c);
	boxes[7] = new Box(3,6,c);
	boxes[8] = new Box(6,6,c);   

	panel.add(boxes[0]);
	panel.add(boxes[1]);
	panel.add(boxes[2]);
	panel.add(boxes[3]);
	panel.add(boxes[4]);
	panel.add(boxes[5]);
	panel.add(boxes[6]);
	panel.add(boxes[7]);
	panel.add(boxes[8]);
	
        JButton b = new JButton("Solve");
	b.addActionListener(this);
	b.setActionCommand("Solve");
	JButton b2 = new JButton("Check");
	b2.addActionListener(this);
	b2.setActionCommand("Check");
	JTextField Seed = new JTextField("11385");
	Seed.setEditable(false);
	JLabel Seed1 = new JLabel("Seed:");
	Buttons.add(b);
	Buttons.add(b2);
	Buttons.add(Seed1);
	Buttons.add(Seed);

	l = new JLabel("Time:");
	timeF = new JTextField(10);
	timeF.setEditable(false);
	Timer.add(l);
	Timer.add(timeF);
	
	timer = new Timer(1000, new Listener());
	timer.start();
	
        this.add(panel);
	this.add(Buttons);
	this.add(Timer);
	

    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("Solve")){
	    Board2 d = new Board2(c);
	    d.setVisible(true);
	    this.setVisible(false);}
	if(event.equals("Check")){
	    String [][] Sudoku1 = new String [9][9];
	    int [][] Sudoku2 = new int [9][9];
	    Sudoku[0][0] = boxes[].get(cells[]);
	    Sudoku[1][0] = boxes[].get(cells[]);	    
	    Sudoku[2][0] = boxes[].get(cells[]);		    
	    Sudoku[0][1] = boxes[].get(cells[]);
	    Sudoku[1][1] = boxes[].get(cells[]);
	    Sudoku[2][1] = boxes[].get(cells[]);
	    Sudoku[0][2] = boxes[].get(cells[]);
	    Sudoku[1][2] = boxes[].get(cells[]);
	    Sudoku[2][2] = boxes[].get(cells[]);
	    Sudoku[3][0] = boxes[].get(cells[]);
	    Sudoku[4][0] = boxes[].get(cells[]);	    
	    Sudoku[5][0] = boxes[].get(cells[]);		    
	    Sudoku[3][0] = boxes[].get(cells[]);
	    Sudoku[4][0] = boxes[].get(cells[]);
	    Sudoku[5][0] = boxes[].get(cells[]);
	    Sudoku[3][0] = boxes[].get(cells[]);
	    Sudoku[4][0] = boxes[].get(cells[]);
	    Sudoku[5][0] = boxes[].get(cells[]);
	    	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);	    
	    Sudoku[][] = boxes[].get(cells[]);		    
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);	    
	    Sudoku[][] = boxes[].get(cells[]);		    
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);	    
	    Sudoku[][] = boxes[].get(cells[]);		    
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);	    
	    Sudoku[][] = boxes[].get(cells[]);		    
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);	    
	    Sudoku[][] = boxes[].get(cells[]);		    
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);	    
	    Sudoku[][] = boxes[].get(cells[]);		    
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);	    
	    Sudoku[][] = boxes[].get(cells[]);		    
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
	    Sudoku[][] = boxes[].get(cells[]);
    }

    class Listener implements ActionListener{
	String str = "";
	int hour = 00;
	int min = 00;
	int sec = 00;
	public void actionPerformed(ActionEvent e){
	    sec += 1;
	    if(sec > 59){
		sec = 0;
		min += 1;
	    }
	    if(min > 59){
		min = 0;
		hour += 1;
	    }
	    str = hour+":"+min+":"+sec;
	    timeF.setText(str);
	}
    }
}




