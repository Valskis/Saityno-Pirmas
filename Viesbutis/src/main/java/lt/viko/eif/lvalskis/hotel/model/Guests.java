package lt.viko.eif.lvalskis.hotel.model;

import jakarta.xml.bind.annotation.XmlRootElement;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Represents Guests object which has id, name, surname, email, address, checkIn, checkOut,
 * roomNumber, adults, children, price and status variables and their getters and setters.
 * This class is responsible for getting, setting and printing Guests object variables.
 */
@XmlRootElement
public class Guests {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private String name;
    private String surname;
    private String email;
    private String address;
    private String checkIn;
    private String checkOut;
    private int roomNumber;
    private int adults;
    private int children;
    private int price;
    private String status;

    public Guests() {
    }


    public Guests(int id, String name, String surname, String email, String address, String checkIn, String checkOut, int roomNumber, int adults, int children, int price, String status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomNumber = roomNumber;
        this.adults = adults;
        this.children = children;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("\tID: %s\n\t\t" +
                        "Name: %s\n\t\t" +
                        "Surname: %s\n\t\t" +
                        "Email: %s\n\t\t" +
                        "Address: %s\n\t\t" +
                        "Check in: %s\n\t\t" +
                        "Check out: %s\n\t\t" +
                        "Room number: %s\n\t\t" +
                        "Adults: %s\n\t\t" +
                        "Children: %s\n\t\t" +
                        "Price: %s\n\t\t" +
                        "Status: %s",
                this.id,
                this.name,
                this.surname,
                this.email,
                this.address,
                this.checkIn,
                this.checkOut,
                this.roomNumber,
                this.adults,
                this.children,
                this.price,
                this.status);
    }

    private String constructorGuestString() {
        return String.format("INSERT INTO guests (name, surname, email, address, checkIn, checkOut, roomNumber, adults, children, price, status) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', %s, %s, %s, %s, '%s')",
                this.name,
                this.surname,
                this.email,
                this.address,
                this.checkIn,
                this.checkOut,
                this.roomNumber,
                this.adults,
                this.children,
                this.price,
                this.status);
    }


}

