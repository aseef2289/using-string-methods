/*
* File Name: Main.java
* Author: Aseef Ali Hasan
* Date: August 16, 2021
* Description:
* This program uses string methods
* It can...
* Find the length of a string
* Turn a string into all caps
* Find the character in the 4th spot
* Check if 2 strings are identical 
* Check if a letter is in a string
* Output characters 4 to 6
* Replace characters 
* Displays information through a GUI
*/

//Import classes used for the GUI
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

class Main {
  //Class variables
  //All the elements needed to build GUI 
  static JFrame frmMain;

  static JLabel lblTitle;

  static JLabel lblLength;
  static JLabel lblCaps;
  static JLabel lblFourthSpot;
  static JLabel lblIdentical;
  static JLabel lblLetterFound;
  static JLabel lblCharacters;
  static JLabel lblReplace;
  
  static JTextField txtLength;
  static JTextField txtCaps;
  static JTextField txtFourthSpot;
  static JTextField txtIdenticalOne;
  static JTextField txtIdenticalTwo;
  static JTextField txtLetterOne;
  static JTextField txtLetterTwo;
  static JTextField txtCharacterInput;
  static JTextField txtReplaceA;

  static JTextArea txtLengthOf;
  static JTextArea txtAllCaps;
  static JTextArea txt4thSpot;
  static JTextArea txtIdentical;
  static JTextArea txtLetterFound;
  static JTextArea txtCharacters;
  static JTextArea txtReplace;

  static JButton btnLength;
  static JButton btnCaps;
  static JButton btnFourthSpot;
  static JButton btnIdentical;
  static JButton btnLetterFound;
  static JButton btnCharacters;
  static JButton btnReplace;
  
  //Stores the string to find the length of 
  static String lengthInput;
  //Stores the string to turn uppercase
  static String capsInput;
  //Stores the string to find the 4th letter of
  static String fourthInput;
  //Stores two strings to check if identical
  static String identicalInputOne;
  static String identicalInputTwo;
  //Stores the user's string 
  //and letter to check for in the string
  static String letterInputOne;
  static String letterInputTwo;
  //Stores string to find characters 4-6
  static String charactersInput;
  //Stores string to replace "a" with "x"
  static String replaceInput;
  
  //Stores boolean to see if two strings are equal
  static boolean identical;
  //Stores number of characters are found in user's string
  static int found;
  
  //Stores length of string
  static String lengthAnswer;
  //Stores string in all caps
  static String capsAnswer;
  //Stores the 4th character 
  static String fourthAnswer;
  //Stores answer of if 2 strings are identical 
  static String identicalAnswer;
  //Stores if letter is found or not
  static String letterAnswer;
  //Stores characters 4-6
  static String charOne;
  static String charTwo;
  static String charThree;
  //Stores the string with replaces letters
  static String replaceAnswer;

