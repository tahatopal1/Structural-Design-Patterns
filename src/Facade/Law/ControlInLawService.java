package Facade.Law;

import java.util.List;

public class ControlInLawService {

    private CaseSessionEntityService caseSessionEntityService;

    public ControlInLawService() {
        this.caseSessionEntityService = new CaseSessionEntityService();
    }

    public boolean hasCase(Long debtID){

        List<Long> debtList = caseSessionEntityService.findAllCaseSession();
        boolean isInSession = debtList.contains(debtID);

        if (isInSession)
            System.out.println("Debt is in case session. Cannot be collected.");

        return isInSession;

    }
}
