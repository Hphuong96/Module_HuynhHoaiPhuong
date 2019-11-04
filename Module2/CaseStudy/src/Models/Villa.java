package Models;

public class Villa extends ServicesHouseVilla {
    public double swimmingPoolArea;

    public Villa() {
    }

    public Villa(String id, String servicesName, double area, int rentCost, int maxNumberOfCustomer, String kindOfRent, String roomStandar, String anotherConvenient, int numberOfFloor, int swimmingPoolArea) {
        super(id, servicesName, area, rentCost, maxNumberOfCustomer, kindOfRent, roomStandar, anotherConvenient, numberOfFloor);
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    @Override
    public void showInfo() {
        System.out.println("id: " + super.getId() + "\n" +
                "Services Name: " + super.getServicesName() + "\n" +
                "Area: " + super.getArea() + "\n" +
                "Rent Cost: " + super.getRentCost() + "\n" +
                "Maximum Number Of Customer: " + super.getMaxNumberOfCustomer() + "\n" +
                "Type Of Rent: " + super.getKindOfRent() + "\n" +
                "Room Standar: " + super.getRoomStandar() + "\n" +
                "Another Convenient: " + super.getAnotherConvenient() + "\n" +
                "Number OF Floor: " + super.getNumberOfFloor() + "\n" +
                "Swimming Pool Area: " + this.getSwimmingPoolArea() + "\n" );
    }
}
