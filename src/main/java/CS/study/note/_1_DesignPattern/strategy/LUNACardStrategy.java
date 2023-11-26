package CS.study.note._1_DesignPattern.strategy;

public class LUNACardStrategy implements PaymentStrategy {
    private String emailId, password;

    public LUNACardStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using LUNACard.");
    }
}
