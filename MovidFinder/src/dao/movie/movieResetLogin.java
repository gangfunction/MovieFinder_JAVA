package dao.movie;

import dto.dto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class movieResetLogin {
    protected movieResetLogin() {
        try{
        String sql = "update member set isin = 0";
        PreparedStatement stmt = dto.makeConnection().prepareStatement(sql);
        stmt.executeUpdate();
        }
        catch(SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
