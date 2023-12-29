package abdi.example.openBankin.service.implementation;


import abdi.example.openBankin.repo.TransactionRepo;
import abdi.example.openBankin.service.TransactionService;
import abdi.example.openBankin.entity.Transaction;
import abdi.example.openBankin.entity.TransactionDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;


class TransactionServiceImplTest {
    @Mock
    private TransactionRepo transactionRepo;
    private TransactionServiceImpl underTest;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
        underTest = new TransactionServiceImpl(transactionRepo);
    }

    @Test
    void itShouldReturnAllTransactions() {
        //GIVEN
        Transaction transaction = new Transaction();
        int number = 2525;
        List<Transaction> transactions = List.of(new Transaction(number,"Rent", LocalDate.parse("2023-12-20"), number, "SEK", 654.0, "Abdi Mohamed", "Amal Express"),
                new Transaction(number,"Rent", LocalDate.parse("2023-12-20"), number, "SEK", 654.0, "Abdi Mohamed", "Amal Express"));
       given(transactionRepo.findByAccountNumber(number)).willReturn(transactions);
       underTest.listOfTransactions(number);
       assertThat(transactionRepo.findByAccountNumber(number)).isEqualTo(transactions);
    }
}