package CS.study.note._1_DesignPattern.strategy;

import lombok.Getter;

@Getter
public class Item {

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
