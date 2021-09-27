package Composite.newest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private String name;
    private List<Costable> costableList;

    public Cart(String name) {
        this.name = name;
        this.costableList = new ArrayList<>();
    }

    public BigDecimal totalCost(){
        BigDecimal totalCost = BigDecimal.ZERO;
        for (Costable costable : costableList) {
            totalCost = totalCost.add(costable.getCost());
        }
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Costable> getCostableList() {
        return costableList;
    }

    public void setCostableList(List<Costable> costableList) {
        this.costableList = costableList;
    }
}
