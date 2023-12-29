package abdi.example.openBankin.service;

import abdi.example.openBankin.entity.TransactionDTO;

import java.util.List;

public interface TransactionService {
    List<TransactionDTO> listOfTransactions(int acoountNumer);
}
