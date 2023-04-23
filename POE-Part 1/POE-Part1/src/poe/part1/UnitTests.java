/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.part1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Rizic
 */

public class UnitTests {
    
    @Test
    public void testcheckUserName() {
        Login myUnit = new Login();

        boolean result = myUnit.checkUserName("kyl_1");

        assertTrue(result);
    }
	
	@Test
    public void testCheckPasswordComplexity() {
        Login myUnit = new Login();

        boolean result = myUnit.checkPasswordComplexity("Ch&&sec@ke99!");

        assertTrue(result);
    }
	
	@Test
    public void testRegisterUser() {
        Login myUnit = new Login("Kyl_1", "Ch&&sec@ke99!");

        String result = myUnit.registerUser("Kyl_1", "Ch&&sec@ke99!");

        assertEquals("conditions have been met and the user has been registered successfully", result);
    }

    	@Test
    public void testLoginUser() {
        Login myUnit = new Login("Kyl_1", "Ch&&sec@ke99!");

        boolean result = myUnit.loginUser("Kyl_1", "Ch&&sec@ke99!");

        assertTrue(result);
    }
    
	@Test
    public void testReturnLoginStatus() {
        Login myUnit = new Login("Kyl_1", "Ch&&sec@ke99!");

        String result = myUnit.returnLoginStatus("Kyl_1", "Ch&&sec@ke99!");

        assertEquals("A successful login", result);
    }


}
