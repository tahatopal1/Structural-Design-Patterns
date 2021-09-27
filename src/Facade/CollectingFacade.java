package Facade;

import Facade.Collecting.CollectingControlService;
import Facade.Collecting.CreditCard.CreditCardService;
import Facade.Debt.Debt;
import Facade.Debt.PaymentInfoDto;
import Facade.Latency.LatencyRaiseCalculationService;

import java.math.BigDecimal;
import java.text.ParseException;

public class CollectingFacade {

    private LatencyRaiseCalculationService latencyRaiseCalculationService;
    private CollectingControlService collectingControlService;
    private CreditCardService creditCardService;

    public CollectingFacade() {
        latencyRaiseCalculationService = new LatencyRaiseCalculationService();
        collectingControlService = new CollectingControlService();
        creditCardService = new CreditCardService();

    }

    public boolean payment(Debt debt, PaymentInfoDto paymentInfoDto){

        boolean isSuitableForCollecting = false;

        try {
            isSuitableForCollecting = collectingControlService.isAbleToCollect(debt);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (!isSuitableForCollecting)
            return false;

        BigDecimal debtCost = debt.getDebtCost();
        BigDecimal latencyRaise = latencyRaiseCalculationService
                        .calculateLatencyRaise(debtCost, debt.getExpirationDate());

        BigDecimal totalCost = debtCost.add(latencyRaise);
        System.out.println("Info: System is trying to complete payment with credit card. Amount: " + totalCost);

        boolean isSuccess = creditCardService.tryoutCollectionWithCreditCard(paymentInfoDto, totalCost);
        return isSuccess;

    }

}
