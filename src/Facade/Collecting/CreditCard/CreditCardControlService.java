package Facade.Collecting.CreditCard;

import Facade.Debt.PaymentInfoDto;
import Facade.Utility.DateUtil;

import java.text.ParseException;
import java.util.Date;

public class CreditCardControlService {

    public boolean isCreditCardValid(PaymentInfoDto paymentInfoDto) throws ParseException {
        Long expirationMonth = paymentInfoDto.getExpirationMonth();
        Long expirationYear = paymentInfoDto.getExpirationYear();

        Date exactDate = DateUtil.getExactDate();
        Long monthOfExactDate = DateUtil.monthOfDate(exactDate);
        Long yearOfExactDate = DateUtil.yearOfDate(exactDate);

        boolean isCreditCardValid = false;

        if (expirationYear.compareTo(yearOfExactDate) > 0)
            isCreditCardValid = true;
        else if (expirationYear.compareTo(yearOfExactDate) == 0){
            if (expirationMonth.compareTo(monthOfExactDate) > 0)
                isCreditCardValid = true;
        }

        if (!isCreditCardValid)
            System.out.println("Invalid Credit Card informations!");

        return isCreditCardValid;
    }

}
