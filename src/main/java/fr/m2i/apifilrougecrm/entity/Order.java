package fr.m2i.apifilrougecrm.entity;

public class Order {

    private Long id;
    private String typePersta;
    private String designation;
    private int nbDays;
    private float unitPrice;

    //private state ? enum
    //private client;


    public Order() {
    }

    public Order(String typePersta, String designation, int nbDays, float unitPrice) {
        this.typePersta = typePersta;
        this.designation = designation;
        this.nbDays = nbDays;
        this.unitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypePersta() {
        return typePersta;
    }

    public void setTypePersta(String typePersta) {
        this.typePersta = typePersta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getNbDays() {
        return nbDays;
    }

    public void setNbDays(int nbDays) {
        this.nbDays = nbDays;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
