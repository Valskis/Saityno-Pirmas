package lt.viko.eif.lvalskis.hotel.Tests;

import lt.viko.eif.lvalskis.hotel.model.Booking;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * Represents a BookingTest object that tests Booking class.
 */
public class BookingTest {

    @Test
    public void testSetAndGetId() {
        Booking booking = new Booking();
        int id = 1;
        booking.setId(id);
        Assertions.assertEquals(id, booking.getId());
    }

    @Test
    public void testSetAndGetGuestId() {
        Booking booking = new Booking();
        int guestId = 1;
        booking.setGuestId(guestId);
        Assertions.assertEquals(guestId, booking.getGuestId());
    }

    @Test
    public void testSetAndGetRoomId() {
        Booking booking = new Booking();
        int roomId = 1;
        booking.setRoomId(roomId);
        Assertions.assertEquals(roomId, booking.getRoomId());
    }

    @Test
    public void testSetAndGetEmployeeId() {
        Booking booking = new Booking();
        int employeeId = 1;
        booking.setEmployeeId(employeeId);
        Assertions.assertEquals(employeeId, booking.getEmployeeId());
    }

    @Test
    public void testSetAndGetCheckIn() {
        Booking booking = new Booking();
        Date checkIn = new Date();
        booking.setCheckIn(checkIn);
        Assertions.assertEquals(checkIn, booking.getCheckIn());
    }

    @Test
    public void testSetAndGetCheckOut() {
        Booking booking = new Booking();
        Date checkOut = new Date();
        booking.setCheckOut(checkOut);
        Assertions.assertEquals(checkOut, booking.getCheckOut());
    }

    @Test
    public void testSetAndGetPrice() {
        Booking booking = new Booking();
        int price = 1;
        booking.setPrice(price);
        Assertions.assertEquals(price, booking.getPrice());
    }

    @Test
    public void testSetAndGetStatus() {
        Booking booking = new Booking();
        String status = "status";
        booking.setStatus(status);
        Assertions.assertEquals(status, booking.getStatus());
    }
}
