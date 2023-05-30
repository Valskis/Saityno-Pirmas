package lt.viko.eif.lvalskis.hotel.Tests;

import lt.viko.eif.lvalskis.hotel.model.Rooms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Represents a RoomsTest object that tests Rooms class.
 */
public class RoomsTest {

    @Test
    public void testSetAndGetId() {
        Rooms room = new Rooms();
        int id = 1;
        room.setId(id);
        Assertions.assertEquals(id, room.getId());
    }

    @Test
    public void testSetAndGetRoomNumber() {
        Rooms room = new Rooms();
        int roomNumber = 101;
        room.setRoomNumber(roomNumber);
        Assertions.assertEquals(roomNumber, room.getRoomNumber());
    }

}