package lt.viko.eif.lvalskis.hotel.model;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlRootElement;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Represents Booking object which has id, guestId, roomId, employeeId, checkIn, checkOut, price, status.
 * This class is responsible for getting, setting values of Booking object variables and printing them.
 */
@XmlRootElement
public class Booking {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private int guestId;
    private int roomId;
    private int employeeId;
    private Date checkIn;
    private Date checkOut;
    private int price;
    private String status;

    private Booking booking;

    public Booking() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
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
                        "Guest ID: %s\n\t\t" +
                        "Room ID: %s\n\t\t" +
                        "Employee ID: %s\n\t\t" +
                        "Check In: %s\n\t\t" +
                        "Check Out: %s\n\t\t" +
                        "Price: %s\n\t\t" +
                        "Status: %s",
                this.id,
                this.guestId,
                this.roomId,
                this.employeeId,
                this.checkIn,
                this.checkOut,
                this.price,
                this.status);
    }

    private String constructorBookingString() {
        return String.format("INSERT INTO booking (guestId, roomId, employeeId, checkIn, checkOut, price, status) VALUES (%d, %d, %d, '%s', '%s', %d, '%s')",
                this.guestId,
                this.roomId,
                this.employeeId,
                this.checkIn,
                this.checkOut,
                this.price,
                this.status);
    }

}
