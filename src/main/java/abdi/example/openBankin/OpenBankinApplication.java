package abdi.example.openBankin;

import abdi.example.openBankin.entity.Transaction;
import abdi.example.openBankin.entity.TransactionDTO;
import abdi.example.openBankin.repo.TransactionRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class OpenBankinApplication {




	public static void main(String[] args) {
		SpringApplication.run(OpenBankinApplication.class, args);
	}



}
