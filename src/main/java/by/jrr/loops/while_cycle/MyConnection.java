package by.jrr.loops.while_cycle;

import com.sun.jdi.connect.spi.Connection;

import java.io.IOException;

public class MyConnection {

    private static Connection connection;

    public static Connection getConnection() {
        if(connection == null) {
            return new Connection() {
                @Override
                public byte[] readPacket() throws IOException {
                    return new byte[0];
                }

                @Override
                public void writePacket(byte[] bytes) throws IOException {

                }

                @Override
                public void close() throws IOException {

                }

                @Override
                public boolean isOpen() {
                    return false;
                }
            };
        }
        return connection;
    }
}
