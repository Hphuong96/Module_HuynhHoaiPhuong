package Models;

public class Room extends Services {
    private String includeFreeServices;

    public Room() {
    }

    public Room(String id, String servicesName, double area, int rentCost, byte maxNumberOfCustomer, String kindOfRent, String includeFreeServices) {
        super(id, servicesName, area, rentCost, maxNumberOfCustomer, kindOfRent);
        this.includeFreeServices = includeFreeServices;
    }

    public String getIncludeFreeServices() {
        return includeFreeServices;
    }

    public void setIncludeFreeServices(String includeFreeServices) {
        this.includeFreeServices = includeFreeServices;
    }

    @Override
    public void showInfo() {
        System.out.println("Services Name: " + super.getServicesName() + "\n" +
                           "Area: " + super.getServicesName() + "\n" +
                           "Rent Cost: " + super.getServicesName() + "\n" +
                           "Maxium Number Of Customer: " + super.getServicesName() + "\n" +
                           "Type Of Rent: " + super.getServicesName() + "\n" +
                           "Include Free Services: " + super.getServicesName() + "\n" );
    }
}
