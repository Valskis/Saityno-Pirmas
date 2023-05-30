package lt.viko.eif.lvalskis.hotel.Util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Represents a Server object that sends a file to the client.
 */
public class Server {
    public static void main(String[] args) {
        int port = 1234;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started. Listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected: " + socket.getInetAddress().getHostAddress());

                File xmlFile = new File("C:\\Users\\gtluk\\OneDrive\\Stalinis kompiuteris\\Viesbutis\\src\\main\\java\\org\\example\\generated.xml");
                byte[] fileData = new byte[(int) xmlFile.length()];

                FileInputStream fileInputStream = new FileInputStream(xmlFile);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                bufferedInputStream.read(fileData, 0, fileData.length);

                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(fileData, 0, fileData.length);
                outputStream.flush();

                System.out.println("File sent to the client.");

                bufferedInputStream.close();
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
