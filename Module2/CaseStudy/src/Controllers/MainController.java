package Controllers;

import Commons.FuncWriteAndReadFileCSV;
import Commons.FuntionValidate;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static Scanner input = new Scanner(System.in);
    public static void displayMainMenu(){
        System.out.print("1. " + "Add New Services" + "\n" +
                         "2. " + "Show Services" + "\n" +
                         "3. " + "Exit" + "\n");
        switch (input.nextByte()){
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("invalid");
                displayMainMenu();
        }
    }
    public static void addNewServices(){
        System.out.println("===================");
        System.out.print("1. " + "Add New Villa" + "\n" +
                         "2. " + "Add New House" + "\n" +
                         "3. " + "Add New Room" + "\n" +
                         "4. " + "Back To Menu" + "\n" +
                         "5. " + "Exit" + "\n" );
        switch (input.nextByte()){
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("invalid");
                addNewServices();
        }
    }
    private static Services addNewServices(Services services){
        String content = "";
        String errMes = "";
        services.setId(UUID.randomUUID().toString().replace("-",""));
        input.nextLine();
        System.out.println("Enter Services Name: ");
        while (!FuntionValidate.checkServiceName(input.nextLine())){
            System.out.println("Services Name is invalid !!");
            System.out.println("Enter Services Name:");
            services.setServicesName(input.nextLine());
        }
        content = "Area Used";
        errMes = "Area use must be bigger 30 and must be Double";
        services.setArea(FuntionValidate.checkValidateDoubleNumber(content,errMes));
        while (services.getArea() <= 30){
            System.out.println(errMes);
            services.setArea(FuntionValidate.checkValidateDoubleNumber(content,errMes));
        }
        content = "Rent Cost";
        errMes = "Rent cost must be interger and bigger than zero.";
        services.setRentCost(FuntionValidate.checkValidateIntergerNumber(content,errMes));
        while (services.getRentCost() <=0){
            System.out.println(errMes);
            services.setRentCost(FuntionValidate.checkValidateIntergerNumber(content,errMes));
        }
        content = "Number customer :";
        errMes = "Number of customer must bigger than 0 and smaller than 20";
        services.setMaxNumberOfCustomer(FuntionValidate.checkValidateIntergerNumber(content,errMes));
        while (services.getMaxNumberOfCustomer() <=0 || services.getMaxNumberOfCustomer()>=20){
            System.out.println(errMes);
            services.setMaxNumberOfCustomer(FuntionValidate.checkValidateIntergerNumber(content,errMes));
        }
        System.out.println("Enter Kind Of Rent: ");
        while (!FuntionValidate.checkServiceName(input.nextLine())){
            System.out.println("Kind of rent is invalid !!");
            System.out.println("Enter Kind of rent:");
            services.setKindOfRent(input.nextLine());
        }
        return services;
    }
    private static void showServices(){
        System.out.println("===================");
        System.out.print("1.Show All Villa" + "\n" +
                "2.Show All House" + "\n" +
                "3.Show All Room" + "\n" +
                "4.Back To Menu" + "\n" +
                "5.Exit" + "\n" );
        switch (input.nextByte()){
            case 1:
                showAllVillaServices();
                break;
            case 2:
                showAllHouseServices();
                break;
            case 3:
                showAllRoomServices();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);

        }
    }
    private static void addNewVilla(){
        String content = "";
        String errMes = "";
        ArrayList<Villa> villaList = FuncWriteAndReadFileCSV.getVillaInformation();
        Villa villa = new Villa();
        addNewServices(villa);
        System.out.println("Enter Room Standar: ");
        villa.setRoomStandar(input.nextLine());
        System.out.println("Enter Another Convenient: ");
        villa.setAnotherConvenient(input.nextLine());
        System.out.println("Enter Number Of Floor: ");
        villa.setNumberOfFloor(input.nextInt());
        System.out.println("Enter Swimming Pool Area: ");
        villa.setSwimmingPoolArea(input.nextInt());
        villaList.add(villa);
        FuncWriteAndReadFileCSV.writeVillaToCSV(villaList);
        System.out.println("Add Villa: " + villa.getServicesName() + "Success!!!");
        displayMainMenu();
    }
    private static void addNewHouse(){
        ArrayList<House> houseList = FuncWriteAndReadFileCSV.getHouseInformation();
        House house = new House();
        addNewServices(house);
        System.out.println("Enter Room Standar: ");
        house.setRoomStandar(input.nextLine());
        System.out.println("Enter Another Convenient: ");
        house.setAnotherConvenient(input.nextLine());
        System.out.println("Enter Number Of Floor: ");
        house.setNumberOfFloor(input.nextInt());
        houseList.add(house);
        FuncWriteAndReadFileCSV.writeHouseToCSV(houseList);
        System.out.println("Add House: " + house.getServicesName() + "Success!!!");
        displayMainMenu();
    }
    private static void addNewRoom(){
        ArrayList<Room> roomList = FuncWriteAndReadFileCSV.getRoomInformation();
        Room room = new Room();
        addNewServices(room);
        System.out.println("Enter Room Standar: ");
        room.setIncludeFreeServices(input.nextLine());
        roomList.add(room);
        FuncWriteAndReadFileCSV.writeRoomToCSV(roomList);
        System.out.println("Add House: " + room.getServicesName() + "Success!!!");
        displayMainMenu();
    }
    private static void showAllVillaServices(){
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaInformation();
        System.out.println("===============");
        for (Villa villa: listVilla) {
            villa.showInfo();
            System.out.println("===============");
        }
    }
    private static void showAllHouseServices(){
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseInformation();
        System.out.println("===============");
        for (House house: listHouse) {
            house.showInfo();
            System.out.println("===============");
        }
    }
    private static void showAllRoomServices(){
        ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomInformation();
        System.out.println("===============");
        for (Room room: listRoom) {
            room.showInfo();
            System.out.println("===============");
        }
    }
}