    public static void main(String[] args) {
        /*
        * Initialize all GUI elements and place them in the form
        */
        //setting up the main frame
        frmMain = new JFrame("Super String Software");
        //stops program when user closes window
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //allows for specific element locations
        frmMain.setLayout(null);
        //makes window visible to user
        frmMain.setVisible(true);
        frmMain.setBounds(10, 10, 800, 600);
        
        //setting title position and adding to frame
        lblTitle = new JLabel("Super String Software");
        lblTitle.setBounds(275, 10, 300, 20);
        frmMain.add(lblTitle);

        //add length of string label
        lblLength = new JLabel("Enter a string. The program will output the "
                + "number of characters in the string:");
        lblLength.setBounds(10, 40, 700, 20);
        frmMain.add(lblLength);
        //add text field for user's string 
        txtLength = new JTextField();
        txtLength.setBounds(10, 70, 200, 30);
        frmMain.add(txtLength);
        //add button to find length of string
        btnLength = new JButton("Length");
        btnLength.setBounds(250, 70, 100, 30);
        frmMain.add(btnLength);
        //add text area to show answer
        txtLengthOf = new JTextArea("...");
        txtLengthOf.setBounds(400, 70, 200, 30);
        //makes text area not editable 
        txtLengthOf.setEditable(false); 
        frmMain.add(txtLengthOf);
        
        //add all caps label
        lblCaps = new JLabel("Enter a string using lowercase letters. The "
                + "program will output the string in all capital letters:");
        lblCaps.setBounds(10, 100, 700, 20);
        frmMain.add(lblCaps);
        //add text field for user's string
        txtCaps = new JTextField();
        txtCaps.setBounds(10, 130, 200, 30);
        frmMain.add(txtCaps);
        //add button to turn string into all caps
        btnCaps = new JButton("All Caps");
        btnCaps.setBounds(250, 130, 100, 30);
        frmMain.add(btnCaps);
        //add text area to show answer
        txtAllCaps = new JTextArea("...");
        txtAllCaps.setBounds(400, 130, 200, 30);
        //makes text area not editable 
        txtAllCaps.setEditable(false);
        frmMain.add(txtAllCaps);
        
        //add label for character in 4th spot 
        lblFourthSpot = new JLabel("Enter a string. The program will output the "
                + "character in the fourth spot:");
        lblFourthSpot.setBounds(10, 160, 700, 20);
        frmMain.add(lblFourthSpot);
        //add text area for user's string 
        txtFourthSpot = new JTextField();
        txtFourthSpot.setBounds(10, 190, 200, 30);
        frmMain.add(txtFourthSpot);
        //add button to find character in 4th spot 
        btnFourthSpot = new JButton("4th Spot");
        btnFourthSpot.setBounds(250, 190, 100, 30);
        frmMain.add(btnFourthSpot);
        //add text area to show answer
        txt4thSpot = new JTextArea("...");
        txt4thSpot.setBounds(400, 190, 250, 30);
        //makes text area not ediable
        txt4thSpot.setEditable(false);
        frmMain.add(txt4thSpot);
        
        //add label for checking if two strings are identical
        lblIdentical = new JLabel("Enter two strings. The program will output "
                + "wheter or not they are identical:");
        lblIdentical.setBounds(10, 220, 800, 20);
        frmMain.add(lblIdentical);
        //add text field for first string
        txtIdenticalOne = new JTextField();
        txtIdenticalOne.setBounds(10, 250, 200, 30);
        frmMain.add(txtIdenticalOne);
        //add text field for second string 
        txtIdenticalTwo = new JTextField();
        txtIdenticalTwo.setBounds(220, 250, 200, 30);
        frmMain.add(txtIdenticalTwo);
        //add button to check if strings are identical 
        btnIdentical = new JButton("Identical?");
        btnIdentical.setBounds(430, 250, 150, 30);
        frmMain.add(btnIdentical);
        //add text to show answer
        txtIdentical = new JTextArea("...");
        txtIdentical.setBounds(600, 250, 100, 30);
        //makes text area not editable 
        txtIdentical.setEditable(false);
        frmMain.add(txtIdentical);
        
        //add label for finding a letter in a string 
        lblLetterFound = new JLabel("Enter a string and a letter. The program "
                + "will output whether or not the letter is found in the string:");
        lblLetterFound.setBounds(10, 280, 800, 20);
        frmMain.add(lblLetterFound);
        //add text field for user's string 
        txtLetterOne = new JTextField();
        txtLetterOne.setBounds(10, 310, 200, 30);
        frmMain.add(txtLetterOne);
        //add text field for letter they want to check for 
        txtLetterTwo = new JTextField();
        txtLetterTwo.setBounds(220, 310, 50, 30);
        frmMain.add(txtLetterTwo);
        //add button to check for letter in string 
        btnLetterFound = new JButton("Letter Found?");
        btnLetterFound.setBounds(280, 310, 150, 30);
        frmMain.add(btnLetterFound);
        //add text area to show answer 
        txtLetterFound = new JTextArea("...");
        txtLetterFound.setBounds(450, 310, 200, 30);
        //makes text area not ediable 
        txtLetterFound.setEditable(false);
        frmMain.add(txtLetterFound);
        
        //add label for seeing characters 4-6
        lblCharacters = new JLabel("Enter a string that is at least 8 "
                + "characters long. The program will outputs characters 4 to 6:");
        lblCharacters.setBounds(10, 340, 700, 20);
        frmMain.add(lblCharacters);
        //add text field for user's string 
        txtCharacterInput = new JTextField();
        txtCharacterInput.setBounds(10, 370, 200, 30);
        frmMain.add(txtCharacterInput);
        //add button to find characters 4-6
        btnCharacters = new JButton("Characters 4 to 6");
        btnCharacters.setBounds(230, 370, 200, 30);
        frmMain.add(btnCharacters);
        //add text area to show answer
        txtCharacters = new JTextArea("...");
        txtCharacters.setBounds(440, 370, 200, 30);
        //makes text area not editable 
        txtCharacters.setEditable(false);
        frmMain.add(txtCharacters);
        
        //add label for replacing "a" with "x"
        lblReplace = new JLabel("Enter a string that contains at least one "
                + "\"a\". The program will replace all occurences of the letter \"a\" "
                + "with \"x\"");
        lblReplace.setBounds(10, 400, 800, 20);
        frmMain.add(lblReplace);
        //add text field for user's string 
        txtReplaceA = new JTextField();
        txtReplaceA.setBounds(10, 430, 200, 30);
        frmMain.add(txtReplaceA);
        //add button to replace "a" with "x"
        btnReplace = new JButton("Replace a");
        btnReplace.setBounds(230, 430, 150, 30);
        frmMain.add(btnReplace);
        //add text area to show answer
        txtReplace = new JTextArea("...");
        txtReplace.setBounds(400, 430, 200, 30);
        //makes text area not editable 
        txtReplace.setEditable(false);
        frmMain.add(txtReplace);
        
        //adds button to find length of string to action listener 
        btnLength.addActionListener((ActionEvent e)-> {
            //stores user's input in string 
            lengthInput = txtLength.getText();

            //find length of string 
            lengthAnswer = String.valueOf(lengthInput.length());
            //puts answer in text area for user
            txtLengthOf.setText(lengthAnswer + " characters");
        });//end of action listener for this button
        
        //adds button to turn string to all caps to action listener
        btnCaps.addActionListener((ActionEvent e)-> {
            //stores user's input in a string 
            capsInput = txtCaps.getText();

            //turns string to all caps
            capsAnswer = capsInput.toUpperCase();
            //puts answer in the text area for the user
            txtAllCaps.setText(capsAnswer);
        });//end of action listener for this button 
        
        //adds button to find character in 4th spot to action listener
        btnFourthSpot.addActionListener((ActionEvent e)-> {
            //stores user's input in a string 
            fourthInput = txtFourthSpot.getText();
            
            //finds character at 4th spot (3rd index value)
            fourthAnswer = String.valueOf(fourthInput.charAt(3));
            //puts answer in text area for user
            txt4thSpot.setText("The character in the 4th spot is " 
                                + "\"" + fourthAnswer + "\"");
        });//end of action listener for this button 
        
        //adds button to check if strings are identical 
        //to action listener 
        btnIdentical.addActionListener((ActionEvent e)-> {
            //Stores both inputs in strings 
            identicalInputOne = txtIdenticalOne.getText();
            identicalInputTwo = txtIdenticalTwo.getText();
            
            //stores if strings are identical in a boolean
            identical = identicalInputOne.equals(identicalInputTwo);           

            //stores value of boolean in a string 
            identicalAnswer = String.valueOf(identical);
            //puts answer in text area for user 
            txtIdentical.setText(identicalAnswer);
        });//end of action listener for this button 
        
        //adds button to find user's letter in string to action listener
        btnLetterFound.addActionListener((ActionEvent e)-> {
            //Stores user's string 
            letterInputOne = txtLetterOne.getText();
            //Stores user's letter 
            letterInputTwo = txtLetterTwo.getText();
            
            //Stores the index number of where the user's
            //letter is located 
            found = letterInputOne.indexOf(letterInputTwo);
            
            //Actions if the index number is greater than or equal to 0
            if (found >= 0){
                //The character is present 
                letterAnswer = "The character is present";
                //Puts answer in text area for user 
                txtLetterFound.setText(letterAnswer);
            }
            //Actions if there is no index number found
            else{
                //The character is not present 
                letterAnswer = "The character is not present";
                //Puts answer in text area for user
                txtLetterFound.setText(letterAnswer);
            }
        });//end of action listener for this button 
        
        //Adds button to find 4-6th characters to action listener
        btnCharacters.addActionListener((ActionEvent e)-> {
            //Stores user's input in a string 
            charactersInput = txtCharacterInput.getText();
            
            //Finds the character at 4th spot (3rd index)
            charOne = String.valueOf(charactersInput.charAt(3));
            //Finds the character at 5th spot (4th index)
            charTwo = String.valueOf(charactersInput.charAt(4));
            //Finds the character at 6th spot (5th index)
            charThree = String.valueOf(charactersInput.charAt(5));
            //Puts answer in text area for user
            txtCharacters.setText(charOne + ", " + charTwo + ", " + charThree);
        });//end of action listener for this button 
        
        //adds button to replace "a" with "x" to action listener
        btnReplace.addActionListener((ActionEvent e)-> {
            //stores user's input in a string 
            replaceInput = txtReplaceA.getText();
            
            //Replaces "a" with "x"
            replaceAnswer = replaceInput.replace("a", "x");
            //Puts answer text area for user
            txtReplace.setText(replaceAnswer);
        });//end of action listener for this button
    }//end of main method 
    
}//end of class method 
