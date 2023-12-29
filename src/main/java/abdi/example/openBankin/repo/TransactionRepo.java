package abdi.example.openBankin.repo;

import abdi.example.openBankin.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
   List<Transaction> findByAccountNumber(int number);
}
