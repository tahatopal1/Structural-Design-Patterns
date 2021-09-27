package Facade.Collecting.CreditCard;

import Facade.Debt.PaymentInfoDto;

import java.math.BigDecimal;
import java.text.ParseException;

public class CreditCardService {

    private CreditCardControlService creditCardControlService;

    public CreditCardService() {
        creditCardControlService = new CreditCardControlService();
    }

    public boolean tryoutCollectionWithCreditCard(PaymentInfoDto paymentInfoDto, BigDecimal paymentCost){
        
        boolean isCreditCartValid = false;

        try {
            isCreditCartValid = creditCardControlService.isCreditCardValid(paymentInfoDto);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        if (!isCreditCartValid)
            return false;
        
        boolean isSufficientLimit = isSufficientLimit(paymentInfoDto, paymentCost);

        if (!isSufficientLimit){
            return false;
        }

        System.out.println("Payment cost has been collected from credit cart: " + paymentCost);

        return true;

    }

    private boolean isSufficientLimit(PaymentInfoDto paymentInfoDto, BigDecimal paymentCost) {
        BigDecimal limit = getCreditCardLimit(paymentInfoDto);
        boolean isLimitSufficient = limit.compareTo(paymentCost) > 0;

        if(!isLimitSufficient){
            System.out.println("Insufficient limit!");
        }

        return isLimitSufficient;

    }

    private BigDecimal getCreditCardLimit(PaymentInfoDto paymentInfoDto) {

        BigDecimal limit = BigDecimal.ZERO;

        String nameOnCard = paymentInfoDto.getName();

        if (nameOnCard.contains("Jack")){
            limit = new BigDecimal(100);
        }else if(nameOnCard.contains("Mary")){
            limit = new BigDecimal(1000);
        }else if(nameOnCard.contains("Josef")){
            limit = BigDecimal.TEN;
        }

        return limit;

    }

}
