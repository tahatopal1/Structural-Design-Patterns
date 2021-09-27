package Facade.Latency;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LatencyRaiseRateService {
    public BigDecimal getLatencyRaiseRate() {
        return new BigDecimal("1.6").divide(new BigDecimal(100), 4, RoundingMode.HALF_DOWN);
    }
}
