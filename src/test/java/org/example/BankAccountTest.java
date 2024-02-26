package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount b;
    
    @BeforeEach
    void setUp() {
        b = new BankAccount(50000,2.5);
    }

    @Test
    void depositShouldThrowExceptionNegativeAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            b.deposit(-50.0); // Attempting to deposit a negative amount
        });
    }
    @Test
    void depositShouldAddAmountNormal() {
        b.deposit(3000);
        Assertions.assertEquals(53000, b.getBalance());

    }

    @Test
    void withdrawShouldThrowExceptionNegativeAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            b.withdraw(-50); // Attempting to deposit a negative amount
        });
    }
    @Test
    void withdrawSubstractAmountNormal() {
        b.withdraw(3000);
        Assertions.assertEquals(47000, b.getBalance());
    }

    @Test
    void transferShouldBeGood() {
        BankAccount receiverAccount = new BankAccount(70000, 2.5);
        b.transfer(10000,receiverAccount);
        Assertions.assertEquals(b.getBalance(),60000);
        Assertions.assertEquals(receiverAccount.getBalance(),80000);
    }
    @Test
    void transferShouldThrowExceptionForNullAccount() {
        // Arrange
        BankAccount receiverAccount = null;
        double transferAmount = 30.0;
        // Act & Assert
        Assertions.assertThrows(NullPointerException.class, () -> {
            b.transfer(transferAmount, receiverAccount);
        });
    }

    @Test
    void addInterestShouldIncreaseBalance() {
        b.addInterest();
        Assertions.assertEquals(50000 * (1 + 2.5), b.getBalance());
    }

    @Test
    void getBalanceShouldReturnBallanceCorrectly() {
        Assertions.assertEquals(50000,b.getBalance());
    }
}