package CS.study.note._1_DesignPattern.strategy;

public class HelloWorld {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("itemA", 100);
        Item B = new Item("itemB", 300);

        cart.addItem(A);
        cart.addItem(B);

        // pay by LUNACard
        cart.pay(new LUNACardStrategy("codumaru@example.com", "pw_example"));

        // pay by KAKAOCard
        cart.pay(new KAKAOCardStrategy("Codumaru", "123456789", "123", "12/01"));
    }
}
