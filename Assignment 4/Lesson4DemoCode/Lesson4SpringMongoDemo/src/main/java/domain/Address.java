package domain;

public class Address {
    private Long id;
    private String street;
    private String city;
    private String zip;

    public Address() {
    }

    public Address(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street +
                ", city='" + city +
                ", zip='" + zip +
                '}';
    }
}
