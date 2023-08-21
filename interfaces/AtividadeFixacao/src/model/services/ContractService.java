//229. Exercício de fixação, 230. Correção do exercício de fixação PARTE 1, 231. Correção do exercício de fixação PARTE 2
package model.services;

import java.time.LocalDate;
import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        
        double basicQuota = contract.getTotalValue() / months;
        
        for (int i = 0; i < 3; i++) {
            LocalDate dueDate = contract.getDate().plusMonths((i + 1));
            
            double interest = onlinePaymentService.interest(basicQuota, (i + 1));
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
