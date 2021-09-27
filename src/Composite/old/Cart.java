package Composite.old;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private String name;
    private List<Product> productList;
    private List<Pack> packList;

    public Cart(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packList = new ArrayList<>();
    }

    public BigDecimal getTotalCost(){
        BigDecimal totalCost = BigDecimal.ZERO;

        for (Product product: productList){
            totalCost = totalCost.add(product.getCost());
        }

        for (Pack pack: packList){
            List<Product> productList = pack.getProductList();
            for (Product product: productList){
                totalCost = totalCost.add(product.getCost());
            }
        }

        return totalCost;

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
