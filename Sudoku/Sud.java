import java.util.Random;
public class Sud{
 
    private int[][]puzzle = new int[9][9];
    
    public Sud(){
	for (int row = 0; row < 9; row ++){
	    for (int col = 0; col < 9; col ++){
		puzzle[row][col] = 0;
	    }
	}
    }

    //toString====================================================================

    public String toString(){
	String ans = "";
	for (int row = 0; row < 9; row ++){
            for (int col = 0; col < 9; col ++){
		ans += "[" + puzzle[row][col] + "]";
	    }
	    ans += "\n";
	}
	return ans;
    }

    //Adding====================================================================

    public void fill(){
	Random rand= new Random();
	for (int num = 0; num < 9; num++){
	    for (int moreRow = 0; moreRow < 7; moreRow += 3){
		int row = rand.nextInt(3) + moreRow;
		for (int moreCol = 0; moreCol <7; ){
		    int col = rand.nextInt(3) + moreCol;
		    if (puzzle[row][col] == 0){
			puzzle[row][col] = num;
			moreCol += 3;
		    }	
		}
	    }
	}
    }
		    

    
    
    //============================================================================
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

    //===========================================================================
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





    //main===============================
    public static void main(String []args){
	Sud s1 = new Sud();
	s1.fill();
	System.out.println(s1);

    }

}