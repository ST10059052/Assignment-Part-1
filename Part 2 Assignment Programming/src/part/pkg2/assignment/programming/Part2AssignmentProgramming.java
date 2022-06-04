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
    private static long Duration;
    static String toUpperCase;
   
  

    /**
     * @param args the command line arguments
 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null,"Welcome to EasyKanban"); 
        
        String inputString, inputOption;
         int option;
   inputOption = JOptionPane.showInputDialog("Choose Option 1 - 3 if not program will fail");
    option = Integer.parseInt(inputOption);
    while (option == 1)
    {
        
        inputOption = JOptionPane.showInputDialog("Add task ");
        option = Integer.parseInt(inputOption);
            int choice = 0;
   int num1[] = {1,2,3,4,5,6,7};
    String showInputDialog = JOptionPane.showInputDialog("How many task do you what? ");
       
        for(int x: num1) {
           }
    }
        int choice = 0;
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
                    
}
    String showInputDialog731 =JOptionPane.showInputDialog(null,"Task Name - Add login Feature".toUpperCase()); 
      
      
            
            for (int i = 0; i < 2; i++) {
             strTaskNumber = JOptionPane.showInputDialog(null,"Task Number"); 
            
}
       
             String showInputDialog111 = JOptionPane.showInputDialog(null,"Enter Task Description......."+taskDescription); 
         
             if(!taskDescription(length()<50)){
             JOptionPane.showMessageDialog(null,"Task successfully captured");
             
         } else {
             
             JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 characters");
         }
         String showInputDialog45 = JOptionPane.showInputDialog(null,"Developer Details - First and last name"); 
        
         long startTime = System.nanoTime();
         methodToTime();
         long endTime = System.nanoTime();
         long duration = (endTime - startTime);
      
        
          String strTaskName12=showInputDialog731.substring(0,1)+showInputDialog731.substring(1,2)+":"+ strTaskNumber + ":"+showInputDialog731.substring(showInputDialog731.length() - 3);
       
     
                  
Object[] options = {"To Do", "Done", "Doing"};
        Object selectionObject = JOptionPane.showInputDialog(null, "Choose Task Status", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
      String selectionString = selectionObject.toString();
        
    Boolean:checkTaskDescription();
String:createTaskID();
String:printTaskDetails();
Int: returnTotalHours();


        Object[][] rows = {
    {selectionString,showInputDialog45,strTaskNumber,showInputDialog731,showInputDialog111 ,strTaskName12,duration}};
        Object[] cols = {
    "Task Status","Developer Details","Task Number","Task Name", "Task Description","Task ID","Duration"
};
JTable table = new JTable(rows, cols);
JOptionPane.showMessageDialog(null, new JScrollPane(table));



      
   
 
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

    private static class str {

        private static String toUpperCase;

        public str() {
        }
    }

    private static class goTHer45 {

        public goTHer45() {
        }
    }
} 
         
    
    
    
    
    
 
    
    
    

