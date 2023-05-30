package lt.viko.eif.lvalskis.hotel.Tests;

import lt.viko.eif.lvalskis.hotel.model.Guests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Represents a GuestsTest object that tests Guests class.
 */
public class GuestsTest {

    @Test
    public void testSetAndGetId() {
        Guests guest = new Guests();
        int id = 1;
        guest.setId(id);
        Assertions.assertEquals(id, guest.getId());
    }

    @Test
    public void testSetAndGetName() {
        Guests guest = new Guests();
        String name = "John";
        guest.setName(name);
        Assertions.assertEquals(name, guest.getName());
    }

    @Test
    public void testSetAndGetSurname() {
        Guests guest = new Guests();
        String surname = "Doe";
        guest.setSurname(surname);
        Assertions.assertEquals(surname, guest.getSurname());
    }

    @Test
    public void testSetAndGetEmail() {
        Guests guest = new Guests();
        String email = "test@gmail.com";
        guest.setEmail(email);
        Assertions.assertEquals(email, guest.getEmail());
    }

    @Test
    public void testSetAndGetAddress() {
        Guests guest = new Guests();
        String address = "Test address";
        guest.setAddress(address);
        Assertions.assertEquals(address, guest.getAddress());
    }

    @Test
    public void testSetAndGetCheckIn() {
        Guests guest = new Guests();
        String checkIn = "2021-05-05";
        guest.setCheckIn(checkIn);
        Assertions.assertEquals(checkIn, guest.getCheckIn());
    }

    @Test
    public void testSetAndGetCheckOut() {
        Guests guest = new Guests();
        String checkOut = "2021-05-05";
        guest.setCheckOut(checkOut);
        Assertions.assertEquals(checkOut, guest.getCheckOut());
    }

    @Test
    public void testSetAndGetPrice() {
        Guests guest = new Guests();
        int price = 100;
        guest.setPrice(price);
        Assertions.assertEquals(price, guest.getPrice());
    }

    @Test
    public void testSetAndGetStatus() {
        Guests guest = new Guests();
        String status = "Checked in";
        guest.setStatus(status);
        Assertions.assertEquals(status, guest.getStatus());
    }

}
