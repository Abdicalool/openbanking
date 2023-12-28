package abdi.example.openBankin.controller;

import abdi.example.openBankin.service.TransactionService;
import abdi.example.openBankin.transaction.TransactionDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {
   private TransactionService transactionService;
    @GetMapping("/{accountNumber}")
        public ResponseEntity<List<TransactionDTO>> getTransactionByAccount(){
        return ResponseEntity.ok().body(transactionService.listOfTransactions(2536));
        }
}
