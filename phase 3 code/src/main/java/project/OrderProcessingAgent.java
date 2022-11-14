package project;

public class OrderProcessingAgent extends Employee{
    private String typeOf;
    public OrderProcessingAgent(String id, String pss) {
        super(id, pss);
        typeOf = "Order Processing Agent";
    }

    public String getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String typeOf) {
        this.typeOf = typeOf;
    }
}
