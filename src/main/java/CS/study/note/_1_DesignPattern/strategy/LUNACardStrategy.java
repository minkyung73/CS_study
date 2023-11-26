package CS.study.note._1_DesignPattern.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LUNACardStrategy implements PaymentStrategy {
    private String emailId, password;

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using LUNACard.");
    }
}
