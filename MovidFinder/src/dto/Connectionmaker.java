package dto;

import java.sql.Connection;
import java.sql.SQLException;

public interface Connectionmaker {
    Connection makeConnection() throws ClassNotFoundException, SQLException;
}