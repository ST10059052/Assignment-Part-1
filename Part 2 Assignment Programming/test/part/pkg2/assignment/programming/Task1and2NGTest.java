/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package part.pkg2.assignment.programming;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Jesse Viljoen
 */
public class Task1and2NGTest {
    
    public Task1and2NGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of Task1 method, of class Task1and2.
     */
    @Test
    public void testTask1() {
        System.out.println("Task1");
        Task1and2 instance = new Task1and2();
        instance.Task1();
        // TODO review the generated test code and remove the default call to fail.
        pass("The test case is a prototype.");
    }

    /**
     * Test of Task2 method, of class Task1and2.
     */
    @Test
    public void testTask2() {
        System.out.println("Task2");
        Task1and2 instance = new Task1and2();
        instance.Task2();
        // TODO review the generated test code and remove the default call to fail.
        pass("The test case is a prototype.");
    }

    private void pass(String the_test_case_is_a_prototype) {
 
    }
    
}
