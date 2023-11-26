package CS.study.note._1_DesignPattern.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class KaKAOCardStrategy implements PaymentStrategy {
    private String name, cardNumber, cvv, dateOfExpiry;

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using KAKOCard.");
    }
}
