package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Military> militaryList = new ArrayList<>();

        Captain captain = new Captain();
        militaryList.add(captain);

        for (int i = 0; i < 50; i++){
            Military military = new Soldier();
            militaryList.add(military);
        }

        for (Military military : militaryList) {
            military.fire();
        }

    }
}
