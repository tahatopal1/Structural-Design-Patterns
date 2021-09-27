package Composite.newest;

import java.math.BigDecimal;
import java.util.List;

public class CostCalculatorUtil {

    public static BigDecimal getTotalCost(List<Product> productList){

        BigDecimal totalCost = BigDecimal.ZERO;

        for (Product product: productList)
            totalCost = totalCost.add(product.getCost());

        return totalCost;

    }

    public static BigDecimal getTotalPackCost(List<Pack> packList){

        BigDecimal totalCost = BigDecimal.ZERO;

        for (Pack pack: packList)
            totalCost = totalCost.add(pack.getCost());

        return totalCost;


    }

}
