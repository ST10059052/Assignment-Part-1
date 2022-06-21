/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part.pkg2.assignment.programming;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static part.pkg2.assignment.programming.string.length;

/**
 *
 * @author Jesse Viljoen
 */
public class Part2AssignmentProgramming {
    private static String toUpperCase() {
       
        return null;
       
    }

    private static int Integar(String showInputDialog) {
      
        return 0;
      
    }
    private static void checkTaskDescription() {
       
    }

    private static void createTaskID() {
        
    }

    private static void printTaskDetails() {
      
    }

    private static void returnTotalHours() {
       
    }

    private static boolean taskDescription(boolean b) {
       
        return true;
       
    }
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
        JOptionPane.showMessageDialog(null,"1)Add task    2)Show Report - Coming Soon     3)Quit");
   inputOption = JOptionPane.showInputDialog("Choose Option 1 - 3 if not program will fail");//This will fail or not run if the user type in other numbers thaat is not 1,2or 3 and caharters are not expectable//
    option = Integer.parseInt(inputOption);
    
    while (option == 1){ 
   
        //After the user choose this option  display the add task option for the user to enter//
    {
            
        int taskNumber =Integar(JOptionPane.showInputDialog("How many task do you want? "));
       
            
       
        for(int i =0; i<=taskNumber;i++) {
             
       // This for loop lets the user choose how many task the user wants//
         /////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    
     
                    

    String showInputDialog731 =JOptionPane.showInputDialog(null,"Task Name - Add login Feature".toUpperCase()); 
      String goto12 =showInputDialog731.toUpperCase();
      //If the user does not enter more than 4 characters for task name. This forces the user to enter more than 4characters if not the program will fail and the characters that users will be in Captial letters// 
            
            for (int k = 0; k<2; k++) {
             strTaskNumber = JOptionPane.showInputDialog(null,"Task Number"); 
            
}
         String showInputDialog111 = JOptionPane.showInputDialog(null,"Enter Task Description"); 
         
             if(length()>50){
                 
                 JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 characters");
             } else {
                 JOptionPane.showMessageDialog(null,"Task successfully captured");
                 
             }
         String showInputDialog45 = JOptionPane.showInputDialog(null,"Developer Details - First and last name"); 
        
         
         String diff1 = JOptionPane.showInputDialog(null,"How many hours?");
      
        
          String strTaskName12=goto12 .substring(0,1)+goto12.substring(1,2)+":"+ strTaskNumber + ":"+goto12 .substring(goto12 .length() - 3);
       
     
                  
Object[] options = {"To Do", "Done", "Doing"};
        Object selectionObject = JOptionPane.showInputDialog(null, "Choose Task Status", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
      String selectionString = selectionObject.toString();//Users choice  for the Task Status//
    
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
inputOption = JOptionPane.showInputDialog("Choose Option 2 or 3 if you are done adding how much tasks or task you want if not choose 1, Thank you");
option = Integer.parseInt(inputOption);// This will enable the user to exit the loop of repeating option 1 if the user is done adding their tasks//

  
 
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
    
      } //This option lets the user quit the program//
    }
    }}}}
    

   

 

  
    
    


        
        
    
        

    
    
   
    

         
    
    
    
    
    
 
    
    
    

