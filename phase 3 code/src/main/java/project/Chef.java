package project;

public class Chef extends Employee{
    private String typeOf;
    public Chef(String id, String pss) {
        super(id, pss);
        typeOf = "Chef";
    }

    public String getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(String typeOf) {
        this.typeOf = typeOf;
    }
}
