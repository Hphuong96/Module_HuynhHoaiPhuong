package Models;

public abstract class ServicesHouseVilla extends Services {
    private String roomStandar;
    private String anotherConvenient;
    private int numberOfFloor;

    public ServicesHouseVilla() {
    }

    public ServicesHouseVilla(String id, String servicesName, double area, int rentCost, int maxNumberOfCustomer, String kindOfRent, String roomStandar, String anotherConvenient, int numberOfFloor) {
        super(id, servicesName, area, rentCost, maxNumberOfCustomer, kindOfRent);
        this.roomStandar = roomStandar;
        this.anotherConvenient = anotherConvenient;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandar() {
        return roomStandar;
    }

    public void setRoomStandar(String roomStandar) {
        this.roomStandar = roomStandar;
    }

    public String getAnotherConvenient() {
        return anotherConvenient;
    }

    public void setAnotherConvenient(String anotherConvenient) {
        this.anotherConvenient = anotherConvenient;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
