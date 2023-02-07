package Assignmnet4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RefactoringExistingSystemsTest {

    @Test
   public void testCheckLogInCredentials(){
       RefactoringExistingSystems login = new RefactoringExistingSystems();
       assertTrue(login.checkLogInCredentials("admin", "password"));
       assertTrue(login.checkLogInCredentials("user", "1234"));
       assertFalse(login.checkLogInCredentials("admin", "1234"));
        assertFalse(login.checkLogInCredentials("user", "password"));

   }

}