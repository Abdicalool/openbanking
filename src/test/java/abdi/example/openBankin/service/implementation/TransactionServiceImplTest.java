package abdi.example.openBankin.service.implementation;


import abdi.example.openBankin.service.TransactionService;
import abdi.example.openBankin.transaction.Transaction;
import abdi.example.openBankin.transaction.TransactionDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TransactionServiceImplTest {
    @Autowired
    private TransactionService transactionService;

    @Test
    void itShouldReturnAllTransactions() {
        //GIVEN
        Transaction transaction = new Transaction();

        //WHEN
        List<TransactionDTO> transactions = transactionService.listOfTransactions(transaction.getAccountNumber());
        //THEN
        assertThat(transactions.size()).isEqualTo(3);

    }
}