package abdi.example.openBankin.service.implementation;

import abdi.example.openBankin.entity.Transaction;
import abdi.example.openBankin.repo.TransactionRepo;
import abdi.example.openBankin.service.TransactionService;
import abdi.example.openBankin.entity.TransactionDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final  TransactionRepo transactionRepo;

    private static TransactionDTO apply(Transaction transaction) {
        return TransactionDTO.builder()
                .id(transaction.getId())
                .type(transaction.getType())
                .amount(transaction.getAmount())
                .currency(transaction.getCurrency())
                .accountNumber(transaction.getAccountNumber())
                .merchantLogo(transaction.getMerchantLogo())
                .merchantName(transaction.getMerchantName())
                .date(transaction.getDate())
                .build();

    }

    @Override
    public List<TransactionDTO> listOfTransactions(final int countNumber) {
        List<Transaction> all = transactionRepo.findByAccountNumber(countNumber);
        return all.stream().map(TransactionServiceImpl::apply).toList();
    }
}
