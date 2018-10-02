/*
MD Abir A. Choudhury
Class 2 - 09142018
*/

import javax.swing.JOptionPane;

public class learnGUI {

    public static void main(String[] args) {
        // Declare variables
        int number1, number2, sum;
    
        // Getting input from inputbox
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number: "));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number: "));
        
        // Add the numbers
        sum = number1 + number2;

        // Display the result
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Addition GUI", JOptionPane.PLAIN_MESSAGE);
    }
}