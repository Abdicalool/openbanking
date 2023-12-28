package abdi.example.openBankin.service.implementation;

import abdi.example.openBankin.service.TransactionService;
import abdi.example.openBankin.transaction.TransactionDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class TransactionServiceImpl implements TransactionService {
    @Override
    public List<TransactionDTO> listOfTransactions(int countNumber) {

        return List.of(
                new TransactionDTO("Rent", LocalDateTime.now(), 2525, "SEK", 654, "Abdi Mohamed", "Amal Express"),
                new TransactionDTO("Rent", LocalDateTime.now(), 2525, "SEK", 654, "Abdi Mohamed", "Amal Express"),
                new TransactionDTO("Rent", LocalDateTime.now(), 2525, "SEK", 654, "Abdi Mohamed", "Amal Express")


        );
    }
}
