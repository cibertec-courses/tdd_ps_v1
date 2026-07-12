import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BankAccountTest {

    /// Should reduce balance when withdrawing valid amount
    @Test
    void shouldReduceBalanceWhenWithdrawingValidAmount() {
        BankAccount account = new BankAccount(1000.0);
        account.withdraw(600.0);
        assertEquals(400.0,account.getBalance());
    }
    /// Should throw exception when withdrawing more than balance
    @Test
    void shouldThrowException() {
        BankAccount account = new BankAccount(1000.0);
        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(1500.0)
        );

    }
    /// Should not modify balance when withdrawal fails
    @Test
    @DisplayName("Should not modify balance when withdrawing fails")
    void shouldNotModifyBalanceWhenWithdrawalFails() {
        BankAccount account = new BankAccount(1000.0);
        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(1500.0)
        );
        assertEquals(1000.0, account.getBalance());
    }

}


