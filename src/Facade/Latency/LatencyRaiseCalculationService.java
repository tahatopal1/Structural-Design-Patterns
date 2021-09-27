package Facade.Latency;

import Facade.Utility.DateUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.Date;

public class LatencyRaiseCalculationService {

    private LatencyRaiseRateService latencyRaiseRateService;

    public LatencyRaiseCalculationService(){
        latencyRaiseRateService = new LatencyRaiseRateService();
    }

    public BigDecimal calculateLatencyRaise(BigDecimal cost, Date expirationDate){

        BigDecimal latencyRaise = BigDecimal.ZERO;

        if (expirationDate.compareTo(new Date()) > 0)
            return latencyRaise;

        try {
            latencyRaise = calculationForLatencyRaise(cost, expirationDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return latencyRaise;

    }

    private BigDecimal calculationForLatencyRaise(BigDecimal cost, Date expirationDate) throws ParseException {

        BigDecimal latencyRaiseRate = latencyRaiseRateService.getLatencyRaiseRate();
        Date exactDate = DateUtil.getExactDate();
        long difference = DateUtil.calculateDifferenceByDay(expirationDate, exactDate);

        BigDecimal raisedCost =  latencyRaiseRate.multiply(BigDecimal.valueOf(difference)).multiply(cost);
        raisedCost.setScale(2, RoundingMode.HALF_DOWN);

        if (raisedCost.compareTo(BigDecimal.ZERO) > 0)
            System.out.println("Info: Latency raise has been calculated. Raised cost: " + raisedCost);

        return raisedCost;

    }

}
