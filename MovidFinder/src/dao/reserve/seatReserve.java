package dao.reserve;

import dto.dto;
import dto.memberDTO;
import dto.movieDTO;
import dto.seatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class seatReserve {
    protected seatReserve() {
        try {
            Connection conn = dto.makeConnection();
            String sql = "update reservation set reserved=? ,seatnumber=?, id=?, pointer=? where num =? ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setBoolean(1, true);
            stmt.setString(2, seatDto.getResult());
            stmt.setString(3, memberDTO.getId());
            stmt.setInt(4, movieDTO.getPointer());
            stmt.setInt(5, movieDTO.getReservation());
            stmt.executeUpdate();
            movieDTO.setReserved(true);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
