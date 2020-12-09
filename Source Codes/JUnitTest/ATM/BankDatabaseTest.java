package JUnitTest.ATM;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;

public class BankDatabaseTest 
{
    BankDatabase bankDatabase = new BankDatabase();
    @Test
   public void authenticateUserTest()
   {
      assertTrue(bankDatabase.authenticateUser(12345, 54321));
      assertTrue(bankDatabase.authenticateUser(98765, 56789));

      boolean expected = true;
      // test valid user login
      assertEquals(expected, bankDatabase.authenticateUser(12345, 54321));
      assertEquals(expected, bankDatabase.authenticateUser(98765, 56789));

      // test invalid user login
      expected = false;
      assertEquals(expected, bankDatabase.authenticateUser(12345, 12345));
      assertEquals(expected, bankDatabase.authenticateUser(32132, 00001));
   }

   @Test
   public void balanceInformationTest()
   {
       double availableBalance = bankDatabase.getAvailableBalance(12345);
       double totalBalance = bankDatabase.getTotalBalance(12345);

       assertNotNull(bankDatabase);

       assertEquals("Available Balance for acount number 12345", 1000.0, availableBalance, 2);
       assertEquals("Total Balance for acount number 12345", 1200.0, totalBalance, 2);
       availableBalance = bankDatabase.getAvailableBalance(98765);
       totalBalance = bankDatabase.getTotalBalance(98765);
       assertEquals("Available Balance for acount number 98765", 200.0, availableBalance, 2);
       assertEquals("Total Balance for acount number 98765", 200.0, totalBalance, 2);
   }
}
