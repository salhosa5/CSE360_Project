package project;

import java.util.ArrayList;

public class Student {
    private String id;
    private String pss;
    private ArrayList<Order> orders;

    public Student(String id, String pss) {
        this.id = id;
        this.pss = pss;
        orders = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPss() {
        return pss;
    }

    public void setPss(String pss) {
        this.pss = pss;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}

