package dao.rescan;

import dto.dto;
import dto.movieDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class movieCanUpdate {
    protected movieCanUpdate() throws SQLException, ClassNotFoundException {
        Connection conn = dto.makeConnection();
        String sql = "update movie set audience=? where num =? ";
        PreparedStatement stmt = conn.prepareStatement(sql);
        movieDTO.canAudience();
        stmt.setInt(1, movieDTO.getAudience());
        stmt.setInt(2, movieDTO.getPointer());
        stmt.executeUpdate();
        System.out.println("예약이 취소되었습니다.");
    }
}
