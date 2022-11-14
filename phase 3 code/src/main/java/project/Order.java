package project;

import java.util.ArrayList;

public class Order {
    private String status;
    private String pizzaType;
    private ArrayList<String> pizzaToppings = new ArrayList<>();

    public Order(String status, String pizzaType, ArrayList<String> pizzaToppings) {
        this.status = status;
        this.pizzaType = pizzaType;
        this.pizzaToppings = pizzaToppings;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public ArrayList<String> getPizzaToppings() {
        return pizzaToppings;
    }

    public void setPizzaToppings(ArrayList<String> pizzaToppings) {
        this.pizzaToppings = pizzaToppings;
    }
}
