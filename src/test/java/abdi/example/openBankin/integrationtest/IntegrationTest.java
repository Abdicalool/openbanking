package abdi.example.openBankin.integrationtest;

import abdi.example.openBankin.service.TransactionService;
import abdi.example.openBankin.entity.TransactionDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTest {
    @Autowired
   TransactionService transactionService;
    @Autowired
    MockMvc mockMvc;

    @Test
    void itShouldMakeIntegrationTestOnPutRequest() throws Exception {

        //GIVEN
        int accountNumber = 2536;
        ResultActions performed = mockMvc.perform(MockMvcRequestBuilders.get("/transactions/" + accountNumber).contentType(MediaType.APPLICATION_JSON));
        performed.andExpect(status().isOk());
        performed.andExpect(jsonPath("$.(0).type").value("credit"));
        //WHEN

        //THEN
    }
}
