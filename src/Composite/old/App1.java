package Composite.old;

import java.math.BigDecimal;

public class App1 {

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
        cart.getPackList().add(veggiePack);
        cart.getPackList().add(techPack);
        cart.getProductList().add(soccerBall);

        BigDecimal totalCost = cart.getTotalCost();
        System.out.println("Cost: " + totalCost);


    }

}
