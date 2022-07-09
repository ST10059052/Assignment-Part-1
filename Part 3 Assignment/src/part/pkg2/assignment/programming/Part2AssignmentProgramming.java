/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part.pkg2.assignment.programming;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static part.pkg2.assignment.programming.string.length;

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
    private static String selectionString;
    private static String wordToRemove;
    private static String k;
    
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


    

   



    /**
     * @param args the command line arguments
 
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        JOptionPane.showMessageDialog(null,"Welcome to EasyKanban"); 
        
        String inputString, inputOption;
         int option;
        JOptionPane.showMessageDialog(null,"1)Add task    2)Show Report - Coming Soon     3)Quit");
   inputOption = JOptionPane.showInputDialog("Choose Option 1  to continue to option 2 or 3 if not program will fail");//This will fail or not run if the user type in other numbers thaat is not 1,2or 3 and caharters are not expectable//
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
        
        inputOption = JOptionPane.showInputDialog("""
                                                  Show report options are: 10 = Display the Developer, Task Names and Task Duration for all tasks with the status of
                                                  done / 14 = Display the Developer and Duration of the class with the longest duration. / 12 = Search for all tasks assigned to a developer and display the Task Name and Task
                                                  Status. / 15 = Search for a task with a Task Name and display the Task Name, Developer and Task
                                                  Status. / 17 = Delete a task using the Task Name. / 19 = Display a report that lists the full details of all captured tasks. / Enter one of there option if not exit on number 3 """);
        option = Integer.parseInt(inputOption);//Option 2 will show the report which is populate with test data in the arrays//
String [] arrshowInputDialog7313 = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};//This array is populate with the developer test data//
    String [] arrshowInputDialog454 = {"Create Login", "Create Features", "Create Reports", "Add Arrays"};//This array is populate with the task name test data//
    int [] arrdiff17 = {5, 8, 2, 11};//This array is populate with the task duration test data//
    String [] arrselectionString  = {"To Do", "Doing", "Done", "To Do"}; //This array is populate with the task status test data//  
   String [] strTaskName126 ={goto12 .substring(0,1)+goto12.substring(1,2)+":"+ strTaskNumber + ":"+goto12 .substring(goto12 .length() - 3)};
        
    
     

   while(option== 10){
       inputOption = JOptionPane.showInputDialog("Exit on number 3 ");
       option = Integer.parseInt(inputOption);
    JOptionPane.showMessageDialog(null,"The Tasks are : ");//This will display the task as it is in the condition below//
    for(int m = 0; m < arrshowInputDialog454.length && m < arrshowInputDialog7313.length; m ++){
       //This for loop sets the condition that should only diplay the developer, task names and task duration for the tasks with the status of done//
     JOptionPane.showMessageDialog(null,arrshowInputDialog7313[m] + "| Duration of " + arrdiff17[m] + " Hours | Task Name " + arrshowInputDialog454[m] +
             "\n" + "| Current Status " + arrselectionString [m] );
      //This JOptionPane will print out the condition of the for loop in order of the placement within the JOptionPane.showMessageDialog//
     
    }}

while(option==14){
     inputOption = JOptionPane.showInputDialog("Exit on number 3 ");
    option = Integer.parseInt(inputOption);
    JOptionPane.showMessageDialog(null,"The longest task is: ");
    // This JOptionPane will show what the longest task that have the longest duration with the developer//
    int jessev = arrdiff17[0];//The task duration is set within int jessev so that it can pass the values of the task duration//
    String viljoen = arrshowInputDialog7313[0];//The developer test data  variablhe is pass in the String of viljoen//
     for(int m = 0; m <arrdiff17.length; m++)
    {//This loop for makes the condition to set a certaian length on the task duration//
        
        if(arrdiff17[m] > jessev)
        {//The if statement sets the condition of task duration must be bigger than developer//
        jessev = arrdiff17[m];//The task duration is set within int jessev so that it can pass the values of the task duration//
        viljoen = arrshowInputDialog7313[m];//The developer test data  variablhe is pass in the String of viljoen//
        }    
    }
    
    
    JOptionPane.showMessageDialog(null,"The Name of the person with the longest task is : " + viljoen + 
            "\n" + "The task duration is: " + jessev + " Hours");//This JOptionPane will display to what the conditions are to the values of task duration and developer//
}
    while(option==12){
         inputOption = JOptionPane.showInputDialog("Exit on number 3 ");
        option = Integer.parseInt(inputOption);
    JOptionPane.showMessageDialog(null,"Searching using Employee name");//This JOptionPane.showMessageDialog will show "Searching using Employee name"//
    String G = JOptionPane.showInputDialog(null,"Enter the name of ther employee to search: ");//This String allows what the user has inputed to pass into String G//
    boolean dance = true;// A bolean//
   for(int m = 0; m < arrdiff17.length; m++)
    {//This loop for makes the condition to set a certaian length on the task duration//
     
      if (arrshowInputDialog7313[m].equalsIgnoreCase(G)){
        //The if statement sets the condition to ignore whats in the block below if it is not the as what it is the developer array//
          dance = true;
          JOptionPane.showMessageDialog(null,"The report for " + arrshowInputDialog7313[m] +
                  "\n " + arrdiff17[m] + " Hours, and the task is: " + arrshowInputDialog454[m]);
              }  
        
    }
    
    if(dance == false){
        JOptionPane.showMessageDialog(null,"The Name was not found");
    }}
   while(option == 15){
        inputOption = JOptionPane.showInputDialog("Exit on number 3 ");
       option = Integer.parseInt(inputOption);
    JOptionPane.showMessageDialog(null,"Searching using Task name");
    String O = JOptionPane.showInputDialog(null,"Enter the Task: ");
    boolean doun = true;
    for(int m = 0; m< arrdiff17.length; m++)
    {//This loop for makes the condition to set a certaian length on the task duration//
     
      if (arrshowInputDialog454[m].equalsIgnoreCase(O)){
         //The if statement sets the condition to ignore whats in the block below if it is not the as what it is the task name array//
          doun = true;
          JOptionPane.showMessageDialog(null,"The task is: " + arrshowInputDialog7313[m] + ", " + arrshowInputDialog454[m]);
              }  
        
    }
    
    if(doun == false){
        JOptionPane.showMessageDialog(null,"The Name was not found");
    }}
    while(option == 17){
         inputOption = JOptionPane.showInputDialog("Exit on number 3 ");
        option = Integer.parseInt(inputOption);
    String lookie = JOptionPane.showInputDialog(null, "What task would you like to remove?");
   int indexless = 0;
    String[] lessTasks = new String[arrshowInputDialog454.length-1];
    for(int m = 0; m < (arrshowInputDialog454.length-1); m++){
     if(!arrshowInputDialog454[m].equalsIgnoreCase(lookie))
    lessTasks[indexless]=arrshowInputDialog454[m];
    indexless++;
    JOptionPane.showMessageDialog(null,arrshowInputDialog7313[m] + " | Task: " +lessTasks[m] +  " | Hours:  " +
            "\n"+ arrdiff17[m] +  " | Status:" +arrselectionString [m] );
    }
    JOptionPane.showMessageDialog(null,"Task " + lookie +" removed");
    }
    while(option == 19){
         inputOption = JOptionPane.showInputDialog("Exit on number 3 ");
        option = Integer.parseInt(inputOption);
         String []buiilde4 ={" Developer: "+ Arrays.toString(arrshowInputDialog7313)+"  Task ID  "+Arrays.toString(strTaskName126) +"    Task Names:  "+Arrays.toString(arrshowInputDialog454)+"   Task Duration  "+Arrays.toString(arrdiff17)+"    Task Status "+Arrays.toString(arrselectionString)};
         JOptionPane.showMessageDialog(null,buiilde4 );
    }
     
        
     
     
             
    while (option == 3)
    {
     
        inputOption = JOptionPane.showInputDialog("Quit(Choose a number mote than 4 or equal to quit)");
        option = Integer.parseInt(inputOption);
    
      } //This option lets the user quit the program//
           
    }
          
    }}}
    }
    
    private static void printWords(String[] words) {
       
    }

   
}

  
    

   
    

    
    

   
    

   

 

  
    
    


        
        
    
        

    
    
   
    

         
    
    
    
    
    
 
    
    
    

