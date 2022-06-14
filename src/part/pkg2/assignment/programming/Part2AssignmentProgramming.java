/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part.pkg2.assignment.programming;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Jesse Viljoen
 */
public class Part2AssignmentProgramming {

    private static String strTaskNumber;
    private static Object taskDescription;
    private static String Task;
    private static String strTaskName1;
    private static String strTaskName;
   
  static String toUpperCase;
    private static int diff;
   
  

    /**
     * @param args the command line arguments
 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null,"Welcome to EasyKanban"); 
        
        String inputString, inputOption;
         int option;
   inputOption = JOptionPane.showInputDialog("Choose Option 1 - 3 if not program will fail");//This will fail or not run if the user type in other numbers thaat is not 1,2or 3 and caharters are not expectable//
    option = Integer.parseInt(inputOption);
    while (option == 1)
        //After the user choose this option  display the add task option for the user to enter//
    {
        
        inputOption = JOptionPane.showInputDialog("Add task ");// User type in 1 everytime this line of code will loop back to the begin of this of code, type in greater numbers than 1 to exit loop//
        option = Integer.parseInt(inputOption);
            
       
        for(int i =0; i<2;i++) {
             String showInputDialog = JOptionPane.showInputDialog("How many task do you want? ");// User type in 1 everytime this line of code will loop back to the begin of this of code, type in greater numbers than 1 to exit loop//
       
           
    }
     
                    
}
    String showInputDialog731 =JOptionPane.showInputDialog(null,"Task Name - Add login Feature(Must be mor than 4 characters ".toUpperCase()); 
      
      
            
            for (int i = 0; i<2; i++) {
             strTaskNumber = JOptionPane.showInputDialog(null,"Task Number"); 
            
}
       
             String showInputDialog111 = JOptionPane.showInputDialog(null,"Enter Task Description......."+taskDescription); 
         
             if(!taskDescription(length(50))){
                 JOptionPane.showMessageDialog(null,"Task successfully captured");
                 
             } else {
                 
                 JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 characters");
             }
         String showInputDialog45 = JOptionPane.showInputDialog(null,"Developer Details - First and last name"); 
        
         int hours =(60*60*1000);
         String diff1 = JOptionPane.showInputDialog(null,"How many hours?"+hours);
      
        
          String strTaskName12=showInputDialog731.substring(0,1)+showInputDialog731.substring(1,2)+":"+ strTaskNumber + ":"+showInputDialog731.substring(showInputDialog731.length() - 3);
       
     
                  
Object[] options = {"To Do", "Done", "Doing"};
        Object selectionObject = JOptionPane.showInputDialog(null, "Choose Task Status", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
      String selectionString = selectionObject.toString();//Users choice //
        
    Boolean:checkTaskDescription();
String:createTaskID();
String:printTaskDetails();
Int: returnTotalHours();


        Object[][] rows = {
    {selectionString  ,showInputDialog45   ,strTaskNumber   ,showInputDialog731  ,showInputDialog111   ,strTaskName12  ,diff1+"hrs"}};
        Object[] cols = {
    "Task Status"   ,"Developer Details"  ,"Task Number"  ,"Task Name"  , "Task Description" ,"Task ID" ,"Duration"
        };
JTable table = new JTable(rows, cols);
JOptionPane.showMessageDialog(null, new JScrollPane(table));
// This piece of code from Object to JOptionPane will display the information the user has typed into an table in order from Task Status to Duration//


while (option == 2)
    {
        
        inputOption = JOptionPane.showInputDialog("Show report - this feature is still in development. Coming Soon (Choose Option 1 - 3 if not program will fail)");
        option = Integer.parseInt(inputOption);
    }
  //This option is still in development//
    while (option == 3)
    {
     
        inputOption = JOptionPane.showInputDialog("Quit(Choose Option 1 - 3 if not program will fail)");
        option = Integer.parseInt(inputOption);
    
      }
        //This option lets the user quit the program//

    
} 
  

    private static int length() {
        
        return 50;
        
    }

    private static boolean taskDescription(boolean b) {
      
        return true;
      
    }

    private static void methodToTime() {
     
    }

    private static void checkTaskDescription() {
        
         
           
    }

    private static void createTaskID() {
        
  
    
          
    }

    private static void printTaskDetails() {
       
    }

    private static void returnTotalHours() {
       
    }

    private static boolean length(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class str {

        private static String toUpperCase;

        public str() {
        }
    }

    private static class goTHer45 {

        public goTHer45() {
        }
    }

    private static class strArray {

        private static String toString(int[] task3) {
            
            return null;
            
        }

        public strArray() {
        }
    }
} 
         
    
    
    
    
    
 
    
    
    

