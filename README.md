# FinalPorject
The final project

DESCRIPTION and WORKING FEATURES

Our project creates sudoku puzzles for the user to interact with.Theres a whole variety of them, and the user can choose difficulty, and even the seed to try to solve the same puzzle again. There is also a timer that shows how long the user has been working on the the sudoku problem, and if the give up, they can either create a new puzzle aor check the solution. 

UNRESOLVED BUGS

We wanted to create a "Check" button that would check each individual inputted number but could not figure it out. This was due to the difficulty in obtaining the text from the boxes considering that each box is a seperate enitity. Therefore the texts would have to be taken from each cell in each box in which would correspond to the String[9][9] that would be created to house them. Afterwards the String[9][9] would be changed to an int[9][9] and functions from Sudoku wouldbe used to determine if the given 2DArray complies with all the rules of Sudoku. Though merely obtaining the text from the cells was difficult due to the way that the Sudoku board was arranged leading to errors based upon the text (not number) that might've been put in the box or an empty box. After determining if the Sudoku would have worked a color would have been given to the textFields either red or green correspinding to wrong or right respectively. Though since the String[9][9] could not be made the following methods could not be implemented.

HOW TO COMPILE

GO to the Final folder and from there compile the file SettingsGUI3.java

HOW TO USE IT

When you run SettingsGUI3, a window will pop up. From there you can click on Easy, Medium, or Hard to create a random sudoku puzzle with the corresponding difficulty. Another option is submit a seed(integer) and type the difficulty you want(case sensitive) and click create.

