package Composite.old;

import java.util.ArrayList;
import java.util.List;

public class Pack {

    private String name;
    private List<Product> productList;

    public Pack(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
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
