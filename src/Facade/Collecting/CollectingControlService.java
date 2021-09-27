package Facade.Collecting;

import Facade.Debt.Debt;
import Facade.Debt.DebtType;
import Facade.DebtConfiguration.ConfigurationControlService;
import Facade.Law.ControlInLawService;

import java.text.ParseException;

public class CollectingControlService {

    private ConfigurationControlService configurationControlService;
    private ControlInLawService controlInLawService;

    public CollectingControlService() {
        configurationControlService = new ConfigurationControlService();
        controlInLawService = new ControlInLawService();
    }

    public boolean isAbleToCollect(Debt debt) throws ParseException {

        boolean mustConfigurationBreak = false;

        if (DebtType.STRUCTURED.equals(debt.getDebtType()))
            mustConfigurationBreak = configurationControlService.mustConfigurationBreak(debt.getExpirationDate());

        boolean inCaseSession = controlInLawService.hasCase(debt.getId());

        boolean debtAbleToCollect = !(mustConfigurationBreak || inCaseSession);
        return debtAbleToCollect;

    }

}
