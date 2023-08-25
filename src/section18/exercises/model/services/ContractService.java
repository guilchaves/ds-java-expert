package section18.exercises.model.services;

import section18.exercises.model.entities.Contract;
import section18.exercises.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        for (int i = 1; i <= months; i++) {

            LocalDate date = contract.getDate();
            Double contractValue = contract.getTotalValue();
            Double montlhyPay = contractValue / months;
            double interest = onlinePaymentService.interest(montlhyPay, i);
            double amount = montlhyPay + interest;
            double paymentFee = onlinePaymentService.paymentFee(amount);

            Installment installment = new Installment(date.plusMonths(i), paymentFee);
            contract.getInstallments().add(installment);
        }
    }
}
