package CS.study.note._1_DesignPattern.factory;

public class HelloWorld {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee("Latte", 4000);
        Coffee americano = CoffeeFactory.getCoffee("Americano", 3000);

        System.out.println("Factory latte :: " + latte);
        System.out.println("Factory americano :: " + americano);
    }
}
