package Commons;

import Models.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

public class FuncWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.csv";
    private static final String pathHouse = "src/Data/House.csv";
    private static final String pathRoom = "src/Data/Room.csv";
    private static final String pathCustomer = "src/Data/Customer.csv";
    private static final String pathBooking = "src/Data/Booking.csv";
    private static final int NUMBER_OF_Line_Skip = 1;
    //String id, String servicesName, int area, int rentCost, byte maxNumberOfCustomer, String kindOfRent, String roomStandar, String anotherConvenient, int numberOfFloor
    //String id, String servicesName, int area, int rentCost, byte maxNumberOfCustomer, String kindOfRent, String roomStandar, String anotherConvenient, int numberOfFloor, int swimmingPoolArea
    //String id, String servicesName, int area, int rentCost, byte maxNumberOfCustomer, String kindOfRent, String includeFreeServices
    //String id, String nameCustomer, String dateOfBirthCustomer, String genderCustomer, float idCard, float phoneNumber, String emailCustomer, String typeOfCustomer, String addressCustomer
    //String id, String servicesName, double area, int rentCost, int maxNumberOfCustomer, String kindOfRent
    private static String[] headerRecordVilla = new String[]{"id", "servicesName", "area", "rentCost", "maxNumberOfCustomer", "kindOfRent", "roomStandar", "anotherConvenient", "numberOfFloor", "swimmingPoolArea"};
    private static String[] headerRecordHouse = new String[]{"id", "servicesName", "area", "rentCost", "maxNumberOfCustomer", "kindOfRent", "roomStandar", "anotherConvenient", "numberOfFloor"};
    private static String[] headerRecordRoom = new String[]{"id", "servicesName", "area", "rentCost", "maxNumberOfCustomer", "kindOfRent", "includeFreeServices"};
    private static String[] headerRecordCustomer = new String[]{"id", "nameCustomer", "dateOfBirthCustomer", "genderCustomer", "idCard", "phoneNumber", "emailCustomer", "typeOfCustomer", "addressCustomer"};
    private static String[] headerRecordBooking = new String[]{"id", "nameCustomer", "dateOfBirthCustomer", "genderCustomer", "idCard", "phoneNumber", "emailCustomer", "typeOfCustomer", "addressCustomer", "id", "servicesName", "area", "rentCost", "maxNumberOfCustomer", "kindOfRent"};
    //PrintWriter pw = new PrintWriter(new FileWriter("customer.csv", true));
    public static void writeVillaToCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);

             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]
                        {
                                villa.getId(),
                                villa.getServicesName(),
                                String.valueOf(villa.getArea()),
                                String.valueOf(villa.getRentCost()),
                                String.valueOf(villa.getMaxNumberOfCustomer()),
                                villa.getKindOfRent(),
                                villa.getRoomStandar(),
                                villa.getAnotherConvenient(),
                                String.valueOf(villa.getNumberOfFloor()),
                                String.valueOf(villa.getSwimmingPoolArea())
                        }
                );
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeHouseToCSV(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]
                        {
                                house.getId(),
                                house.getServicesName(),
                                String.valueOf(house.getArea()),
                                String.valueOf(house.getRentCost()),
                                String.valueOf(house.getMaxNumberOfCustomer()),
                                house.getKindOfRent(),
                                house.getRoomStandar(),
                                house.getAnotherConvenient(),
                                String.valueOf(house.getNumberOfFloor()),
                        }
                );
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void writeRoomToCSV(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]
                        {
                                room.getId(),
                                room.getServicesName(),
                                String.valueOf(room.getArea()),
                                String.valueOf(room.getRentCost()),
                                String.valueOf(room.getMaxNumberOfCustomer()),
                                room.getKindOfRent(),
                                room.getIncludeFreeServices(),

                        }
                );
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeCustomerToCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathCustomer);

             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordCustomer);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]
                        {
                                customer.getId(),
                                customer.getNameCustomer(),
                                customer.getDateOfBirthCustomer(),
                                customer.getGenderCustomer(),
                                String.valueOf(customer.getIdCard()),
                                String.valueOf(customer.getPhoneNumber()),
                                customer.getEmailCustomer(),
                                customer.getTypeOfCustomer(),
                                customer.getAddressCustomer()
                        }
                );
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeBookingToCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathBooking);

             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordBooking);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]
                        {
                                customer.getId(),
                                customer.getNameCustomer(),
                                customer.getDateOfBirthCustomer(),
                                customer.getGenderCustomer(),
                                String.valueOf(customer.getIdCard()),
                                String.valueOf(customer.getPhoneNumber()),
                                customer.getEmailCustomer(),
                                customer.getTypeOfCustomer(),
                                customer.getAddressCustomer(),
                                customer.getServices().getId(),
                                customer.getServices().getServicesName(),
                                String.valueOf(customer.getServices().getArea()),
                                String.valueOf(customer.getServices().getRentCost()),
                                String.valueOf(customer.getServices().getMaxNumberOfCustomer()),
                                String.valueOf(customer.getServices().getKindOfRent())
                        }
                );
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Villa> getVillaInformation() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUMBER_OF_Line_Skip)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }

    public static ArrayList<House> getHouseInformation() {
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathHouse);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUMBER_OF_Line_Skip)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }

    public static ArrayList<Room> getRoomInformation() {
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathRoom);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUMBER_OF_Line_Skip)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }

    public static ArrayList<Customer> getCustomerInformation() {
        Path path = Paths.get(pathCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathCustomer);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUMBER_OF_Line_Skip)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }

    public static ArrayList<Customer> getCustomerBookingInofrmation(){
//        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
//        try (Reader reader = new FileReader(pathBooking);
//             CSVReader csvReader = new CSVReader(reader);
//        ) {
//            String[] line;
//            csvReader.skip(1);
//            while ((line = csvReader.readNext()) != null) {
//                Customer customer = new Customer();
//                Villa villa = new Villa();
//                customer.setId((line[0]));
//                customer.setNameCustomer(line[1]);
//                customer.setDateOfBirthCustomer(line[2]);
//                customer.setGenderCustomer(line[3]);
//                customer.setIdCard(Integer.parseInt(line[4]));
//                customer.setPhoneNumber(Float.parseFloat(line[5]));
//                customer.setEmailCustomer(line[6]);
//                customer.setTypeOfCustomer(line[7]);
//                customer.setAddressCustomer(line[8]);
//                listCustomer.add(customer);
//            }
//        } catch (
//                IOException e) {
//            System.out.println(e.getMessage());
//        }
//        return listCustomer;
        Path path = Paths.get(pathBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathBooking);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordBooking);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathBooking))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUMBER_OF_Line_Skip)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }
    public static String getServicesNameCSV(String csvLine){
        String name = "";
        if (csvLine != null){
            String[] splitData = csvLine.split(",");
            name = splitData[1];
        }
        return name;
    }
    public static TreeSet<String> getFullNameServices(String path){
        BufferedReader br =null;
        TreeSet<String> result = new TreeSet<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(path));
            while ((br.readLine() != null)){
                line = br.readLine();
                if (getServicesNameCSV(line).equals("servicesName")){
                    continue;
                }
                result.add(getServicesNameCSV(line));

            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return result;

    }
}
