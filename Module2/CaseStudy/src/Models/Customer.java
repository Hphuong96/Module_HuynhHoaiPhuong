package Models;

public class Customer implements Comparable<Customer> {
    private String id;
    private String nameCustomer;
    private String dateOfBirthCustomer;
    private String genderCustomer;
    private int idCard;
    private float phoneNumber;
    private String emailCustomer;
    private String typeOfCustomer;
    private Services services;

    public Customer() {
    }

    private String addressCustomer;

    public Customer(String id, String nameCustomer, String dateOfBirthCustomer, String genderCustomer, int idCard, float phoneNumber, String emailCustomer, String typeOfCustomer, String addressCustomer, Services services) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.dateOfBirthCustomer = dateOfBirthCustomer;
        this.genderCustomer = genderCustomer;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.emailCustomer = emailCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.addressCustomer = addressCustomer;
        this.services = services;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDateOfBirthCustomer() {
        return dateOfBirthCustomer;
    }

    public void setDateOfBirthCustomer(String dateOfBirthCustomer) {
        this.dateOfBirthCustomer = dateOfBirthCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public float getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(float phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public void showInfo() {
        System.out.println("\n1.Id :" + this.getId() +
                "\n2. Customer Name :" + this.getNameCustomer() +
                "\n3. Customer Gender :" + this.getGenderCustomer() +
                "\n4. Customer Id Card :" + this.getIdCard() +
                "\n5: Customer Phone Number :" + this.getPhoneNumber() +
                "\n6: Customer email : " + this.getEmailCustomer() +
                "\n7: Customer Type : " + this.getTypeOfCustomer() +
                "\n8: Customer Address : " + this.getAddressCustomer());
    }

    public int compareTo(Customer customer) {
        return this.nameCustomer.compareTo(customer.getNameCustomer());
    }

}
