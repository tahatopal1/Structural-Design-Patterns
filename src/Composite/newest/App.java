package Composite.newest;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Product tomato = new Product("Tomato", BigDecimal.TEN);
        Product potato = new Product("Potato", BigDecimal.ONE);
        Product onion = new Product("Onion", BigDecimal.ONE);

        Pack veggiePack = new Pack("Veggie Pack");
        veggiePack.getProductList().add(tomato);
        veggiePack.getProductList().add(potato);
        veggiePack.getProductList().add(onion);

        Product voiceSystem = new Product("Voice System", BigDecimal.valueOf(5000));
        Product headset = new Product("Headset", BigDecimal.valueOf(1000));

        Pack techPack = new Pack("Tech Pack");
        techPack.getProductList().add(voiceSystem);
        techPack.getProductList().add(headset);

        Product soccerBall = new Product("Soccer Ball", BigDecimal.valueOf(100));

        Cart cart = new Cart("My Cart");
        cart.getCostableList().add(veggiePack);
        cart.getCostableList().add(techPack);
        cart.getCostableList().add(soccerBall);

        // Extension
        AdvancedPack advancedPack = new AdvancedPack("Advanced Pack");
        advancedPack.getPackList().add(veggiePack);
        advancedPack.getPackList().add(techPack);
        advancedPack.getProductList().add(soccerBall);

        cart.getCostableList().add(advancedPack);

        BigDecimal totalCost = cart.totalCost();
        System.out.println("Cost: " + totalCost);


    }
}
