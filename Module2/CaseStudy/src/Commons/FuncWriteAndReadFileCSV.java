package Commons;

import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
public class FuncWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.csv";
    private static final String pathHouse = "src/Data/House.csv";
    private static final String pathRoom = "src/Data/Room.csv";
    private static final int NUMBER_OF_Line_Skip = 1;
    //String id, String servicesName, int area, int rentCost, byte maxNumberOfCustomer, String kindOfRent, String roomStandar, String anotherConvenient, int numberOfFloor
    //String id, String servicesName, int area, int rentCost, byte maxNumberOfCustomer, String kindOfRent, String roomStandar, String anotherConvenient, int numberOfFloor, int swimmingPoolArea
    //String id, String servicesName, int area, int rentCost, byte maxNumberOfCustomer, String kindOfRent, String includeFreeServices
    private static String[] headerRecordVilla = new String[]{"id", "servicesName", "area", "rentCost", "maxNumberOfCustomer", "kindOfRent", "roomStandar", "anotherConvenient", "numberOfFloor", "swimmingPoolArea"};
    private static String[] headerRecordHouse = new String[]{"id", "servicesName", "area", "rentCost", "maxNumberOfCustomer", "kindOfRent", "roomStandar", "anotherConvenient", "numberOfFloor"};
    private static String[] headerRecordRoom = new String[]{"id", "servicesName", "area", "rentCost", "maxNumberOfCustomer", "kindOfRent","includeFreeServices"};
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
    public static void writeRoomToCSV(ArrayList<Room> arrayList){
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
    public static ArrayList<Room> getRoomInformation(){
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
}
