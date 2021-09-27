package Facade.Law;

import java.util.Arrays;
import java.util.List;

public class CaseSessionEntityService {
    public List<Long> findAllCaseSession() {
        List<Long> debtInCaseList = Arrays.asList(1L, 2L, 3L, 4L);
        return debtInCaseList;
    }
}
