package CS.study.note._1_DesignPattern.strategy;

public class KaKAOCardStrategy implements PaymentStrategy {
    private String name, cardNumber, cvv, dateOfExpiry;

    public KaKAOCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using KAKOCard.");
    }
}
