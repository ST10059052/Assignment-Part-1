/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part.pkg2.of.assignment.programming;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesse Viljoen
 */
public class Part2OfAssignmentProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
      JOptionPane.showMessageDialog(null,"Welcome to EasyKanban"); 
        
        String inputString, inputOption;
         int option;
   inputOption = JOptionPane.showInputDialog("Choose Option 1 - 3 if not program will fail");
    option = Integer.parseInt(inputOption);
    while (option == 1)
    {
        
        inputOption = JOptionPane.showInputDialog("Add task ");
        option = Integer.parseInt(inputOption);
   
   
 int num[] = {1,2,3,4,5,6,7};
        char choice = 0;

            String showInputDialog = JOptionPane.showInputDialog("How many task do you what? ");
       
        for(int x: num) {
           
            switch (choice) {
                case 1 -> {
                    String showInputDialog1 = JOptionPane.showInputDialog(null,"New task");
                }
                case 2 -> {
                    String showInputDialog2 = JOptionPane.showInputDialog(null,"New task" );
                }
                case 3 -> {
                    String showInputDialog3 = JOptionPane.showInputDialog(null, "New task");
                }
                case 4 -> {
                    String showInputDialog4 = JOptionPane.showInputDialog(null, "New task");
                }
                case 5 -> {
                    String showInputDialog5 = JOptionPane.showInputDialog(null, "New task");
                }
                case 6 -> {
                    String showInputDialog6 = JOptionPane.showInputDialog(null,"New task" );
                }
                case 7 -> {
                    String showInputDialog7 = JOptionPane.showInputDialog(null,"New task");
                }
                default -> {
                }
            }
     

    }
        


        

        
            
        
        
        
    
    while (option == 2)
    {
        
        inputOption = JOptionPane.showInputDialog("Show report - this feature is still in development. Coming Soon");
        option = Integer.parseInt(inputOption);
    }
    while (option == 3)
    {
     
        inputOption = JOptionPane.showInputDialog("Quit");
        option = Integer.parseInt(inputOption);
    }
        
    }
    
}
}
