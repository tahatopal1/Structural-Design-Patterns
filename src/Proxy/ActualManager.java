package Proxy;

import java.math.BigDecimal;

public class ActualManager implements CompanyInfo{

    @Override
    public BigDecimal getEndorsement() {
        return BigDecimal.valueOf(10000);
    }
}
