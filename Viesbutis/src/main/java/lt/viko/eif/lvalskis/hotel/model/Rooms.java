package lt.viko.eif.lvalskis.hotel.model;

import jakarta.xml.bind.annotation.XmlRootElement;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Represents Rooms object which has id, roomNumber, floor, beds, type, price and status variables and their getters and setters.
 * This class is responsible for getting, setting and printing Rooms object variables.
 */
@XmlRootElement
public class Rooms {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private int roomNumber;
    private int floor;
    private int beds;
    private String type;
    private int price;
    private String status;


    public Rooms() {
    }


    public Rooms(int id, int roomNumber, int floor, int beds, String type, int price, String status) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.beds = beds;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                        "Room Number: %s\n\t\t" +
                        "Floor: %s\n\t\t" +
                        "Beds: %s\n\t\t" +
                        "Type: %s\n\t\t" +
                        "Price: %s\n\t\t" +
                        "Status: %s",
                this.id,
                this.roomNumber,
                this.floor,
                this.beds,
                this.type,
                this.price,
                this.status);
    }

    private String constructorRoomsString() {
        return String.format("Rooms(%s, %s, %s, %s, %s, %s, %s)",
                this.id,
                this.roomNumber,
                this.floor,
                this.beds,
                this.type,
                this.price,
                this.status);
    }
}
