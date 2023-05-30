package lt.viko.eif.lvalskis.hotel.Util;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 * Represents a Client object that connects to the server and receives a file.
 */
public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 1234;

        try {
            Socket socket = new Socket(serverAddress, serverPort);

            byte[] fileData = new byte[1024];
            InputStream inputStream = socket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\gtluk\\OneDrive\\Stalinis kompiuteris\\Viesbutis\\src\\main\\java\\org\\example\\recieved.xml");

            int bytesRead;
            while ((bytesRead = inputStream.read(fileData)) != -1) {
                fileOutputStream.write(fileData, 0, bytesRead);
            }

            System.out.println("File received from the server.");

            fileOutputStream.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
