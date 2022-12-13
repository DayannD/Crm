package fr.m2i.apifilrougecrm.dto;

public class OrderDto {

    private Long id;
    private String typePresta;
    private String designation;
    private int nbDays;
    private float unitPrice;

    private ClientDto client;
    private String state;

    private  String orderClient_id;
    public OrderDto() {
    }

    public OrderDto(String typePresta, String designation, int nbDays, float unitPrice) {
        this.typePresta = typePresta;
        this.designation = designation;
        this.nbDays = nbDays;
        this.unitPrice = unitPrice;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypePresta() {
        return typePresta;
    }

    public void setTypePresta(String typePresta) {
        this.typePresta = typePresta;
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

    public String getOrderClient_id() {
        return orderClient_id;
    }

    public void setOrderClient_id(String orderClient_id) {
        this.orderClient_id = orderClient_id;
    }
}
