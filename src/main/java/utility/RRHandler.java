package utility;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class RRHandler {


    static Socket socket;
    static Sender sender;

    public RRHandler(Socket socket, Sender sender) {
        RRHandler.socket = socket;
        RRHandler.sender = sender;
    }

    public static Socket getSocket() {
        return socket;
    }

    public static void setSocket(Socket socket) {
        RRHandler.socket = socket;
    }

    public static Sender getSender() {
        return sender;
    }

    public static void setSender(Sender sender) {
        RRHandler.sender = sender;
    }

    public static void res(String result) {
        try {
            OutputStream outputStream = socket.getOutputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objOut = new ObjectOutputStream(byteArrayOutputStream);
            objOut.writeObject(new ObjectForServer(result));
            objOut.flush();
            byteArrayOutputStream.writeTo(outputStream);
            byteArrayOutputStream.reset();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void resB(boolean result) {
        try {
            OutputStream outputStream = socket.getOutputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objOut = new ObjectOutputStream(byteArrayOutputStream);
            objOut.writeObject(new ObjectForServer(result));
            objOut.flush();
            byteArrayOutputStream.writeTo(outputStream);
            byteArrayOutputStream.reset();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}


