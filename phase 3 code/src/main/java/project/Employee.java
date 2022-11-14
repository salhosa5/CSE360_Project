package project;

public class Employee {
    private String id;
    private String pss;

    public Employee(String id, String pss) {
        this.id = id;
        this.pss = pss;
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
}
