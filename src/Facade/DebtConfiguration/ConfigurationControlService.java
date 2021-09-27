package Facade.DebtConfiguration;

import Facade.Utility.DateUtil;

import java.text.ParseException;
import java.util.Date;

public class ConfigurationControlService {

    public boolean mustConfigurationBreak(Date expirationDate) throws ParseException {

        Date exactDate = DateUtil.getExactDate();
        long difference = DateUtil.calculateDifferenceByDay(expirationDate, exactDate);
        boolean mustBreakDown = difference > 90;

        if (mustBreakDown)
            System.out.println("Configuration must be canceled! Cannot be collected!");

        return mustBreakDown;

    }

}
