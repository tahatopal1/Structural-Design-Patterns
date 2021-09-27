package Facade;

import Facade.Debt.Debt;
import Facade.Debt.DebtType;
import Facade.Debt.PaymentInfoDto;
import Facade.Utility.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        CollectingFacade collectingFacade = new CollectingFacade();

        Date expirationDate = DateUtil.createExpirationDate("01.01.2020");
        Debt debt = new Debt(10L, DebtType.NORMAL, new BigDecimal(100), expirationDate);

        PaymentInfoDto paymentInfoDto = new PaymentInfoDto("John Smith", "12345634", 01L, 2023L, 123L);
        boolean isSuccess = collectingFacade.payment(debt, paymentInfoDto);

        if (isSuccess)
            System.out.println("Payment is successful.");
        else
            System.out.println("Payment is not successful.");

    }
}
