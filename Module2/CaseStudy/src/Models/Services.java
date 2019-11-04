package Models;

public abstract class Services {
    private String id;
    private String servicesName;
    private double area;
    private int rentCost;
    private int maxNumberOfCustomer;
    private String kindOfRent;

    public Services() {

    }

    public Services(String id, String servicesName, double area, int rentCost, int maxNumberOfCustomer, String kindOfRent) {
        this.id = id;
        this.servicesName = servicesName;
        this.area = area;
        this.rentCost = rentCost;
        this.maxNumberOfCustomer = maxNumberOfCustomer;
        this.kindOfRent = kindOfRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRentCost() {
        return rentCost;
    }

    public void setRentCost(int rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxNumberOfCustomer() {
        return maxNumberOfCustomer;
    }

    public void setMaxNumberOfCustomer(int maxNumberOfCustomer) {
        this.maxNumberOfCustomer = maxNumberOfCustomer;
    }

    public String getKindOfRent() {
        return kindOfRent;
    }

    public void setKindOfRent(String kindOfRent) {
        this.kindOfRent = kindOfRent;
    }

    public abstract void showInfo();
}
