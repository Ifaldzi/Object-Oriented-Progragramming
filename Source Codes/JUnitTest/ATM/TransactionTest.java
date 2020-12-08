package JUnitTest.ATM;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

public class TransactionTest {

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    BankDatabase bankDatabase = new BankDatabase();

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutputMessage(int start)
    {
        String output = new String();
        byte[] byteout = testOut.toByteArray();
        for(int i=start;i<byteout.length-2;i++)
        {
            output += (char)byteout[i];
        }
        return output;
    }

    private void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void withdrawalTest() {
        final String testString = "5\n5\n6";
        provideInput(testString);
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        Screen screen = new Screen();
        Keypad keypad = new Keypad();
        CashDispenser cashDispenser = new CashDispenser();
        
        Transaction transaction = new Withdrawal(12345, screen, bankDatabase, keypad, cashDispenser);
        transaction.execute();
        String output = getOutputMessage(120);
        assertSame(bankDatabase, transaction.getBankDatabase());
        assertEquals("Your cash has been dispensed. Please take your cash now.", output);

        testOut.reset();

        Transaction transaction2 = new Withdrawal(98765, screen, bankDatabase, keypad, cashDispenser);
        transaction2.execute();
        output = getOutputMessage(120);
        assertSame(bankDatabase, transaction2.getBankDatabase());
        assertEquals("Your cash has been dispensed. Please take your cash now.", output);

        testOut.reset();

        transaction.execute();
        output = getOutputMessage(120);
        assertEquals("Canceling transaction...", output);

        restoreSystemInputOutput();
    }

    @After
    public void BalanceInformationAfterTest()
    {
        double availableBalance = bankDatabase.getAvailableBalance(12345);
        double totalBalance = bankDatabase.getTotalBalance(12345);
        double amount = 200;
        assertEquals("Available Balance after withdraw for acount number 12345", 1000.0-amount, availableBalance, 2);
        assertEquals("Total Balance after withdraw for acount number 12345", 1200.0-amount, totalBalance, 2);
        availableBalance = bankDatabase.getAvailableBalance(98765);
        totalBalance = bankDatabase.getTotalBalance(98765);
        assertEquals("Available Balance after withdraw for acount number 98765", 200.0-amount, availableBalance, 2);
        assertEquals("Total Balance after withdraw for acount number 98765", 200.0-amount, totalBalance, 2);
    }
}