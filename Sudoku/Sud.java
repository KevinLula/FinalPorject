import java.util.Random;
import java.util.ArrayList;
public class Sud{
 
    private int[][]puzzle = new int[9][9];
    private int[][]trial = new int[9][9];

    private int [][]ans = {{3,2,9,6,5,7,8,4,1},{7,4,5,8,3,1,2,9,6},{6,1,8,2,4,9,3,7,5},{1,9,3,4,6,8,5,2,7},{2,7,6,1,9,5,4,8,3,},{8,5,4,3,7,2,6,1,9},{4,3,2,7,1,6,9,5,8},{5,8,7,9,2,3,1,6,4},{9,6,1,5,8,4,7,3,2}};
    
    ArrayList<Integer> Row = new ArrayList<Integer>();
    ArrayList<Integer> Col = new ArrayList<Integer>();
    
    public Sud(){
	for (int row = 0; row < 9; row ++){
	    for (int col = 0; col < 9; col ++){
		puzzle[row][col] = ans[row][col];
	    }
	}
	for (int row = 0; row < 9; row ++){
            for (int col = 0; col < 9; col ++){
                trial[row][col] = 0;
            }
        }
	Random rand = new Random();
	for (int i = 0; i < rand.nextInt(1000)*100;i++){
	    mix();
	}
	
	refillRow();
	refillCol();
    }

    //toString====================================================================

    public String toString(){
	String answer = "";
	for (int row = 0; row < 9; row ++){
            for (int col = 0; col < 9; col ++){
		answer += "[" + ans[row][col] + "]";
	    }
	    answer += "\n";
	}
	return answer;
    }

    //refill arraylist=========================================================

    public void refillRow(){
	Row.clear();
	for (int i = 0; i < 10; i ++){
	    Row.add(i);
	}
    }

    public void refillCol(){
        Col.clear();
	for (int i = 0; i < 10; i ++){
            Col.add(i);
        }
    }

    //Adding====================================================================

    public void fill(){
	int counter = 0;
	Random rand= new Random();
	for (int num = 1; num <6; num++){
	    for (int moreRow = 0; moreRow < 7; moreRow += 3){
		for (int moreCol= 0; moreCol < 7; ){
		    
		    if (rand.nextInt(100) != 1){
			while (counter < 1000000){
			    int row = rand.nextInt(3) + moreRow;
			    int col = rand.nextInt(3) + moreCol;
			    if (puzzle[row][col] == 0){//if there is a blank spot
				if (Row.contains(row) && Col.contains(col)){//if the row and column have not been used yet
				    trial[row][col] = num;
				    moreCol += 3;
				    Row.set(row,10);
				    Col.set(col,10);
				    counter = 1000000;
				}	
			    }
			    counter ++;
			}
			
			counter = 0;
		    }
		    else{
			moreCol += 3;
		    }
		}
	    }
	    trialToPuz();
	    refillRow();
	    refillCol();
	}
    }
		    
    //========================================

    public void puzToTrial(){
	for (int row = 0;row < 9; row++){
	    for (int col = 0;col < 9;col++){
		trial[row][col] = puzzle[row][col];
	    }
	}
    }

    public void trialToPuz(){
        for (int row = 0;row < 9; row++){
            for (int col = 0;col < 9;col++){
                puzzle[row][col] = trial[row][col];
            }
	}
    }
    

    //NEW FILL====================================

    public void newFill(){
	Random rand = new Random();
	for (int max = 0; max < 9; max ++){
	    for (int row = 0; row <= max; row++){
		for (int col = 0; col <= max; col++){
		    puzzle[row][col] = rand.nextInt(9)+1;
		    System.out.println(!checkColRow(row,col));
		    if (!whichBoxCheck(row,col) || !checkColRow(row,col)){
			puzzle[row][col]=trial[row][col];
			col--;
		    }
		    else{
		       
		    }
		}
	    }
	}
    }
    
    //===========================================
    public boolean checkColRow(int row, int col){
	for (int c = 0;c < 9; c ++){
	    if (puzzle[row][c] == puzzle[row][col]){
		return false;
	    }
	}
	for (int r = 0;r < 9;r++){
	    if (puzzle[r][col] == puzzle[row][col]){
		return false;
	    }
	}
	return true;
    }
		    
		    
    //===========================================
    
    //UNNECESSARY============================================================================
    public boolean whichBoxCheck(int row, int col){
	if (row < 3 && col < 3){
	    return boxCheck(row,col,0,3,0,3);
	}
	else if (row < 3 && col < 6){
	    return boxCheck(row,col,0,3,3,6);
	}
	else if (row < 3 && col < 9){
	    return boxCheck(row,col,0,3,6,9);
	}
	else if (row < 6 && col < 3){
	    return boxCheck(row,col,3,6,0,3);
	}
	else if (row < 6 && col < 6){
	    return boxCheck(row,col,3,6,3,6);
	}
	else if (row < 6 && col < 9){
	    return boxCheck(row,col,3,6,6,9);
	}
	else if (row < 9 && col < 3){
	    return boxCheck(row,col,6,9,0,3);
	}
	else if (row < 9 && col < 6){
	    return boxCheck(row,col,6,9,3,6);
        }
	else {
	    return boxCheck(row,col,6,9,6,9);
        }
    }

    //UNNECESSARY===========================================================================
    public boolean boxCheck(int r, int c,int rmin, int rmax, int cmin, int cmax){
	for (int row = rmin; row < rmax; row ++){
	    for (int col = cmin;col < cmax; col ++){
		if (row != r && col != c){
		    if (puzzle[row][col]==(puzzle[r][c])){
			return false;
		    }
		}
	    }
	}
	return true;
    }

    //============================

    public void mix(){
	Random rand = new Random();
	
	for (int i = 0; i<3;i++){
	    int row = rand.nextInt(3);
	    row += (3*i);
	    int[]temp = ans[row];
	    int newRow = rand.nextInt(3) + (3*i);
	    ans[row] = ans[newRow];
	    ans[newRow] = temp;
	    
	}
	
	
	for (int i = 0; i<3;i++){
	    int col = rand.nextInt(3);
	    col += (3*i);
	    for (int r = 0; r<9;r++){
		int temp = ans[r][col];
		int newCol = rand.nextInt(3) + (3*i);
		ans[r][col] = ans[r][newCol];
		ans[r][newCol] = temp;
	    }
	}
		

	
    }
	    


    //main===============================
    public static void main(String []args){
	Sud s1 = new Sud();
	//s1.newFill();
	System.out.println(s1);
	
    }

}