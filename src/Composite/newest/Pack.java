package Composite.newest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pack implements Costable{

    private String name;
    private List<Product> productList;

    public Pack(String name) {
        this.name = name;
        this.productList = new ArrayList<>();

    }

    @Override
    public BigDecimal getCost() {
        return CostCalculatorUtil.getTotalCost(productList);
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
}
