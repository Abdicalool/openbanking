package abdi.example.openBankin.service;

import abdi.example.openBankin.transaction.TransactionDTO;

import java.util.List;

public interface TransactionService {
    List<TransactionDTO> listOfTransactions(int acoountNumer);
}
