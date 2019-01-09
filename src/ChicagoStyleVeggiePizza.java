public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Onion Pepper Grilled Zucchini");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
