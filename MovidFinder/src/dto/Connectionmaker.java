package dto;

import java.sql.Connection;
import java.sql.SQLException;

public interface Connectionmaker {
    static Connection makeConnection() throws ClassNotFoundException, SQLException {
        return null;
    }


}
