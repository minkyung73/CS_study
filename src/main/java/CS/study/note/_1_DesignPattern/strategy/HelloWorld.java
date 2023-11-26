package CS.study.note._1_DesignPattern.strategy;

public class HelloWorld {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("kundolA", 100);
        Item B = new Item("kundolB", 300);

        cart.addItem(A);
        cart.addItem(B);

        // pay by LUNACard
        cart.pay(new LUNACardStrategy("kundol@example.com", "pw_example"));

        // pay by KAKAOCard
        cart.pay(new KaKAOCardStrategy("Codumaru", "123456789", "123", "12/01"));
    }
}
