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
public class TestAssertEqualsNGTest {
    
    public TestAssertEqualsNGTest() {
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
     * Test of TestAsserEquals method, of class TestAssertEquals.
     */
    @Test
    public void testTestAsserEquals() {
        System.out.println("TestAsserEquals");
        TestAssertEquals instance = new TestAssertEquals();
        instance.TestAsserEquals();
        // TODO review the generated test code and remove the default call to fail.
        pass("The test case is a prototype.");
    }

    private void pass(String the_test_case_is_a_prototype) {
      
    }
    
}
