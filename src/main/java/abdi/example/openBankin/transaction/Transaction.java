package abdi.example.openBankin.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private String type;
    private LocalDateTime date;
    private int accountNumber;
    private String currency;
    private double amount;
    private String merchantName;
    private String merchantLogo;
}
