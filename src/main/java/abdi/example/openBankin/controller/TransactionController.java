package abdi.example.openBankin.controller;

import abdi.example.openBankin.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {
   private TransactionService transactionService;
    @GetMapping("/{accountNumber}")
        public void getTransactionByAccount(@PathVariable("accountNumber") final int accountNumber){
        System.out.println("accountNumber = " + accountNumber);
        }
}
