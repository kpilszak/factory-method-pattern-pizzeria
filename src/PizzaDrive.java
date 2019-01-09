public class PizzaDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Order no 1: " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Order no 2: " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Order no 3: " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Order no 4: " + pizza.getName() + "\n");
    }
}
