package Composite.newest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AdvancedPack implements Costable{

    private String name;
    private List<Product> productList;
    private List<Pack> packList;

    public AdvancedPack(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packList = new ArrayList<>();
    }

    @Override
    public BigDecimal getCost() {
        BigDecimal totalProductCost = CostCalculatorUtil.getTotalCost(productList);
        BigDecimal totalPackCost    = CostCalculatorUtil.getTotalPackCost(packList);
        return totalProductCost.add(totalPackCost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Pack> getPackList() {
        return packList;
    }

    public void setPackList(List<Pack> packList) {
        this.packList = packList;
    }
}
