package Models;

public class House extends ServicesHouseVilla {
    public House() {

    }

    public House(String id, String servicesName, double area, int rentCost, int maxNumberOfCustomer, String kindOfRent, String roomStandar, String anotherConvenient, int numberOfFloor) {
        super(id, servicesName, area, rentCost, maxNumberOfCustomer, kindOfRent, roomStandar, anotherConvenient, numberOfFloor);
    }


    @Override
    public void showInfo() {
        System.out.println("Services Name: " + super.getServicesName() + "\n" +
                           "Area: " + super.getArea() + "\n" +
                           "Rent Cost: " + super.getRentCost() + "\n" +
                           "Maximum Number Of Customer: " + super.getMaxNumberOfCustomer() + "\n" +
                           "Type Of Rent: " + super.getKindOfRent() + "\n" +
                           "Room Standar: " + this.getRoomStandar() + "\n" +
                           "Another Convenient: " + this.getAnotherConvenient() + "\n" +
                           "Number OF Floor: " + this.getNumberOfFloor() + "\n" );
    }
}
