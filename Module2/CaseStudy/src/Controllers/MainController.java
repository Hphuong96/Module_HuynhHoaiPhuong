package Controllers;

import Commons.FuncWriteAndReadFileCSV;
import Commons.FuntionValidate;
import Models.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MainController {
    private static Scanner input = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.print("1.Add New Services" + "\n" +
                "2.Add New Customer" + "\n" +
                "3.Show Information Customer" + "\n" +
                "4.Show Services" + "\n" +
                "5.Add New Booking Resort" + "\n" +
                "6.Show Booking Resort" + "\n" +
                "7.Exit" + "\n");
        switch (input.nextByte()) {
            case 1:
                addNewServices();
                break;
            case 2:
                addNewCustomer();
                break;
            case 3:
                showInfomationCustomer();
                break;
            case 4:
                showServices();
                break;
            case 5:
                addNewBookingResort();
                break;
            case 6:
                showBookingResort();
                break;
            case 7:
                System.exit(0);
            default:
                System.out.println("invalid");
                displayMainMenu();
        }
    }

    public static void addNewServices() {
        System.out.println("===================");
        System.out.print("1. " + "Add New Villa" + "\n" +
                "2. " + "Add New House" + "\n" +
                "3. " + "Add New Room" + "\n" +
                "4. " + "Back To Menu" + "\n" +
                "5. " + "Exit" + "\n");
        switch (input.nextByte()) {
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

    private static Services addNewServices(Services services) {
        String content = "";
        String errMes = "";
        services.setId(UUID.randomUUID().toString().replace("-", ""));
        input.nextLine();
        System.out.println("Enter Services Name: ");
        String str = input.nextLine();
        while (!FuntionValidate.checkServiceName(str)) {
            System.out.println("Services Name is invalid !!");
            System.out.println("Enter Services Name:");
            str = input.nextLine();
        }
        services.setServicesName(str);
        content = "Area Used";
        errMes = "Area use must be bigger 30 and must be Double";
        services.setArea(FuntionValidate.checkValidateDoubleNumber(content, errMes));
        while (services.getArea() <= 30) {
            System.out.println(errMes);
            services.setArea(FuntionValidate.checkValidateDoubleNumber(content, errMes));
        }
        content = "Rent Cost";
        errMes = "Rent cost must be interger and bigger than zero.";
        services.setRentCost(FuntionValidate.checkValidateIntergerNumber(content, errMes));
        while (services.getRentCost() <= 0) {
            System.out.println(errMes);
            services.setRentCost(FuntionValidate.checkValidateIntergerNumber(content, errMes));
        }
        content = "Number customer :";
        errMes = "Number of customer must bigger than 0 and smaller than 20";
        services.setMaxNumberOfCustomer(FuntionValidate.checkValidateIntergerNumber(content, errMes));
        while (services.getMaxNumberOfCustomer() <= 0 || services.getMaxNumberOfCustomer() >= 20) {
            System.out.println(errMes);
            services.setMaxNumberOfCustomer(FuntionValidate.checkValidateIntergerNumber(content, errMes));
        }
        System.out.println("Enter Kind Of Rent: ");
        services.setKindOfRent(input.nextLine());
        while (!FuntionValidate.checkTypeOfRent(services.getKindOfRent())) {
            //"Month","Year","Day","Hour"
            System.out.println("Type of rent must be Month , Year , Day or Hour !");
            System.out.println("Enter Type of rent:");
            services.setKindOfRent(input.nextLine());
        }

        return services;
    }

    private static void addNewCustomer() {
        ArrayList<Customer> customersList = FuncWriteAndReadFileCSV.getCustomerInformation();
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID().toString().replace("-", ""));
        input.nextLine();

        System.out.println("Enter Customer Name :");
        String name = input.nextLine();
        while (!FuntionValidate.checkServiceName(name)) {
            System.out.println("Customer Name is invalid !!");
            System.out.println("Enter Customer Name:");
            name = input.nextLine();
        }
        customer.setNameCustomer(name);

        System.out.println("Enter Customer Date Of Birth :");
        String dateOfBirth = input.nextLine();
        while (!FuntionValidate.checkDateOfBirth(dateOfBirth)) {
            System.out.println("Date of birth is in valid !! (dd/mm/yyyy)");
            System.out.println("Enter date of birth :");
            dateOfBirth = input.nextLine();
        }
        customer.setDateOfBirthCustomer(dateOfBirth);

        System.out.println("Enter Customer Gender :");
        String gender = input.nextLine();
        while (!FuntionValidate.checkGender(gender)) {
            System.out.println("Gender is invalid!!!");
            System.out.println("Enter Customer Gender :");
            gender = input.nextLine();
        }
        customer.setGenderCustomer(gender);

        System.out.println("Enter Customer Id Card :");
        int idCard = input.nextInt();
        while (!FuntionValidate.checkIdCard(idCard)) {
            System.out.println("Id Card is invalid!!");
            System.out.println("Enter Id Card :");
            idCard = input.nextInt();
        }
        customer.setIdCard(idCard);

        System.out.println("Enter Customer Phone Number :");
        customer.setPhoneNumber(input.nextFloat());
        input.nextLine();

        System.out.println("Enter Customer Email :");
        String email = input.nextLine();
        while (!FuntionValidate.checkEmail(email)) {
            System.out.println("Email is invalid !!");
            System.out.println("Enter customer email :");
            email = input.nextLine();
        }
        customer.setEmailCustomer(email);

        System.out.println("Enter Customer type :");
        String type = input.nextLine();
        while (!FuntionValidate.checkTypeOfCustomer(type)) {
            System.out.println("Type Of Customer Is Invalid!!");
            System.out.println("Enter Customer Name :");
            type = input.nextLine();
        }
        customer.setTypeOfCustomer(type);

        System.out.println("Enter Customer Address :");
        customer.setAddressCustomer(input.nextLine());

        customersList.add(customer);
        FuncWriteAndReadFileCSV.writeCustomerToCSV(customersList);
        System.out.println("Add Villa: " + customer.getNameCustomer() + "Success!!!");
        displayMainMenu();
    }

    private static void showServices() {
        System.out.println("===================");
        System.out.print("1.Show All Villa" + "\n" +
                "2.Show All House" + "\n" +
                "3.Show All Room" + "\n" +
                "4.Show All Villa not duplicate" + "\n" +
                "5.Show All House not duplicate" + "\n" +
                "6.Show All Room not duplicate" + "\n" +
                "7.Back To Menu" + "\n" +
                "8.Exit" + "\n");
        switch (input.nextByte()) {
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
                showAllVillaNameNotDuplicate();
                break;
            case 5:
//                showAllHouseNameNotDuplicate();
//                break;
            case 6:
//                showAllRoomNameNotDuplicate();
//                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);

        }
    }

    private static void addNewVilla() {
        String content = "";
        String errMes = "";
        ArrayList<Villa> villaList = FuncWriteAndReadFileCSV.getVillaInformation();
        Villa villa = new Villa();
        addNewServices(villa);
        System.out.println("Enter Room Standar: ");
        villa.setRoomStandar(input.nextLine());
        while (!FuntionValidate.checkRoomStandar(villa.getRoomStandar())) {
            //"Vip","Deluxe","Standard"
            System.out.println("Room standar must be Vip , Deluxe , Standard !");
            System.out.println("Enter Room standar:");
            villa.setRoomStandar(input.nextLine());
        }
        System.out.println("Enter Another Convenient: ");
        villa.setAnotherConvenient(input.nextLine());
        while (!FuntionValidate.checkConvenient(villa.getAnotherConvenient())) {
            System.out.println("Another convenient must be 'massage,food,drink,car'");
            System.out.println("Enter Another Convenient:");
            villa.setAnotherConvenient(input.nextLine());
        }
        System.out.println("Enter Number Of Floor: ");
        villa.setNumberOfFloor(input.nextInt());
        System.out.println("Enter Swimming Pool Area: ");
        villa.setSwimmingPoolArea(input.nextInt());
        villaList.add(villa);
        FuncWriteAndReadFileCSV.writeVillaToCSV(villaList);
        System.out.println("Add Villa: " + villa.getServicesName() + "Success!!!");
        displayMainMenu();
    }

    private static void addNewHouse() {
        ArrayList<House> houseList = FuncWriteAndReadFileCSV.getHouseInformation();
        House house = new House();
        addNewServices(house);
        System.out.println("Enter Room Standar: ");
        house.setRoomStandar(input.nextLine());
        while (!FuntionValidate.checkRoomStandar(house.getRoomStandar())) {
            //"Vip","Deluxe","Standard"
            System.out.println("Room standar must be Vip , Deluxe , Standard !");
            System.out.println("Enter Room standar:");
            house.setRoomStandar(input.nextLine());
        }
        System.out.println("Enter Another Convenient: ");
        house.setAnotherConvenient(input.nextLine());
        while (!FuntionValidate.checkConvenient(house.getAnotherConvenient())) {
            System.out.println("Another convenient must be 'massage,food,drink,car'");
            System.out.println("Enter Another Convenient:");
            house.setAnotherConvenient(input.nextLine());
        }
        System.out.println("Enter Number Of Floor: ");
        house.setNumberOfFloor(input.nextInt());
        houseList.add(house);
        FuncWriteAndReadFileCSV.writeHouseToCSV(houseList);
        System.out.println("Add House: " + house.getServicesName() + "Success!!!");
        displayMainMenu();
    }

    private static void addNewRoom() {
        ArrayList<Room> roomList = FuncWriteAndReadFileCSV.getRoomInformation();
        Room room = new Room();
        addNewServices(room);
        System.out.println("Enter include free services: ");
        room.setIncludeFreeServices(input.nextLine());
        roomList.add(room);
        FuncWriteAndReadFileCSV.writeRoomToCSV(roomList);
        System.out.println("Add House: " + room.getServicesName() + "Success!!!");
        displayMainMenu();
    }

    private static void addNewBookingResort() {
        ArrayList<Customer> listCustomers = FuncWriteAndReadFileCSV.getCustomerInformation();
        Collections.sort(listCustomers);
        int i = 1;
        for (Customer customer : listCustomers) {
            System.out.println("============");
            System.out.println("No " + i);
            customer.showInfo();
            System.out.println("============");
            i++;
        }

        int indexCustomer = FuntionValidate.checkValidateIntergerNumber("CHoose customer","invalid!!");
        while (indexCustomer > listCustomers.size()){
            System.out.println("invalid!!");
            indexCustomer = FuntionValidate.checkValidateIntergerNumber("CHoose customer","invalid!!");
        }
        Customer customer = listCustomers.get(indexCustomer-1);
        System.out.println("Choose services :" +
                "\n1.Booking Villa." +
                "\n2.Booking House." +
                "\n3.Booking Room."+
                "\n4.Back" +
                "\n5.Back to menu");
        input.nextLine();
        switch (input.nextLine()){
            case "1":
                i = 1;
                ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaInformation();
                for (Villa villa : listVilla) {
                    System.out.println("-------------------");
                    System.out.println("No. " + i);
                    villa.showInfo();
                    System.out.println("-------------------");
                    i++;
                }
                int indexVilla = FuntionValidate.checkValidateIntergerNumber("CHoose Villa","invalid!!");
                while (indexVilla > listVilla.size()){
                    System.out.println("invalid!!");
                    indexVilla = FuntionValidate.checkValidateIntergerNumber("CHoose Villa","invalid!!");
                }
                Villa villa = listVilla.get(indexVilla - 1);
                customer.setServices(villa);
                System.out.println("Success");
                input.nextLine();
                break;
            case "2":
                i = 1;
                ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseInformation();
                for (House house : listHouse) {
                    System.out.println("-------------------");
                    System.out.println("No. " + i);
                    house.showInfo();
                    System.out.println("-------------------");
                    i++;
                }
                int indexHouse = FuntionValidate.checkValidateIntergerNumber("CHoose House","invalid!!");
                while (indexHouse > listHouse.size()){
                    System.out.println("invalid!!");
                    indexHouse = FuntionValidate.checkValidateIntergerNumber("CHoose House","invalid!!");
                }
                House house = listHouse.get(indexCustomer - 1);
                customer.setServices(house);
                System.out.println("Success");
                input.nextLine();
                break;
            case "3":
                i = 1;
                ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomInformation();
                for (Room room : listRoom) {
                    System.out.println("-------------------");
                    System.out.println("No. " + i);
                    room.showInfo();
                    System.out.println("-------------------");
                    i++;
                }
                int indexRoom = FuntionValidate.checkValidateIntergerNumber("CHoose Room","invalid!!");
                while (indexRoom > listRoom.size()){
                    System.out.println("invalid!!");
                    indexRoom = FuntionValidate.checkValidateIntergerNumber("CHoose Room","invalid!!");
                }
                Room room = listRoom.get(indexRoom - 1);
                customer.setServices(room);
                System.out.println("Success");
                input.nextLine();
                break;
            case "4":
                addNewBookingResort();
                break;
            case "5":
                displayMainMenu();
                break;
            default:
                System.out.println("invalid");

        }
        ArrayList<Customer> listBooking = FuncWriteAndReadFileCSV.getCustomerBookingInofrmation();
        listBooking.add(customer);
        FuncWriteAndReadFileCSV.writeBookingToCSV(listBooking);
        displayMainMenu();

    }

    private static void showAllVillaServices() {
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaInformation();
        System.out.println("===============");
        for (Villa villa : listVilla) {
            villa.showInfo();
            System.out.println("===============");
        }
        displayMainMenu();
    }

    private static void showAllHouseServices() {
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseInformation();
        System.out.println("===============");
        for (House house : listHouse) {
            house.showInfo();
            System.out.println("===============");
        }
        displayMainMenu();
    }

    private static void showAllRoomServices() {
        ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomInformation();
        System.out.println("===============");
        for (Room room : listRoom) {
            room.showInfo();
            System.out.println("===============");
        }
        displayMainMenu();
    }

    private static void showInfomationCustomer() {
        ArrayList<Customer> listCustomer = FuncWriteAndReadFileCSV.getCustomerInformation();
        System.out.println("===============");
        for (Customer customer : listCustomer) {
            customer.showInfo();
            System.out.println("===============");
        }
        displayMainMenu();
    }

    private static void showBookingResort() {
    }
    private static void showAllVillaNameNotDuplicate(){
        String pathVilla = "src/Data/Villa.csv";
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)){
            System.out.println("File not exists!!");
            input.nextLine();
            displayMainMenu();
        } else {
            TreeSet<String> listVillaTreeSet = FuncWriteAndReadFileCSV.getFullNameServices(pathVilla);
            System.out.println("List not Duplicate");
            for (String str : listVillaTreeSet){
                System.out.println("-----------------");
                System.out.println(str);
                System.out.println("-----------------");
            }
        }
    }
}
